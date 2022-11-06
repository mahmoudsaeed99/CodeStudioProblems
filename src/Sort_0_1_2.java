import java.util.Arrays;

public class Sort_0_1_2 {
    public static void sort012(int[] arr)
    {
        //Write your code here
        int low = 0;
        int mid = 0;
        int high = arr.length - 1 ;
        while(mid <= high){
            if (arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,0,0,2,2,1,0,1};
        System.out.println(Arrays.toString(arr));
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }
}
