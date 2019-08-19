# Interfaces

**Java files:**
* Main.java
* Ligurian.java
* OliveColor.java
* Kalamata.java
* OliveName.java
* OlivePress.java
* Olive.java

**Source description:** Lynda.com Java 8 Essential Training exercise on interfaces

**Summary:** Presses oil from different types of olives. Outputs the olive name, the amount of oil pressed from each olive, and adds the total amount of oil pressed. Uses different packages to encapsulate classes. Uses enums rather than constants. Extends classes with super (Olive) and sub (Kalamata, Ligurian) classes and overrides methods Uses interface for abstract methods implemented in Olive class.

**Main.java:** main method creates instance of List interface and adds olives and info about olives to the list. Creates instance of Press interface, sets amount of oil before olives are crushed, prints total amount of oil (pre- and post-crush amount).

**Ligurian.java:** Subclass of Olive class (i.e., extends Olive class). Constructor calls Olive class and passes arguments.

**OliveColor.java:** Enums for olive colors, variables, constructor method that passes parameters toString method returns the translated enum.

**Kalamata.java:** Subclass of Olive class (i.e., extends Olive class). Constructor calls Olive class constructor and passes arguments.

**OliveName.java:** Enums for olive names, private variable accessible only in this class, constructor method that passes parameter. toString method returns the translated enum.

**OlivePress.java:** OlivePress class implements Press interface, which allows it access to the methods in the interface. Interface (contract or blueprint) that defines a set up abstract methods (only signature, no body). Contains body (code to execute) for abstract methods getOil and setOil. getOil method overrides getOil method in Press interface. Sets totalOil variable, loops over olives collection, and adds the amount of oil pressed from the olives. setOil method. overrides setOil method in Press interface.

**Press.java:** Press interface. Contract or blueprint that defines a set of abstract methods to be used, but keeps implementation of methods private. Cannot be instantiated, only implemented by other classes.

**Olive.java:** private variables accessible only in this class, constructor method that passes arguments. crush method returns the amount of oil pressed from the olives.

Date: May 2019