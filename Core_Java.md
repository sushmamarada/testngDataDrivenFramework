### OOPS Concepts:
#### Encapsulation:
Encapsulation can be achieved by: Declaring all the variables in the class as private and writing public methods in the class to set and get the values of variables.<br>

Encapsulation is also known as “data Hiding“
> 1. It improves maintainability and flexibility and re-usability
> 2. The fields can be made read-only
> 3. User would not be knowing what is going on behind the scene.<br>

Wrapping up of the data(variable) & functions in a single unit is called as encapsulation

1. In encapsulation, the variables of a class will be hidden form other classes, and can be accessed only through the methods of their current class. Therefore, it is also know as data hiding.<br> 
2. Assigning values of the variable-Method-Setter<br> 
3. Fetching values of the variable-Method-Getter<br>

To achieve encapsulation in java-

> Declare the variables of a class as private <br>
> Provide public setter and getter methods to modify and view the variables values

Secure: 
> We define all the variable as a private and public getter and setter method to access this variable. So we are accessing variables indirectly so its make secure to our code.

Some important point you should remember related to encapsulation in Java: 
> Encapsulation in Java is used to data hiding.<br> 
> It is helpful to reuse the code.<br> 
> Unit testing is very easy for an encapsulated code.<br> 
> Encapsulated code easy to maintain like we can change in a code or class without affecting other code or class.<br> 
> Encapsulation helps to make our code secure.<br> 

Benefits: 
> The fields of a class can be made read-only or write-only.<br>

```
public class Student{ 

//private data member  
private String name;  

//getter method for name  
public String getName(){  
return name;  
}  

//setter method for name  
public void setName(String name){  
this.name=name
}
} 
```

#### Inheritance:
1. We can create new class from an existing class is know as inheritance<br> 
2. With the help of inheritance we can transfer the properties of a class to child class<br> 
3. When we inherit from an existing class, we can reuse methods and fields of parent class, and we can add new methods & fields also<br> 
4. By using "extends" keyword, we can inherit the class<br> 
5. Inheritance represents IS-A relationship, it is also known as parent-child relationship<br>

https://www.geeksforgeeks.org/inheritance-in-java/ <br>

It is the mechanism in java by which one class is allow to inherit the features(fields and methods) of another class

Single Inheritance : In single inheritance, subclasses inherit the features of one superclass. In image below, the class A serves as a base class for the derived class B.

Advantages: 
> Overriding is possible<br> 
> Reduce the duplicate code --- Reusability<br> 
> Ease of code/Ease of maintainace<br> 
> Extensibility<br> 
> Data hiding<br>

Types of Inheritance: 
> Single Inheritance - <br>
> Multilevel Inheritance - <br>
> Hierarchial Inheritance - <br>


#### Polymorphism:

Overloading:<br>
If class have more than 1 method with same name but different signature is called as "Method overlodding" Also called as compile time polimorphism/Early Binding

Overriding:<br>
If the parent and child class have same name of the method & same signature is called overriden Also called as run time polymorphism/Late Binding

#### Abstraction:
1. Abstraction is the process of hiding the implimentation details from the user. Only functionality will be provided to the user. 
2. An abstract method is a method that is declared without an implementation. 
3. An abstract class may or may not have all abstract methods. Some of them can be concrete methods 
4. A method defined abstract must always be redefined in the subclass,thus making overriding compulsory OR either make subclass itself abstract. 
5. Any class that contains one or more abstract methods must also be declared with abstract keyword. 
6. There can be no object of an abstract class.That is, an abstract class can not be directly instantiated with the new operator. 
7. An abstract class can have parametrized constructors and default constructor is always present in an abstract class.

## Access Modifiers In Java

| Modifiers    | Class        | Package        |Sub Class        |Everywhere        |
| :---         |     :---:      |          ---: |          ---: |          ---:    |
| Public      | Yes            | Yes           |Yes              |Yes               |
| Procted     | Yes            | Yes           |Yes              |NO                |
| Default     | Yes            | Yes           |NO               |NO                |
| Private     | Yes            | NO            |NO               |NO                |
