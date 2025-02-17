import java.util.Arrays;
public class InsertionSort {
    public static void main(String[]args)
    {
        int arr[]={9,4,2,5,1};
        System.out.println("Unsorted Array:" +Arrays.toString(arr));
        for( int i =1;i<arr.length;i++){
            int j=i-1;
            int curEle=arr[i];
            while( j>=0 && curEle < arr[j]) 
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curEle;
        }
        System.out.println("Array after i:" +Arrays.toString(arr));

    }
}
