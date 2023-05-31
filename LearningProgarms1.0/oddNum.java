public class oddNum {
    public static void main(String[] args) {
        // 1st 100 odd Numbers Using While Loop
        int odd = 0;
        while(odd <= 100) {
            if((odd%2)!=0) {
                System.out.println(odd);
            }
            odd++;
        }
    }
}