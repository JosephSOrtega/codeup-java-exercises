//import java.util.Arrays;
//
//
//public class ArraysExercises {
//
//    private static class Person {
//        public static String name;
//        public static int age;
//
//    }
//
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
//        Person person1 = new Person();
//        Person person2 = new Person();
//        Person person3 = new Person();
//        Person person4 = new Person();
//        int maxPersons = 3;
//        Person[] thisArray = new Person[maxPersons];
//        person1.name = "Joe";
//        person2.name = "John";
//        person3.name = "Jim";
//        person4.name = "Alan";
//
//
//        thisArray[0] = person1;
//        thisArray[1] = person2;
//        thisArray[2] = person3;
//        addPerson(thisArray, person4);
//    }
//
//    public static void addPerson(Person[] array, Person here) {
//        for (Person peeps : array)
//            System.out.println(peeps);
//        int num = array.length;
//        array[num] = here;
//
//    }
//}

import java.util.Arrays;


public class ArraysExercises {
    private static Person[] addPerson(Person[] group, Person newMember) {
        Person[] newGroup = Arrays.copyOf(group, group.length+1);
        newGroup[newGroup.length-1] = newMember;
        return newGroup;
    }

//    private static class Person {
//        public static String name;
//
//    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
//        Person person1 = new Person();
//        Person person2 = new Person();
//        Person person3 = new Person();
//        Person person4 = new Person();
//        int maxPersons = 3;
//        Person[] thisArray = new Person[maxPersons];
        Person[] thisArray = {
                new Person("joe"),
                new Person("moe"),
                new Person("moe")};

        Person[] newGroup = addPerson(thisArray, new Person("linda"));
        Arrays.toString(newGroup);

        for (Person char : newGroup)
        System.out.println(char.name);
//        person1.name = "Joe";
//        person2.name = "John";
//        person3.name = "Jim";
//        person4.name = "Alan";
//        new Person("Alan");
//

//        thisArray[0] = person1;
//        thisArray[1] = person2;
//        thisArray[2] = person3;
//        addPerson(thisArray, new Person("Alan"));
    }

//    public static void addPerson(Person[] array, Person here) {
//        for (Person peeps : array)
//            System.out.println(peeps);
//        int num = array.length+1;
//        array[num] = here;
//
//    }
}
