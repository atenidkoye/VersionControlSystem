import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Name = "";
        String Ans = "";
        int Tries = 0;
        while (true) {
            Tries++;
            Ans = in.nextLine();
            System.out.println("please, guess my name");
            if (Name.equals(Ans)) {
                System.out.println("congratulations!");
                break;
            } else if (Ans.equals("n")) {
                System.out.println("thank you for playing");
                continue;

            } else if (Ans.equals("y")) {
                System.out.println("thank you for playing");
                break;

            }

        }
//        System.out.println("Hello world!");
    }
}