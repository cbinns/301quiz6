// Alex Filbert


/*
signature

public int getIndex(int x);

*/


public class SortedArray(ArrayList<int> sortedArray){
    private ArrayList<int> sortedArray;
    this.sortedArray=sortedArray;

    //public int getIndex(int x);

}



public class Constructors {
    public static void main( String[] args) {
        SortedArray sortedArray;
        sortedArray.add(1);
        sortedArray.add(2);
        sortedArray.add(3);


        // test getIndex
        System.out.println(sortedArray.getIndex(2));
        System.out.println("should be 1");
       
        
    }
}