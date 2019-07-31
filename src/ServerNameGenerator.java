public class ServerNameGenerator {
    public static void main(String[] args) {
//        String[] array1 = new String[10];
//        String[] array2 = new String[10];

        String[] array1 = {"red", "blue", "tall", "short", "wide", "slim", "large", "small", "yellow", "green"};
        String[] array2 = {"cat", "dog", "fish", "bear", "Joseph", "people", "hat", "dork", "computer", "word"};

        System.out.println("Here is your server name: \n" + gen(array1) + "-" + gen(array2));


    }

    public static String gen(String[] array) {
        int num = (int) Math.ceil(Math.random() * 10);
//        System.out.println(array[num]);
        return array[num];
    }
}
