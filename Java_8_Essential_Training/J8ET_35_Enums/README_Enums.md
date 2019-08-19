# Enums

**Java files:**
* Main.java
* OliveName.java
* OlivePress.java
* Olive.java

**Source description:** Lynda.com Java 8 Essential Training exercise on enums

**Summary:** Presses oil from different types of olives. Outputs the olive name and the total amount of oil pressed. Uses different packages to encapsulate classes. Uses enums rather than constants.

**Main.java:** main method creates instance of List interface and adds olives and info about olives to the list. Creates instance of OlivePress class, sets amount of oil to amount pressed from olives, and prints the amount.

**OliveName.java:** Enums for olive names, private variable accessible only in this class, constructor method that passes parameter. toString method returns the translated enum.

**OlivePress.java:** getOil method sets totalOil variable, loops over olives collection, prints the name of each olive, and adds the amount of oil pressed from the olives.

**Olive.java:** private variables accessible only in this class, constructor method that passes arguments. getName method returns the name of the olives. getOil method returns the amount of oil pressed from the olives.

Date: May 2019