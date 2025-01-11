package section02;

public class TypeCast {
    public static void main(String[] args) {
        int num1 = 1;        // 정수, 4byte
        double num2 = 3.14; // 실수, 8byte

        // 자동 형 변환, 데이터 유실 발생하지 않음
        double num1Change = num1;
        System.out.println(num1Change);

        // 자동 형 변환 불가, 데이터 유실이 발생할 수 있음
        // int num2Change = num2;

        /*
         * 정수-정수 형 변환
         */
        int int1 = 10;              // 4byte

        // 강제 형 변환, 명시적 형 변환, Down casting
        byte byte1 = (byte) int1;   // 1byte
        System.out.println(byte1);

        // 묵시적 형 변환, Up casting
        int int2 = byte1;           // 4byte
        System.out.println(int2);

        /*
         * 실수-실수 형 변환
         */
        double double1 = 1.0e100;       //8byte
        float float1 = (float)double1;  //4byte

        // 큰 자료형을 작은 자료형으로 강제형 변환 가능하지만 오버플로우 주의
        System.out.println(double1);    //1.0E100
        System.out.println(float1);     //Infinity

        /*
         * 실수-정수 형 변환
         */
        double double2 = 3.14;          //8byte
        long long1 = (long) double2;    //8byte 
        System.out.println(long1);
        System.out.println(double2);
    
        int int3 = 999999999;           //4byte
        float float2 = int3;            //4byte
        System.out.println(float2);     //999999999.0이 아니라 1.0E9

        double double3 = int3;
        System.out.println(double3);    //9.99999999E8


    }
}
