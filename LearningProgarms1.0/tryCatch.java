import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args) {
        try{
            int a,b,c;
            Scanner input = new Scanner(System.in);
            
            System.out.print("Enter num1: ");
            a = input.nextInt();

            System.out.print("Enter num2: ");
            b = input.nextInt();

            c = a + b;
            System.out.println(a + "+" + b + "=" + c);
        }catch(Exception x) // catch take's two argument's the 'Exception' & 'e' which can be any letter or non-key words
        {
            System.out.println("Invalid Number");
        }
    }
}
