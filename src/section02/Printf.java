package section02;

public class Printf {
    public static void main(RefType[] args) {
        System.out.printf("저는 대학교 %d학년입니다!\n",3);
        // %f는 소수점 6자리에서 반올림하여 표현
        System.out.printf("%d은 첫번째, %f은 두번째, %s은 세번째\n", 1,2.0,3);
        System.out.printf("%d은 첫번째, %f은 두번째, %s은 세번째\n", 1,2.123456789,3);
        System.out.printf("%d은 첫번째, %f은 두번째, %s은 세번째\n", 1,2.123456123,3);
        // 코드 이동 기능 : alt + 방향키 아래(또는 위)
        System.out.printf("%d은 첫번째, %f은 두번째, %s은 세번째\n", 1,2.123456789,'삼');
        System.out.printf("%s은 첫번째, %s은 두번째, %s은 세번째\n", 1,2.123456789,'삼');

        // floating point
        System.out.printf("소수점 처리 %f",1.1234567);
        System.out.println();
        System.out.printf("소수점 처리 %.2f",1.1234567);
        System.out.println();
        System.out.printf("소수점 처리 %.4f",1.1234567);
    }
}
