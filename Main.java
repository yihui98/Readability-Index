package readability;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        if (sentence.length() >100){
            System.out.print("HARD");
        }
        else{
            System.out.print("EASY");
        }
    }
}

