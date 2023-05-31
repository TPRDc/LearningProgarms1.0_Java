import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {

        int color; // Declaring Variables   
        Scanner input = new Scanner(System.in);

        System.out.print("Pick a number between [0, 1, 2]: ");
        color = input.nextInt();

        // if, else if , else statement  
        if(color==0){
            System.out.println("Red look's like blood.");
        } else if(color==1) {
            System.out.println("Blue look's like the sky.");
        }else if(color==2){
            System.out.println("Yellow like the sun.");
        }
    }
}
