package section02;

public class PrimeType {
    public static void main(String[] args) {

        // num1 = 128 오버플로우
        byte num1 = 127; short num2 = 128; int num3 = 128; long num4 = 128;
        
        System.out.println(num1 + 1);   // int 타입 출력
        System.out.println(num2);       // 2byte
        System.out.println(num3);       // 4byte
        System.out.println(num4);       // 8byte

        num1 = 0b101;   // 0b 이진수(binary)
        num2 = 0123;    // 0  8진수(octal)
        num3 = 0x12f;   // 0x 16진수(hexa)
        System.out.println(num1);   // 10진수로 변환되어서 출력 됨
        
        // L을 사용해 long 타입의 값을 할당
        num4 = 999999999999999999L;
        System.out.println(num4);

        // 실수값 끝에 f를 붙어 float 타입의 값을 할당 (기본값: double)
        float num = 12.123123f;
        System.out.println(num);

        // double과 float의 정밀도 차이
        double dnum = 3.123123123123123123123;
        float fnum = 3.123123123f;
        System.out.println("Double\t: " + dnum);    // 소수점 15자리 까지
        System.out.println("Float\t: " + fnum);     // 소수점 7자리 까지 

        
    }
}