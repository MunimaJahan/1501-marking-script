@ECHO off

FOR /D %%G in ("student_files\*") DO (

    ECHO START MARKING %%~dpG%%~nxG

    ROBOCOPY . %%~dpG%%~nxG markOne.bat /NFL /NDL /NJH /NJS /nc /ns /np
    
    cd %%~dpG%%~nxG

    CALL markOne.bat

    rmdir /S /Q bin 2>nul
    rmdir /S /Q tests 2>nul
    rmdir /S /Q jars 2>nul
    del /Q markOne.bat 2>nul

    ECHO DONE MARKING %%~dpG%%~nxG

    cd ..\..
)

