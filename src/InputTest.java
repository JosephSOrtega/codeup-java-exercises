import util.Input;


public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        input.getString();
        input.yesNo();
        input.getInt(1, 30);
        input.getInt("s");
        input.getDouble(1, 30);
        input.getDouble("s");
//        System.out.println(input.getInt(Integer.valueOf(String "s")));
//        System.out.println(input.getDouble(Double.valueOf(String "s")));


    }
}
