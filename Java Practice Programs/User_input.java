import java.util.Scanner;

public class User_input {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a=Input.nextInt();
        System.out.print("Enter First Number: ");
        int b=Input.nextInt();
        System.out.println("The sum is: "+(a+b));
    }
}