public class Person {

    private String name;

    // returns the person's name
    public String getName() {
        return this.name;
    }
    // changes the name property to the passed value
    public void setName(String name) {
        this.name = name;
    }
    // prints a message to the console using the person's name
    public void sayHello() {     /////////when using void you do not need a return///////
//        System.out.printf("Hello, from " %s,name);
    }

//    The class should have a constructor that accepts a string value and sets the person's name to the passed string.//
//    public Person(String name) {
//        this.name = name;
//    }
    //DO NO NEED THE CONSTRUCTOR BECAUSE YOU WILL CAUSE A METHOD OVERLOAD////
//  //CAN CALL OTHER METHODS INSIDE A CONSTRUCTOR////
//
////    Create a main method on the class that creates a new Person object and tests the above methods.
    public static void main(String[] args) {
//        Person p1 = new Person("Karen"); ///will not work bc you are method overloading with the constructor///
        Person p1 = new Person();
        p1.setName("Karen");
        System.out.println(p1.name);
        p1.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
        }
    }

