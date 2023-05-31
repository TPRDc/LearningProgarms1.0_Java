public class evenNum {
    public static void main(String[] args) {

        // 1st 100 Even Numbers Using While Loop
        int even = 0;
        while(even <= 100) {
            if((even%2)==0) {
                System.out.println(even);
            }
            even+=1;
        }
    }
}