
public class swapWithoutTemp {
    public static void main(String[] args) {
        int nums_1=10;
        int nums_2=20;
        System.out.println(" BEFORE:");
        System.out.println(nums_1);
        System.out.println(nums_2);

        nums_1 = nums_1+nums_2;
        nums_2= nums_1-nums_2;
        nums_1 = nums_1-nums_2;

        System.out.println(" AFTER:");
        System.out.println(nums_1);
        System.out.println(nums_2);

        
    }
    
}
