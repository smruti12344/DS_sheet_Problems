package Arrays;

public class RepeatingAndMissing {
    public int[] repeatedNumber(final int[] A) {
        //step-1 : Create new array which size is n+1
        int n = A.length;
        int hashArray[]=new int[n+1];
        for (int i = 0; i < hashArray.length; i++) {
            hashArray[i]=0;
        }
        for (int i = 0; i < A.length; i++) {
            hashArray[A[i]]++;
        }
        int repeat = -1 , missing = -1;
        for (int i = 0; i < hashArray.length; i++) {
            if(hashArray[i]==2){
                repeat=hashArray[i];
            }
            if(hashArray[i]==0){
                missing=hashArray[i];
            }
        }
        return new int [] {repeat,missing};
    }
    
public static void main(String[] args) {
    int arr[]={3,1,2,5,3};
    int number[] = new RepeatingAndMissing().repeatedNumber(arr);
    for (int i = 0; i < number.length; i++) {
        System.err.print(number[i]+" ");
    }
}
    
}
