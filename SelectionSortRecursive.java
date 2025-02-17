import java.util.Arrays;

public class SelectionSortRecursive {
    static void sort(int[]arr,int i){
        if(i > arr.length-2 ) return;

        int min=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j] < arr[min])
                min=j;
        }
        arr[i]+=arr[min];
        arr[min]=arr[i]-arr[min];
        arr[i]=arr[i]-arr[min];
        sort(arr,i+1);
    }
    public static void main(String[]args)
    {
        int[] arr={3,5,2,1,8,4};
        sort(arr,0);
    System.out.println("Sorted Array:" +Arrays.toString(arr));

    }
}
