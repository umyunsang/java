package section05;

/* for문 <1부터 10까지의 합 출력하기> */
public class EX05_01 {
    public static void main(String[] args) {
        int sum =0;

        for(int i=1; i<=10; i++){
            sum += i;
        }
        System.out.println("합: " +sum);
    }
}
