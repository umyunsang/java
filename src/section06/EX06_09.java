package section06;

import java.util.Arrays;
import java.util.Comparator;

public class EX06_09 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        for(int i =0; i<arr.length; i++){
            arr[i] = (int)(Math.random() * 10) + 1;
        }
        System.out.println("정렬 전 배열: "+ Arrays.toString(arr));
        // 배열의 내림차순 정렬
        Arrays.sort(arr, Comparator.reverseOrder());
        System.out.println("내림차순 정렬: "+Arrays.toString(arr));
    }
}
