package section06;

public class EX06_06 {
    public static void main(String[] args) {
        // 정렬해야 할 배열
        int[] arr = new int[10];
        for(int i =0; i<arr.length; i++){
            arr[i] = (int)(Math.random() * 30) + 1;
        }

        // 값을 치환하기 위한 임시 변수
        int temp = 0;

        for(int i =arr.length -1; i>0; i--){
            for(int j=0; j<i; j++){
                //앞의 값이 뒤의 값보다 크다면 정렬
                if(arr[j]>arr[j+1]){
                    //뒤의 값으 임시 변수에 저장
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("정렬 후 출력: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}