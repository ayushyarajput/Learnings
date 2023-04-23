import java.util.Scanner;
public class Even {
    public static void main (String args[]){
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.print("Enter Number to check if even or odd : ");
            int number = myObj.nextInt();
            if(isEven(number)){
                System.out.println(number + " is even");
            } else {
                System.out.println(number + " is odd");
            }
        }
    }
    public static boolean isEven (int num) {
        if(num%2 == 0){
            return true;
        } else {
            return false;
        }
    }
}