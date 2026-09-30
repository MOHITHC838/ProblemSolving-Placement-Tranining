package binarySerchAlgorthim;

public class binaryTraverse {

    public static int binarySerch(int[] array,int target){
        int left = 0;
        int right = array.length-1;

        while (left <= right){
            int mid = left + (right - left) / 2;

            if (array[mid] == target){
                return mid;
            }else if(array[mid] < target){
                left =  mid + 1;
            }else{
                right = mid - 1;
            }

        }
        return   -1;

    }


    public static void main(String[] args){
        int[] arr = {15,25,30,35,40,45};
        int target = 25;
        System.out.println(binarySerch(arr,target));

    }

}
