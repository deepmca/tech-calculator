# Calculator
Command Line Java Calculator

Set up as maven project 

## How to use

#Build

Run build.sh file for Mac

Run build.bat file for Windows


## Example Run on the command line
Use the jar generated by the build.

>java -jar target/tech-calculator-1.0-SNAPSHOT-jar-with-dependencies.jar 1 + 2 

##Other Example Data:

1 + 2             //equals 3

10 - 2            //equals 8

10 '*' 2          //equals 20

10 / 2            //equals 5 

#Known Issues

"\*" on the command line is interpreted by the shell as a wide-card character and it is replaced by the names of all the files in the current directory.
In order to avoid this we need to tell the shell to pass the \* as it is, for this we need to put * in quotes for example '\*'    