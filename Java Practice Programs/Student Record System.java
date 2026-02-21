import java.util.Scanner;
class Student{
    private
        String name;
        int rollNo;
        double marks;
        Scanner sc = new Scanner(System.in);
        
        public void setData(){
            System.out.print("Enter your name: ");
            name = sc.nextLine();
            System.out.print("Enter your Roll No. ");
            rollNo = sc.nextInt();
            System.out.println("Enter the marks obtained: ");
            marks = sc.nextDouble();
        }
        public void displayData(){
            System.out.println("Details of Student");
            System.out.println("Your name is: "+name);
            System.out.println("Your Roll No. is: "+rollNo);
            System.out.println("The marks that you have obtained are: "+marks);
        }
        public void calculateGrade(){
            if(marks>=90){
                System.out.println("You have achieved A+ Grade.");
            }
            else if(marks>=80){
                System.out.println("You have achieved A Grade.");        
            }
            else if(marks>=60){
                System.out.println("You have achieved B Grade.");
            }
            else if(marks>=40){
                System.out.println("You have achieved C Grade.");
            }
            else{
                System.out.println("You have failed the Exam");
            }
        }
    }

public class SRS {
    public static void main(String[] args) {
     Student s1 = new Student();   
     Student s2 = new Student();
     
     System.out.println("Student No. 1");
     s1.setData();
     s1.displayData();
     s1.calculateGrade();
     System.out.println("Student No. 2");
     s2.setData();
     s2.displayData();
     s2.calculateGrade();
    }
}
