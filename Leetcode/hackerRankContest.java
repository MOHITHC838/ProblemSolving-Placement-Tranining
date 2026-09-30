package Leetcode;

public class hackerRankContest {
    static void main() {
        int nums[] = {10,5,20,8,25,15,30};
        greaterAllPre(nums);

    }
    public static  void greaterAllPre(int[] nums){
        int i=1;
        int j=i-1;
        int coditionCount =0;
        int noCount =0;
        int mainCount =1;
        for(i=1;i<nums.length;i++){
            if (j < nums[i] && j>=0){
                noCount++;
                coditionCount++;
                j++;
            }else{
                j++;
                noCount++;
            }

        }
        System.out.println(noCount);
        System.out.println(coditionCount);


        if (noCount == coditionCount){
            mainCount++;
        }
//        System.out.println(mainCount);

    }
}
