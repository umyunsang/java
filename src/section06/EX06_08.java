package section06;

import java.util.Arrays;

public class EX06_08 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i =0; i<arr.length; i++){
            arr[i] = (int)(Math.random() * 10) + 1;
        }
        System.out.println("정렬 전 배열: " + Arrays.toString(arr));
        // 배열의 오름차순 정렬
        Arrays.sort(arr);
        System.out.println("오름차순 정렬: "+ Arrays.toString(arr));
    }
}
