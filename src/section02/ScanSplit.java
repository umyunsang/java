package section02;

import java.util.Scanner;

public class ScanSplit {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        String address;
        int age;
        double weight;

        System.out.println("이름, 주소, 나이, 체중을 빈칸으로 구분해서 순서대로 입력하세요.");
        //엄윤상 부산 28 65
        name = scan.next();
        address = scan.next();
        age = scan.nextInt();
        weight = scan.nextDouble();

        System.out.printf("name : %s\n",name);
        System.out.printf("address : %s\n",address);
        System.out.printf("age : %d 세\n",age);
        System.out.printf("weight : %.2f kg\n",weight);

        scan.close();
    }
}