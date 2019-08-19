# Abstract

**Java files:**
* Main.java
* Ligurian.java
* OliveColor.java
* Kalamata.java
* OliveName.java
* OlivePress.java
* Press.java
* Olive.java

**Source description:** Lynda.com Java 8 Essential Training exercise on abstract classes and methods

**Summary:** Presses oil from different types of olives. Outputs the starting amount of oil, the olive type, place of origin, amount of oil extracted, and the total amount of oil. Uses different packages to encapsulate classes. Uses enums rather than constants. Extends classes with super (Olive) and sub (Kalamata, Ligurian) classes and overrides methods. Uses interface to abstract methods implemented in Olive class.

**Main.java:** main method creates instance of List interface and adds olives and info about olives to the list. Creates instance of Press interface, sets amount of oil before olives are crushed, prints total amount of oil (pre- and post-crush amount).

**Ligurian.java:** Subclass of Olive class (i.e., extends Olive class). Constructor calls Olive class and passes arguments. Implements abstract method getOrigin in the Olive class.

**OliveColor.java:** Enums for olive colors, variables, constructor method that passes parameters toString method returns the translated enum.

**Kalamata.java:** Subclass of Olive class that implements abstract method getOrigin in the Olive class. Implements abstract method getOrigin in the Olive class.

**OliveName.java:** Enums for olive names, private variable accessible only in this class, constructor method that passes parameter. toString method returns the translated enum.

**OlivePress.java:** OlivePress class implements Press interface, which allows it access to the methods in the interface. Interface (contract or blueprint) that defines a set up abstract methods (only signature, no body). Contains body (code to execute) for abstract methods getOil and setOil. getOil method overrides getOil method in Press interface. Sets totalOil variable, loops over olives collection, and adds the amount of oil pressed from the olives. setOil method overrides setOil method in Press interface.

**Press.java:** Press interface. Contract or blueprint that defines a set of abstract methods to be used, but keeps implementation of methods private. Cannot be instantiated, only implemented by other classes.

**Olive.java:** Abstract class contains abstract methods that are implemented in subclasses. private variables accessible only in this class, constructor method that passes parameters. crush method prints message with name and oil variables and by calling getOrigin method. Returns oil. getOrigin method abstract method implemented in subclasses Kalamata and Ligurian.

Date: May 2019