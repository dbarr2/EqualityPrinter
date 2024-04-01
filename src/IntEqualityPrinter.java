public class IntEqualityPrinter {

    public static void main(String[] args) {

        printEqual(1, 1, 2); //Expected Results: Neither are all equal or different
        printEqual(1,1,1); //Expected Results: All numbers are equal
        printEqual(-1,-1,-1); //Expected Results: Invalid Value


    }

    public static void printEqual(int a, int b, int c) {

        if(a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
            return;
        }

        boolean checkValues = a == b && b == c;
        if(checkValues) {
            System.out.println("All numbers are equal");
        } else if ((a==b) || (b == c) || (a ==c) ) {
            System.out.println("Neither are all equal or different");
        } else {
            System.out.println("All numbers are different");
        }

    }
}
