 
package Arrays;
public class BubbleSort {
    public static void sort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                        arr[j+1] = temp;

                }
            }
        }
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