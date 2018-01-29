// Partner: Alex Filbert ccid: afilbert
// Carolyn Binns ccid: cbinns



/*
method signature:

public int getIndex(int x);

*/

import java.util.ArrayList;


public class SortedArray{
    private ArrayList<Integer> sortedArray;

    SortedArray(){
        this.sortedArray = new ArrayList<Integer>();
        
    }

    public void addInt(int intValue){
        this.sortedArray.add(intValue);
    }

    public int getIndex(int x){
        
        int start=0;
        int end=sortedArray.size()-1;

        while(start<=end){
            int middle=start+end/2;     // index of middle element
            if (this.sortedArray.get(middle)==x){
                // found element
                return middle;

            }else if (this.sortedArray.get(middle)<x){
                end=middle-1;
            }else {
                start=middle+1;
            }
        }       
        
        
        
        return -1;
    }

}