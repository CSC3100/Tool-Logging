![Static Badge](https://img.shields.io/badge/author-javiergs-orange)
![GitHub repo size](https://img.shields.io/github/repo-size/CSC3100/Tool-Logging)

# SL4J Logback
A simple Java class that demonstrates logging at various levels (trace, debug, info, warn, error) using SLF4J. The project is managed using Maven and includes several dependencies for logging and JSON processing. The `logback.xml` file configures the logging behavior, including different appenders and their formats.

## ConsoleAppender
Two examples are provided:
     - `CONSOLE_JSON`: Logs in JSON format to the console.
     - `CONSOLE_TXT`: Logs in plain text format to the console.

## FileAppender

Logs in plain text format to a file.

## HttpAppender

A Custom HTTP appender for sending logs to an HTTP endpoint with a bearer token for authentication (`src/main/java/javiergs/HttpAppender.java`).


## LogtailAppender
