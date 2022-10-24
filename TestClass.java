public class TestClass {
}

   /* static Scanner in = new Scanner(System.in);
    static double balance = 1000;
    public static void main(String[] args) {
       // int birthMonth = SafeInput.getRangedInt(pipe, "Enter your birthday month in number", 1,12);
       // System.out.println(birthMonth);
        System.out.println("Select an option to proceed, W - Withdraw, D - Deposit, C - Check Balance, Q - Quit");
        String option = in.nextLine();
        option = option.toUpperCase();
        switch (option){
            case "W":
                withdraw();
                break;
            case "D":
                deposit();
                break;
            case "C":
                checkBalance();
                break;
            case "Q":
                quit();
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
    private static void quit() {
        System.out.println("Thank you for banking with us!");
        System.exit(0);
    }
    private static void checkBalance() {
        System.out.println("Balance: %.2f" + balance);
    }
    private static void deposit() {
        System.out.println("How much do you want to deposit: ");
        double depositAmount = in.nextDouble();
        in.nextLine();
        balance = balance + depositAmount;
        System.out.println("Deposit: " + depositAmount);
        System.out.println("Balance: " + balance);
    }
    public static void withdraw(){
        System.out.println("How much do you want to withdraw: ");
        double withdrawAmount = in.nextDouble();
        in.nextLine();
        balance = balance - withdrawAmount;
        System.out.println("Withdraw: " + withdrawAmount);
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String prompt = "Enter your SSN";
        String ssnPattern = "\\d{3}-\\d{2}-\\d{4}";
        String ssn = SafeInputs.getRegExString(scanner, prompt, ssnPattern );
        System.out.println("Your SSN is this: " + ssn);
    }
*/





}
