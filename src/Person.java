import java.util.Scanner;

class Person {
    private String name;

    private void main(String[] args) {
        Person Dave = new Person("dave");
        System.out.println("Their name is "+ Dave.name);
        getName();
        sayHello();
    }


    // returns the person's name
    public void getName() {
        System.out.println(name);
    }

    // changes the name property to the passed value
    public Person(String nameHere) {
        this.name = nameHere;
    }

    // prints a message to the console using the person's name
    private void sayHello() {
        System.out.println("your name is " + name);
    }


}
