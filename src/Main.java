import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Name = "";
        String Ans = "";
        int Tries = 0;
        while (true) {
            Tries++;
            Name = "mary";
            System.out.println("please, guess my name");
            Ans = in.nextLine();
            if (Ans.equals(Name)) {
                System.out.println("congratulations!");
                System.out.println("guess: "+Tries);
                break;
            }
            else if (Ans.equals("y")) {
                System.out.println("thank you for playing");
                System.out.println("guess: "+Tries);
                break;

            } else if (Ans.equals("n")) {
                System.out.println("thank you for playing");
                continue;
            }
            else {
                System.out.println("Try Again");
                System.out.println("do you want to quite? (y/n)");
//                System.out.println("guesses " + Tries--);


            }

        }
//        System.out.println("Hello world!");
    }
}