import java.util.Arrays;
class SelectionSort{
    public static void main(String[]args){
        int arr[]={9,8,5,1,3};
        System.out.println("Unsorted Array:" +Arrays.toString(arr));
        int n=arr.length;
       // int min=0;
        int i,j;
        for(i=0;i<n;i++){
          int  min=i;
            for(j=i+1;j<n;j++)
            {
                    System.out.println("min:"+min+" j: "+j);
                if(arr[j] < arr[min])
                {
                    min=j;
                System.out.println("min:"+min+" j: "+j);
                }
                // if(j==n-1)
                // {
                //     //System.out.println(j);
                //     if(min==i) break;

                //     arr[i] = arr[i] + arr[min];  
                //     arr[min] = arr[i] - arr[min];  
                //     arr[i] = arr[i] - arr[min];
                //     System.out.println("min:"+min+" i: "+i+" j:"+j);
                // }
                 System.out.println("Unsorted Array in j:" +Arrays.toString(arr));
            }
            System.out.println("min:"+min+" i: "+i+" j:"+j);
            if(min==i) continue;

            arr[i] = arr[i] + arr[min];  
            arr[min] = arr[i] - arr[min];  
            arr[i] = arr[i] - arr[min];
            System.out.println("Unsorted Array in i:" +Arrays.toString(arr));
            System.out.println("min:"+min+" i: "+i+" j:"+j);
        }
        System.out.println("Sorted Array:" +Arrays.toString(arr));
    }
}