import java.util.Scanner;
import java.util.Arrays;
class MergeSortingCopy {

    static void sort(int arr[], int start, int end) {
        if (start != end) {
            int mid = start + (end-start) / 2;
            sort(arr, start, mid);
            sort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }
    public static void merge(int[] arr,int start,int mid,int end)
    {
        int[] arr1=new int[mid-start + 1];
        int[] arr2=new int[end - mid];
        
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=arr[start+i];
        }
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]=arr[mid+1+i];
        }
        int i=0,j=0,k=0;
        System.out.println("arr1"+Arrays.toString(arr1));
        System.out.println("arr2"+Arrays.toString(arr2));
        System.out.println("before one full iteration: i-"+i+" j-"+j+" k-"+k);
        System.out.println("before one full iteration: start-"+start+" mid-"+mid+" end-"+end);
        System.out.println("before while arr:"+Arrays.toString(arr));
        while(i<arr1.length && j<arr2.length)
        {
            System.out.println("in WHILE: i-"+i+" j-"+j+" k-"+k);
        System.out.println("in WHILE: start-"+start+" mid-"+mid+" end-"+end);
            if(arr1[i]<arr2[j])
            {
                arr[k]=arr1[i];
              i++;
            }
            else
            {
                arr[k]=arr2[j];
                j++;

            }
            k++;
        }
        while(i<arr1.length)
        {
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length)
        {
            arr[k]=arr2[j];
            j++;
            k++;
        }
        System.out.println("arr"+Arrays.toString(arr));
        System.out.println("after one full iteration: i-"+i+" j-"+j+" k-"+k);
        System.out.println("after one full iteration: start-"+start+" mid-"+mid+" end-"+end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[];
        System.out.println("Size of array:");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter Elements:");
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            arr[i] = k;
        }
        System.out.println("strting arr:"+Arrays.toString(arr));
        sc.close();
        sort(arr, 0, arr.length - 1);
        System.out.println("final arr:"+Arrays.toString(arr));
    }
}