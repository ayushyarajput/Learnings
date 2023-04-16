package Learnings;
import java.util.Scanner;
public class StudentsGrade {
    public static void main (String args[]){
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.print("Enter Marks : ");
            int marks = myObj.nextInt();
            if(marks>100){
                System.out.println("Please enter acceptable marks");
            } else if(marks>90){
                System.out.println("Greade A");
            } else if (marks>80){
                System.out.println("Grade B");
            } else if (marks>70){
                System.out.println("Grade C");
            }else {
                System.out.println("Yo need to practice more and work hard");
            }
        } catch (Exception e) {
            System.out.println("you might have entered wrong values");
        }
    }
}