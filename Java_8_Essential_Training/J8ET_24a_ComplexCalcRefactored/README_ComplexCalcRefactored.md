# ComplexCalcRefactored

**Java files:**
* Calculator.java
* MathHelper.java

**Source description:** Project that builds on Lynda.com Java 8 Essential Training exercise challenge: Complex Calculator

**Summary:** Creates a calculator that takes user input for numbers and operations, adds exception handling, performs calculations, and outputs results. Uses nested class for getInput method. Refactored content: combined check of operation types and calculations in separate class.

***Calculator.java:** main method creates instance of Calculator class and calls calculate method. calculate method creates instance of InputHelper class, variables for user input, exception handling for numeric values, and calls operation method in the MathHelper class. Nested InputHelper class contains getInput method that gets user input and outputs it.

** MathHelper.java:** add, subtract, multiply, and divide methods use BigDecimal class to convert input and add, subtract, multiply, or divide converted numbers. operation method checks operation type entered, calls method based on operation type, performs exception handling for input, and outputs result of calculation.

Date: May 2019