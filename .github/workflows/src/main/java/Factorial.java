public class Factorial {
    public static long factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5; 
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }
}
