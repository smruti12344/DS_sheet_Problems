
package String;
public class SentenceToKeypadNumber {
public String printSequence(String str){
    //step-1:create string array who contains all the mobiles numbers
    String numbers[]= { "2",    "22",  "222", "3",   "33", "333",
    "4",    "44",  "444", "5",   "55", "555",
    "6",    "66",  "666", "7",   "77", "777",
    "7777", "8",   "88",  "888", "9",  "99",
    "999",  "9999" };
    //step-2: pass the string and array in the convert method to generate result
    String res="";
     res = res+convert(str,numbers);
    return res;
}
public String convert(String str,String numbers[]){
    //step-1: Define the string who contain result and return
    String output ="";

    //step-2 : iterate over String array find the number
    str = str.toUpperCase();
     for (int i = 0; i < str.length(); i++) {
        //condition for space
        if (str.charAt(i)==' ') {
            output = output + "0";
        }
       
       else{
        output = output + numbers[str.charAt(i) - 'A'];
        //    System.out.println(output);
       }

     }
     return output;
}
    public static void main(String[] args) {
    String str = "Hello world"; //output :4433555555666096667775553

    String res = new SentenceToKeypadNumber().printSequence(str);
    System.out.println(res);

}
    
}