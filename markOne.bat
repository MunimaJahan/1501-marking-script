:: first off: do all static analysis (checkstyle, pmd, cpd, and spotbugs) on the src dir contents only - no tests files!
rmdir /S /Q bin 2>nul
rmdir /S /Q tests 2>nul
rmdir /S /Q jars 2>nul

:: extra step you haven't done yet: copy **my** tests directory over! (to avoid student tampering)
robocopy /E  ..\..\instructor_files\tests .\tests /NFL /NDL /NJH /NJS /nc /ns /np
robocopy /E  ..\..\instructor_files\asg_jars .\jars /NFL /NDL /NJH /NJS /nc /ns /np

echo COMPILE > testing-results.txt

javac -d bin -cp "src;jars/*" src/*.java >> testing-results.txt 2>&1

:: https://spotbugs.readthedocs.io/en/stable/running.html#executing-spotbugs
:: 
:: If there are bugs being reported by Spotbugs, you can add to the spotbugs-3.1.12\bin\excludeTheseBugs.xml file;
:: you just need the identifier (like DM_CONVERT_CASE) that is spit out
:: echo SPOTBUGS >> testing-results.txt
:: call ..\..\instructor_files\testing_libs\spotbugs-3.1.12\bin\spotbugs.bat -textui -sortByClass -low -effort:min -longBugCodes -exclude ..\..\instructor_files\testing_libs\spotbugs-3.1.12\bin\excludeTheseBugs.xml -auxclasspath jars -sourcepath src bin >> testing-results.txt


:: https://pmd.github.io/latest/pmd_userdocs_installation.html
:: if you want to leave out any specific files from pmd testing, you can put them in the rules xml file
:: For example, if you look at the current pmd xml file I have, there's an exclusion for one file done
:: like so: <exclude-pattern>.*/src/NullWebDriver.java</exclude-pattern>
::
echo PMD >> testing-results.txt
call ..\..\instructor_files\testing_libs\pmd-bin-6.17.0\bin\pmd.bat -dir src -auxclasspath jars -R ..\..\instructor_files\rules\1501-pmd-rules.xml -no-cache >> testing-results.txt

:: https://checkstyle.sourceforge.io/cmdline.html
::
echo CHECKSTYLE >> testing-results.txt
java -jar ..\..\instructor_files\testing_libs\checkstyle-8.23-all.jar -c ..\..\instructor_files\rules\1501-checkstyle-rules.xml src/*.java >> testing-results.txt

echo UNIT TESTS >> testing-results.txt
:: now run the unit tests
:: https://junit.org/junit5/docs/current/user-guide/#running-tests-console-launcher-options
::
javac -d bin -cp "tests;src;jars/*" tests/*.java src/*.java

java -jar ..\..\instructor_files\testing_libs\junit-platform-console-standalone-1.3.0-M1.jar --class-path "bin;tests" --scan-class-path --details=tree --disable-ansi-colors >> testing-results.txt
