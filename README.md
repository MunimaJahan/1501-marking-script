# Marking Scripts for COMP1501

## BACKGROUND

I'm looking for a way to put student source files for a given assessment (assignment, coding quiz) through automated jUnit tests + static code analysis (currently with PMD, Checkstyle, and SpotBugs).

This is the result. It's a work in progress.

## PRIOR TO STARTING

On the instructor end, you'll need to assemble the following files for **each** assessment:

- the jUnit tests for the assessment
- the Checkstyle rules xml file
- the PMD rules xml file
- any additional jars that the assessment needs


## Instructions

1. clone https://github.com/mru-csis-1501-201904-001/marking.script

1. remove any old tests from **instructor_files\tests\** and put the junit tests in there

1. modify the `--class-path` part (`--class-path "bin;tests;jars\assertj-core-3.13.2.jar"`) of the `markOne.bat` file used to run the jUnit tests to add any other jars needed to run the assessment

1. put the Checkstyle and PMD rules xml files into **rules\\**

1. add any additional assessment jars into **asg_jars\\**

1. pull down the assessment repos for all students using GitHub's Classroom Assistant; put these into a director called **student_files\\**

   ```
    ├───instructor_files
    │   ├───asg_jars
    │   ├───rules
    │   ├───testing_libs
    │   └───tests
    └───student_files
        ├───blunxy.bad.1
        │   └───src
        ├───blunxy.bad.2
        │   └───src
        └───blunxy.good
            └───src
   ```

1. from the root of the marking directory, run `markAll.bat`

1. results for each set of static code checks and unit test results will be placed in each student directory as `testing-results.txt`

