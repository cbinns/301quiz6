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


        // test getIndex
        System.out.println("Find index of 2");
        //System.out.println("method returns: "+sortedArray.getIndex(2));
        System.out.println("expected return: 1");
       
        
    }
}