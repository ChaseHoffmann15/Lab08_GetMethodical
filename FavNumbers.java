public class FavNumbers {
}
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int integerNum;
        double doubleNum;

        integerNum = SafeInputs.getInt(in, "What is your favorite integer");
        doubleNum = SafeInputs.getDouble(in, "What is your favorite non-integer number");

        System.out.println("");
        System.out.println("\n Your favorite integer is: " + integerNum);
        System.out.println("\n Your favorite non-integer number is: " + doubleNum);
    }
}
