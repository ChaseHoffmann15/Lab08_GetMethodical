public class GetUserName {
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        firstName = SafeInputs.getNonZeroLenString(in, "Enter your first name");
        lastName = SafeInputs.getNonZeroLenString(in, "Enter your last name");
        System.out.println("\nYour full name is: " + firstName + " " + lastName);
    }
}
