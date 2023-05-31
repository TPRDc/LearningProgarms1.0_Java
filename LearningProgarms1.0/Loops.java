import xyz.addNum;

public class Loops {
    public static void main(String[] args) {
        String name = "TPRDc";

        // for loop
        for(
            int i=0; // setting condition value
            i<5; // setting condition limit
            i++ // setting condition counter ( OR i=i+1 OR i+=1 )
            ) {
            System.out.println(name); // activity carried out by loop 
        }

        System.out.println(); // Creating a gap between both loops

        // while loop
        int x=0; //setting condition value
        while(x<5) // setting condition limit
        {
            System.out.println(name+"!"); // activity carried out by loop 
            x++; // setting condition counter ( OR i=i+1 OR i+=1 )
        }

        System.out.println();

        // do while loop
        int y=0;
        do{
            System.out.println(name+"?");
            y++;
        }while(y<5);
    }
}
