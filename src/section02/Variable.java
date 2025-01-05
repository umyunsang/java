package section02;

public class Variable {
    public static void main(String[] args) {
        // 변수 선언
        String name;
        int age;
        char bloodType;

        // 특수문자는 $, _ 만 사용가능
        char $top; char _top;

        // 변수 초기화
        age = 20;
        System.out.println(age);

        // 변수 정의
        String city = "Busan";
        System.out.println(city);

        // 변수 초기화시 다른 변수 할당 가능
        int myage = age;
        System.out.println("age : " + age);
        System.out.println("myage : "+ myage);
    }
}
