import java.util.ArrayList;


public class SortedArray{
    private ArrayList<Integer> sortedArray;

    SortedArray(){
        System.out.println("List created");
        this.sortedArray = new ArrayList<Integer>();
        
    }

    public void addInt(int intValue){
        this.sortedArray.add(intValue);
    }

    //public int getIndex(int x);

}