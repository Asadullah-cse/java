import java.util.Scanner;
public class Number_Guessing_Game {
    public static void main(String[] args) {
        int guess = 0, c=0;
        int correct_guess = 245;
        Scanner sc = new Scanner(System.in);

        while(guess!=correct_guess){
            System.out.print("Guess the number and the number pattern is _ _ _ : ");
            guess = sc.nextInt();
            if(guess<correct_guess){
                System.out.println("Too Low");
            }
            else if(guess>correct_guess){
                System.out.println("Too High");
            }
            c++;
        }
        System.out.println("You are right its "+correct_guess);
        System.out.println("The number of guesses you have taken are: "+c);
        sc.close();
    }
}
