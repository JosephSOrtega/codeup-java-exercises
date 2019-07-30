public class Person {
    private static String name;


    private Person(String here) {
        this.name = here;
    }


    // returns the person's name
//    private static void getName() {
//        System.out.println(name);
//    }
    private static String getName() {
        return Person.name;
    }

    // changes the name property to the passed value
//    private Person(String nameHere) {
//        this.name = nameHere;
//    }
    private void setName(String nameHere) {
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

        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);

        person1 = new Person("John");
        person2 = person1;
        System.out.println(person1 == person2);

        person1 = new Person("John");
        person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }


}
