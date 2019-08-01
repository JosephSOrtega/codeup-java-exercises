public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    // returns the person's name
    public String getName() {
        return this.name;
    }

    // changes the name property to the passed value
    public void setName(String newName) {
        name = newName;
    }

    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.printf("Hello, my name is %s%n", this.name);
    }

    public static void main(String[] args) {
//        Person person = new Person();
//        Person cody = new Person("Cody the Duck");
//        cody.setName("Cody The Duck");
////        System.out.println(this.name); There is no this in a static
//        cody.sayHello();
//        System.out.println(cody.name);
//        System.out.println(cody);
        int num = 7;
        Person person1 = new Person("John");
        Person person2 = new Person("John");
        person2.setName("Jane");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1.getName());
    }
}


//mine

//public class Person {
//    private String name;
//
//
//    public Person(String here) {
//        this.name = here;
//    }
//    // returns the person's name
////    private static void getName() {
////        System.out.println(name);
////    }
//    public String getName() {
//        System.out.println(this.name);
//        return this.name;
//    }
//    // changes the name property to the passed value
////    private Person(String nameHere) {
////        this.name = nameHere;
////    }
//    public void setName(String nameHere) {
//        this.name = nameHere;
//    }
//
//    // prints a message to the console using the person's name
//    public void sayHello() {
//
//        System.out.println("Your name is " + this.name);
//    }
//
//    public static void main(String[] args) {
//        Person Dave = new Person("dave");
//        System.out.println("Their name is "+ Dave.name);
//        Dave.getName();
//        Dave.sayHello();
//
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//
//        person1 = new Person("John");
//        person2 = person1;
//        System.out.println(person1 == person2);
//
//        person1 = new Person("John");
//        person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//    }
//
//
//}
