@echo off
REM Compile all Java files
javac Main.java Quote.java QuoteManager.java

REM Check if the compilation was successful
if %ERRORLEVEL% NEQ 0 (
    echo Compilation failed.
    exit /b %ERRORLEVEL%
)

REM Run the Main class
java Main

REM Pause to view output before closing
pause
