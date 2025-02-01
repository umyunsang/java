package section06;

import java.util.Arrays;

public class EX06_07 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i =0; i<arr.length; i++){
            arr[i] = (int)(Math.random() * 10) + 1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
