import java.util.Scanner;
public class Prime {
    public static void main(String args[]) {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.print("Enter Number to check if it's prime or not : ");
            int number = myObj. nextInt();
            if (isPrime(number)) {
                System.out.println(number + " is prime");
            } else {
                System.out.println(number + " is not prime");
            }
        }
    }
    public static boolean isPrime (int num) {
        if (num <= 1){
            return false;
        }
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}