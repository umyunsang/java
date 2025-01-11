package section02;

import java.util.Scanner;

public class ScanTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("age : ");
        int age = scan.nextInt();
        System.out.printf("your age : %d",age);

        scan.close();

    }
}
