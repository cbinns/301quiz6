// Alex Filbert


/*
signature

public int getIndex(int x);

*/

import java.util.ArrayList;



public class Constructors {
    public static void main( String[] args) {
        SortedArray sortedArray = new SortedArray();
        sortedArray.addInt(1);
        sortedArray.addInt(2);
        sortedArray.addInt(3);
        int i = sortedArray.getIndex(2);

        // test getIndex
        System.out.println("Find index of 2");
        System.out.println("method returns: "+ i);
        System.out.println("expected return: 1");
       
        
    }
}