package section08;

public class Calc {
    // void sum(int[] nums) {
    //     int result = 0;
    //     for(int i = 0; i < nums.length; i++) {
    //         result += nums[i];  // 매개변수로 받은 배열의 요소 값을 하나씩 
    //                             // result 값에 더함함
    //     }
    //     System.out.println("숫자들의 합은 " + result + "입니다.");
    // }
    public int sum(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            result += nums[i];
        }
        return result;      // 매개변수로 받은 값을 무두 더한 result 값을 다시 반환함
    }
}
