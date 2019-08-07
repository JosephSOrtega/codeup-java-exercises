import util.Input;


public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
//        input.getString();
//        input.yesNo();
        System.out.println("input an integer");
        System.out.println(input.getInt());
        System.out.println("input an double");
        System.out.println(input.getDouble());
//        input.getInt(1, 30);
//        input.getInt(Integer.valueOf("s"));
////        input.getDouble(1, 30);
//        input.getDouble(Double.valueOf("s"));


    }
}
