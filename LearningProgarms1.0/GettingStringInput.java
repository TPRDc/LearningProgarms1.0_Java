import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner; // importing Scanner class

public class GettingStringInput {
    private static final Reader in = null;

    public static void main(String[] args) throws IOException {
        String name,dob;
        Scanner input = new Scanner(System.in); // Using Scanner class 
        BufferedReader enter = new BufferedReader(GettingStringInput.in); // Using Scanner class
        
        System.out.print("ENTER YOUR NAME => ");
        name = input.nextLine();
        System.out.println(name);

        System.out.print("ENTER YOUR DATE OF BIRTH => ");
        dob = enter.readLine();
    }
}