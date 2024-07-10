 package Arrays;
 
 
 public class MergeSort {
 public void mergeSort(int arr[]){
    //step-1: find the start-index,end-index and mid of the array
    int si =0;
    int ei = arr.length-1;
    

    //step-2 : Divide the array until the elements are not separated
    divide(arr,si,ei);
    
   
    
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
 }
 //divide
 public void divide(int arr[],int si,int ei){
    //base case
    if(si>=ei){
        return;
    }
    int mid = si+(ei-si)/2;

    divide(arr, si, mid);
    divide(arr, mid+1, ei);

    //conqure the divide elem
    conqure(arr,si,mid,ei);
    
 }

 //conqure
 public void conqure(int arr[],int si,int mid,int ei){
    // step-1 : create new Array to add individual element
    int merg[] = new int[ei-si+1];
    int idx1 = si;
    int idx2 = mid+1;
    int x=0;

    // step-2 : add elem to merg array
    //cond-1 : add both elem
    while (idx1 <= mid && idx2<=ei) {
        //check the 1st smaller elem and add 1st in array
        if(arr[idx1]<arr[idx2]){
            merg[x++]=arr[idx1++];
        }else{
            merg[x++] = arr[idx2++];
        }
        
    }

    //only left side elem
    while (idx1<=mid) {
        merg[x++]= arr[idx1++];
        
    }
    //only right side elem
    while (idx2<=ei) {
        merg[x++]=arr[idx2++];
        
    }
    //transfer the elem to orginal array
    for (int i = 0; i < merg.length; i++) {
        arr[si+i] = merg[i];
    }
 }

    public static void main(String[] args) {
        int arr[] = {7,8,9,1,2,4,5};
        new MergeSort().mergeSort(arr);
    }
 }
