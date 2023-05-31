public class logicalOperators {
    public static void main(String[] args) {
        // && = and , || = or , ! = not
        boolean a = true && true;
        System.out.println("And operator=> "+a);

        boolean b = true || false;
        System.out.println("Or Operator=> "+b);
    
        boolean c = !true || false;
        System.out.println("Not Operator=> "+c);
    }
    
}