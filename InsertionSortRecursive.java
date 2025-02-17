import java.util.Arrays;

class InsertionSortRecursive{
    static void sort(int[] arr,int i)
    {
        if(i > arr.length-1) return;

        int curEle=arr[i];
        int j=i-1;
        while(j >=0 && curEle < arr[j])
        {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=curEle;
        sort(arr,i+1);
    }
    public static void main(String[]args){
        int arr[]={3,8,4,6,5};
        sort(arr,1);
        System.out.println("Array after i:" +Arrays.toString(arr));
    }
}