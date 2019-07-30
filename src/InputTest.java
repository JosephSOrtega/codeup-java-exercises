import util.Input;


public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        input.getString();
        input.yesNo();
        input.getInt(1, 30);
        input.getInt();
        input.getDouble(1, 30);
        input.getDouble();

    }
}
