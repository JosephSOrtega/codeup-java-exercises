public class Person {
    private static String name;

    // returns the person's name
    private static void getName() {
        System.out.println(name);
    }

    // changes the name property to the passed value
    private Person(String nameHere) {
        this.name = nameHere;
    }

    // prints a message to the console using the person's name
    private static void sayHello() {
        System.out.println("your name is " + name);
    }

    public static void main(String[] args) {
        Person Dave = new Person("dave");
        System.out.println("Their name is "+ Dave.name);
        getName();
        sayHello();
    }


}
