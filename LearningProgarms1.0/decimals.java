public class decimals {
    public static void main(String[] args) {
        long num1;
        int num2;
        double sum;
        num1=25355290584l; num2=3; sum=num1/num2;
        System.out.println(num1+" / "+num2+" = "+sum); 
        System.out.format(num1+" / "+num2+" = "+"%2f",sum); // approximation
        System.out.println();
    }
}