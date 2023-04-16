import java.util.Scanner;
public class StudentsGrade {
    public static void main (String args[]){

        try (Scanner myObj = new Scanner(System.in)) {
            // taking input from user
            System.out.print("Enter Marks : ");
            int marks = myObj.nextInt();
            // if marks is greater than 100 - it is not possible 
            // if greater than 90 than A grade
            // if greater than 80 than B grade
            // if greater than 70 than C greade 
            // below that person eill need more practice
            if(marks>100 || marks<0){
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
            // exception handling if user enters any other value than integer marks
        } catch (Exception e) {
            System.out.println("you might have entered wrong values Please enter whole number less than 100 only");
        }
    }
}