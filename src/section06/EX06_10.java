package section06;
import java.util.Arrays;

public class EX06_10 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};

        // 배열의 얕은 복사
        int[] arr2 = arr1;
        System.out.println("arr1 배열: "+ Arrays.toString(arr1));

        // arr2 배열 값 변경
        arr2[1] = 10;

        // arr1 변경 후 배열 출력
        System.out.println("arr2 배열: "+Arrays.toString(arr2));
        System.out.println("arr1 배열: "+Arrays.toString(arr1));
    }
}
