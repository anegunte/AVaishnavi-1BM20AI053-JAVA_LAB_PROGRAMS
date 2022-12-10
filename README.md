# AVaishnavi-1BM20AI053-JAVA_LAB_PROGRAMS
Java programs for Object Oriented Programming in Java course

1a.Design and create a class named Retail Item that holds data about an item in a retail store. The class should have the following fields: 
• Description - The description field references a String object that holds a brief description of the item. 
• Units - The units field is an int variable that holds the number of units currently in inventory. 
• Price - The price field is a double that holds the item’s retail price. 
Write a constructor that accepts arguments for each field, appropriate mutator methods that store values in these fields, and accessor methods that return the values in these fields. 
Write the main method which creates three Retail Item objects and invokes appropriate methods. 

1b.Write a class named Car that has the following data members: 
• model. The model field is an int that holds the car’s year. 
• make. The make field references a String object that holds the make of the car. 
• speed. The speed field is an int that holds the car’s current speed. 
The class should have the following constructor and other methods. 
• The constructor should accept the car’s year model, make and speed as arguments. 
• Accessor methods should get the values stored in an object’s year, Model, make, and speed fields. 
• Accelerate method should add 5 to the speed field each time it is called. 
• Brake method should subtract 5 from the speed field each time it is called. 
Demonstrate the class in a program that creates a Car object, and then calls the accelerate method five times. After each call to the accelerate method, get the current speed of the car and display it. Call the brake method five times. After each call to the brake method, get the current speed of the car and display it.

2a.Identify the type of inheritance in the given diagram. Create a class A with two integer member
variables that are private, two float variables that are protected and two integer variables that are public.
Let class B inherit class A and class C and Class D are inherited from class B. Write appropriate
methods to illustrate the following
i) Usage of super keyword
ii) Function overriding
iii) Default constructors
iv) Parameterized constructors
v) How to we make a method not to be over ridden and a class not be inherited further

2b.

3.Create class Number with only one private instance variable as a double primitive type.
To include the following methods (include respective constructors) isZero( ),
isPositive(), isNegative( ), isOdd( ), isEven( ), isPrime(), isAmstrong() the above
methods return boolean primitive type. getFactorial(), getSqrt(), getSqr(), sumDigits(),
getReverse() the above methods return double primitive type. void listFactor(), void
dispBinary(). 

4.Write a Java class Clock for dealing with the day time represented by hours, minutes,
and seconds. Your class must have the following features:
• Three instance variables for the hours (range 0 - 23), minutes (range 0 - 59), and seconds
(range 0 - 59).
• Three constructors:
  o default (with no parameters passed; is should initialize the represented time to 12:0:0)
  o a constructor with three parameters: hours, minutes, and seconds.
  o a constructor with one parameter: the value of time in seconds since midnight (it should
    be converted into the time value in hours, minutes, and seconds)
• Instance methods:
  o a set-method method setClock() with one parameter seconds since midnight (to be
    converted into the time value in hours, minutes, and seconds as above).
  o get-methods getHours(), getMinutes(), getSeconds() with no parameters that return the
    corresponding values.
  o set-methods setHours(), setMinutes(), setSeconds() with one parameter each that set up
    the corresponding instance variables.
  o method tick() with no parameters that increments the time stored in a Clock object by
    one second.
  o method addClock() accepting an object of type Clock as a parameter. The method should
    add the time represented by the parameter class to the time represented in the current
    class.
  o Add an instance method toString() with no parameters to your class. toString() must
    return a String representation of the Clock object in the form "(hh:mm:ss)", for example
    "(03:02:34)".
  o Add an instance method tickDown() which decrements the time stored in a Clock object
    by one second.
  o Add an instance method subtractClock() that takes one Clock parameter and returns the
    difference between the time represented in the current Clock object and the one
    represented by the Clock parameter. Difference of time should be returned as an clock
    object.
Write a separate class ClockDemo with a main() method. The program should:
• instantiate a Clock object firstClock using one integer seconds since midnight obtained
from the keyboard.
• tick the clock ten times by applying its tick() method and print out the time after each tick.
• Extend your code by appending to it instructions instantiating a Clock object secondClock
by using three integers (hours, minutes, seconds) read from the keyboard.
• Then tick the clock ten times, printing the time after each tick.
• Add the secondClock time in firstClock by calling method addClock.
• Print both clock objects calling toString method
Create a reference thirdClock that should reference to object of difference of firstClock and
secondClock by calling the method subtractClock().

5.We have to calculate the percentage of marks obtained in three subjects (each out of
100) by student A and in four subjects (each out of 100) by student B. Create an abstract
class 'Marks' with an abstract method 'getPercentage'. It is inherited by two other classes
'A' and 'B' each having a method with the same name which returns the percentage of
the students. The constructor of student A takes the marks in three subjects as its
parameters and the marks in four subjects as its parameters for student B. Create an
object for eac of the two classes and print the percentage of marks for both the students.

6. In this exercise you will create a hierarchy of animals that is rooted in an abstract
class Animal. Several of the animal classes will implement an interface called Pet. You
will experiment with variations of these animals, their methods, and polymorphism.
i. Create the Animal class, which is the abstract superclass of all animals. 
  1. Declare a protected integer attribute called legs, which records the number of  legs for this animal. 
  2. Define a protected constructor that initializes the legs attribute. 
  3. Declare an abstract method eat. 
  4. Declare a concrete method walk that prints out something about how the  animals walks (include the number of legs). 
ii. Create the Spider class. 
  1. The Spider class extends the Animal class. 
  2. Define a default constructor that calls the superclass constructor to specify that  all spiders have eight legs. 
  3. Implement the eat method. 
iii. Create the Pet interface specified by the UML diagram. 
iv. Create the Cat class that extends Animal and implements Pet. 
  1. This class must include a String attribute to store the name of the pet. 2. Define a constructor that takes one String parameter that specifies the cat's  name. This constructor must also call the superclass constructor to specify that  all cats have four legs.
  3. Define another constructor that takes no parameters. Have this constructor call  the previous constructor (using the this keyword) and pass an empty string as  the argument. 
  4. Implement the Pet interface methods. 
  5. Implement the eat method. 
v. Create the Fish class. Override the Animal methods to specify that fish can't walk and  don't have legs. 
vi. Create a TestAnimals program. Have the main method create and manipulate instances  of the classes you created above. Start with: 
  Fish d = new Fish(); 
  Cat c = new Cat("Fluffy"); 
  Animal a = new Fish(); 
  Animal e = new Spider(); 
  Pet p = new Cat(); 
Experiment by: a) calling the methods in each object, b) casting objects, c) using  polymorphism, and d) using super to call super class methods. 

7. Interfaces and Inheritance:
Your program will consist of the following classes: Shape, Circle, Square, Cube,
Sphere, Cylinder, and Glome and two interfaces Area and Volume.
Your classes may only have the class variable specified in the table below and the methods
defined in the two interfaces Area and Volume. You will implement the methods specified in
the Area and Volume interfaces and have them return the appropriate value for each shape.
Class Shape will have a single public method called getName that returns a string.

8. Write a Java program to perform employee payroll processing using packages. In the
java file, Emp.java creates a package employee and creates a class Emp. Declare the
variables name,empid, category, bpay, hra, da, npay, pf, grosspay, incometax, and
allowance. Calculate the values in methods. Create another java file Emppay.java.
Create an object e to call the methods to perform and print values.
