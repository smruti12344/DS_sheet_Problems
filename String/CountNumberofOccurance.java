package String;
public class CountNumberofOccurance {
    public void printDuplicate(String str){
        str = str.toUpperCase();
        //step-1 : create an hash-array who size is equal to number of alphabet
        int hash[] = new int[26];
        // step-2: intialize the Array with 0's
        for (int i = 0; i < hash.length; i++) {
            hash[i]=0;
        }
        // step-3 : rich every characrter of the string using string -iterator
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i)-'A']++;
        }
        for (int i = 0; i < hash.length; i++) {
           if(hash[i]>=2){
            System.out.println((char)('A'+i)+" :"+hash[i]); 
           }
        }
    }
public static void main(String[] args) {
    String str1 = "geeksforgeeks";
    new CountNumberofOccurance().printDuplicate(str1);
}
    
}
