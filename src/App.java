import java.util.Arrays;

class class1 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

class class2 {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}

public class App {
    // 메인 메서드(method) - 프로젝트의 실행 담당
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Hello, Java!");
        System.out.println(Arrays.toString(args));
    }
}
