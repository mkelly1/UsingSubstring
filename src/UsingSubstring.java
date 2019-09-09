import java.util.InputMismatchException;
import java.util.Scanner;

public class UsingSubstring {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.print("Enter a word: ");
            String mystring;
            try {
                mystring = scan.next();
            }catch(InputMismatchException e){
                System.out.println("Exception "+e);
                System.out.println("Please enter one word. Try again.");
                continue;
            }
            System.out.print("Enter a number for the index: ");
            int index = scan.nextInt();
            scan.nextLine();
            if (index > mystring.length()){
                System.out.println("You entered an index larger that the word legth. Try again.");
                continue;
            }
            System.out.println("The length of "+ mystring +" is "+ mystring.length());
            System.out.println("The substring from 0 to "+index+ " is: " + mystring.substring(0,index));
            System.out.print("Enter another string? Y|N? ");
            String response = scan.next();
            if(response.toLowerCase().equals("n")){
                break;
            }
        }
        System.out.println("The program has ended.");
    }
}
