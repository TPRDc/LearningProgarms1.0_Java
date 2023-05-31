public class Methods {

    // A method can be written before and after the block of code where it is called
    // A method to add an exclamation mark to the end of a word
    public static void addSign(String mark) {
        System.out.println(mark + "!");
    }
    
    // Using return key word
    public static String Sign(String mark1) {
        return mark1 + "!";
    }
    
    // Main code block
    // Calling the method
    public static void main(String[] args) {
        // Call for 1st method
        addSign("HOT FOOD");
        
        // Call for 2nd method  
        String exclaim = Sign("COLD FOOD");
        System.out.println(exclaim);

        // Calling a method from an external or outside java file
        Animal a = new Animal(); // Name of exteranl java file 
        String dog = a.iAmDog(); // method found inside the file 
        System.out.println(dog);
    }
}