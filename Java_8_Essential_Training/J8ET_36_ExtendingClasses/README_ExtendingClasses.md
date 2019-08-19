# ExtendingClasses

**Java files:**
* Main.java
* Ligurian.java
* OliveColor.java
* Kalamata.java
* OlivePress.java
* OliveName.java
* Olive.java

**Source description:** Lynda.com Java 8 Essential Training exercise on extending classes and overriding methods 

**Summary:** Presses oil from different types of olives. Outputs the olive name, the amount of oil pressed from each olive, and the total amount of oil pressed. Uses different packages to encapsulate classes. Uses enums rather than constants. Extends classes with super (Olive) and sub (Kalamata, Ligurian) classes and overrides methods.

**Main.java:** main method creates instance of List interface and adds olives and info about olives to the list. Creates instance of OlivePress class, sets amount of oil to amount pressed from olives, and prints the amount.

**Ligurian.java:** Subclass of Olive class (i.e., extends Olive class). Constructor calls Olive class constructor and passes arguments.

**OliveColor.java:** Enums for olive colors, private variable accessible only in this class, constructor method that passes parameter. toString method returns the translated enum.

**Kalamata.java:** Subclass of Olive class (i.e., extends Olive class). Constructor calls Olive class constructor and passes arguments.

**OlivePress.java:** getOil method sets totalOil variable, loops over olives collection, prints the name of each olive, and adds the amount of oil pressed from the olives.

**OliveName.java:** Enums for olive names, private variable accessible only in this class, constructor method that passes parameter. toString method returns the translated enum.

**Olive.java:** private variables accessible only in this class, constructor method that passes arguments. crush method returns the amount of oil pressed from the olives.

Date: May 2019