 
package Arrays;

public class SelectionSort {
    public static void sort(int arr[]){
        //Selection sort
        // int n=arr.length;
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            //compare loop
            for (int j = i; j < arr.length; j++) {
                if(arr[j]<arr[min]){
                    min=j;
                }
               
            }
            if (min != i) {
                swap(arr,i,min);
                
            }
        }
    }
    public static void swap(int arr[],int a,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;


    }
public static void main(String[] args) {
    int arr[] = {7,4,10,8,3,1};
    
    System.out.println("before sorting");
    for (int i : arr) {
        System.out.print(i+" ");
    }
    SelectionSort.sort(arr);
    System.out.println("After sorting");
    for (int i : arr) {
        System.out.print(i+" ");
    }
}
    
}