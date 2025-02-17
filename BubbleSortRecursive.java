import java.util.Arrays;

public class BubbleSortRecursive {
    static void sort(int[] arr,int i){
        if(i > arr.length-1) return;

        for(int j=0;j<arr.length-1;j++)
        {
            if(arr[j]>arr[j+1])
                {
                    arr[j] +=arr[j+1];
                    arr[j+1] =arr[j] - arr[j+1];
                    arr[j] =arr[j] - arr[j+1];
                }
        }
        sort(arr,i+1);
    }
    public static void main(String[]args)
    {
        int[] arr={3,15,22,1,18,4};
        sort(arr,0);
    System.out.println("Sorted Array:" +Arrays.toString(arr));
    }
}
