import java.util.List;
import java.util.ArrayList;

public class testList {
    public static void main(String[] args) {
        List<String> number = new ArrayList<String>();
        number.add("one");
        number.add("two");
        number.add("three");

        System.out.println(number);
        System.out.println();
        
        List<Integer> grades = new ArrayList<Integer>();
        grades.add(5);  
        grades.add(10);
        grades.add(1,7); // 1 becomes an the index number of this set and 7 is the element inside the set

        System.out.println(grades); // Displays out all contents of the list
        System.out.println(grades.get(0)); // gets the value of the number stored inside an index number by inputting the index number 
        System.out.println(grades.indexOf(5));  // gets the index number of a stored value by inputting the stored value

        System.out.println(); 

        System.out.println(grades.get(1));
        System.out.println(grades.indexOf(7));

        System.out.println();

        System.out.println(grades.get(2));
        System.out.println(grades.indexOf(10));
    }
}