public class Check {
    public String checker(int num) {
        if (num > 0) {
            return "positive";
        } else if (num < 0) {
            return "negative";
        } else {
            return "Zero";
        }
    }

    public static void main(String[] args) {
        Check c1 = new Check();
        System.out.println("number is: " + c1.checker(20));
        System.out.println("number is: " + c1.checker(-1));
        System.out.println("number is: " + c1.checker(0));
        System.out.println("number is: " + c1.checker(20));
        System.out.println("number is: " + c1.checker(-1));
        System.out.println("number is: " + c1.checker(0));
        
    }
}