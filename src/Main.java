import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Name = "";
        String Ans = "";
        System.out.println("please, guess my name");
        if(Name.equals(Ans)){
            System.out.println("congratulations!");
        }
        else if (Ans.equals("n")){
            System.out.println("Do you want to quit? (y/n)");
        }

        System.out.println("Hello world!");
    }
}