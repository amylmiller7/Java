# NestedClasses

**Java files:**
* Calculator.java
* MathHelper.java

**Source description:** Lynda.com Java 8 Essential Training exercise on nested classes

**Summary:** Defines classes nested within other classes. (Nested classes are only available to their parent classes.) Takes user input for numbers and operations, performs exception handling, performs calculations, and output results. Uses nested class, which logically groups classes, increases encapsulation, makes more readable/maintainable code. Operation methods divided into separate MathHelper class.

**Calculator.java:** main method creates variables for user input, exception handling for numeric values, and calls operation method. operation method checks operation type entered, calls method based on operation type, performs exception handling for input, and outputs result of calculation.

**MathHelper.java:** add, subtract, multiply, and divide methods use BigDecimal class to convert input and add, subtract, multiply, or divide converted numbers. 

Date: May 2019