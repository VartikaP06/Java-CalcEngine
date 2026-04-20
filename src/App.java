public class App {
    public static void main(String[] args) throws Exception {
        var value1 = 100.0;
        var value2 = 50.0;
        var result = 0.0;
        var opCode = 'd';

        switch (opCode) {
            case 'a':
                result = value1 + value2;
                break;
            case 's':
                result = value1 - value2;
                break;
            case 'm':
                result = value1 * value2;
                break;
            case 'd':
                result = value2 != 0 ? value1 / value2 : 0.0;
                break;
            default:
                result = 0.0;
                System.out.println("Invalid OpCode");
        }

        System.out.println("Result is: " + result);
    }
}
