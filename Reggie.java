public class Reggie {
}
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String prompt = "Enter your SSN";
        String ssnPattern = "\\d{3}-\\d{2}-\\d{4}";
        String ssn = SafeInputs.getRegExString(in, prompt, ssnPattern );
        System.out.println("Your SSN is this: " + ssn);

        prompt = "Enter your UC Student M number";
        String mNumberPatter = "(M|m)\\d{5}";
        String mNumber = SafeInputs.getRegExString(in, prompt, mNumberPatter);
        System.out.println("Your UC M Number is: " + mNumber);






    }
}
