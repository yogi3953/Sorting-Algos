import java.util.Arrays;
public class InsertionSort {
    public static void main(String[]args)
    {
        int arr[]={3,4,2,5,1};
        System.out.println("Unsorted Array:" +Arrays.toString(arr));
        for( int i =1;i<arr.length;i++){
            int j=i-1; 
            int curEle=arr[i];
            System.out.println("Inside i and before While: i:"+i+" j:"+j+" curEle:"+curEle);
            while( j>=0 && curEle < arr[j]) 
            {
                arr[j+1]=arr[j];
                j--;
                System.out.println("Inside i and  While: i:"+i+" j:"+j+" curEle:"+curEle);
                System.out.println("Array inside while:" +Arrays.toString(arr));
            }
            arr[j+1]=curEle;
            System.out.println("Inside i and after While: i:"+i+" j:"+j+" curEle:"+curEle);
            System.out.println("Array after while:" +Arrays.toString(arr));
        }
        System.out.println("Array after i:" +Arrays.toString(arr));

    }
}
