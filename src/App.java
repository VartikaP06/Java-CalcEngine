public class App {
    public static void main(String[] args) throws Exception {
        double[] leftVals = {100.0, 98.0, 209.0, 11.0};
        double[] rightVals = {50.0, 23.0, 18.0, 3.0};
        var results = new double[leftVals.length];
        char[] opCodes = {'d', 'a', 's', 'm'};

        for (int i = 0; i < leftVals.length; i++) {
            switch (opCodes[i]) {
                case 'a':
                    results[i] = leftVals[i] + rightVals[i];
                    break;
                case 's':
                    results[i] = leftVals[i] - rightVals[i];
                    break;
                case 'm':
                    results[i] = leftVals[i] * rightVals[i];
                    break;
                case 'd':
                    results[i] = rightVals[i] != 0 ? leftVals[i] / rightVals[i] : 0.0;
                    break;
                default:
                    results[i] = 0.0;
                    System.out.println("Invalid OpCode");
            }
        }
        
        for (var result: results)
            System.out.println("Result is: " + result);
    }
}
