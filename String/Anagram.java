 
package String;


import java.util.Iterator;

import java.util.Set;
import java.util.TreeSet;

/**
 * Anagram
 */
public class Anagram {
    //retrive method
    public static void  retrive(Set<Integer>arr){
    //  Iterator<Integer> sp = arr.iterator();
    //  while (sp.hasNext()) {
    //     System.out.println(sp.next());
    //  }
    arr.forEach((k)->{
        System.out.println(k);
    });
    }
    public static void main(String[] args) {
        Set<Integer> sp =new TreeSet<>();
        sp.add(30);
        sp.add(20);
        sp.add(10);
        Anagram.retrive(sp);
    }

    
}