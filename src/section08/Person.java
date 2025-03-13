package section08;

public class Person {
    private int age;        //Person 클래스에서만 접근 가능한 age 필드 선언언

    void introduce(String name, int age) {
        System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "세 입니다.");
    }

    void hello() {
        System.out.println("안녕하세요.");
    }

    void setAge(int num) {
        if(num <= 0) {      //만약, age에 넣으려는 값이 0보다 작거나 같다면,
            //값이 잘못되었음을 출력하여 알려줌
            System.out.println("잘못된 수를 입력하셨습니다. 1이상의 값으로 설정하세요.");
            return;     //메서드 종료
        }
        else {
            age = num;      //age필드에 num 값 저장
        }
    }
    int getAge() {
        return age;
    }
}
