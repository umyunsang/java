package section03;

public class Operator {
    public static void main(String[] args) {
        // 증감 연산자 ++, --
        int num = 10; num++;
        System.out.println(num);
        System.out.println(++num);      //prefix == 전위(증가 연산자)
        System.out.println(num++);      //postfix == 후위(증가 연산자)
        System.out.println(num);

        // 논리 부정 연산자 !
        boolean isNan = true;
        System.out.println(!isNan);

    }
}