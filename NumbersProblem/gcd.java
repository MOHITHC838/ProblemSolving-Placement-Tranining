public class gcd {
    public static void main(String[] args) {
        int nums_1 = 12;
        int nums_2 = 18;
        int low =0;
        int gcd =0;
        if (nums_1<nums_2) {
            low = nums_1;
        }else{
            low = nums_2;
        }
        for(int i=1;i<=low;i++){
            if(nums_1 %  i ==0 &&  nums_2% i==0){
                gcd = i;
            }
        }
        System.out.println(gcd);















        }
    }

