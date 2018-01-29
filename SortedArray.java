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

    public int getIndex(int x){
        System.out.println("In get index");
        
        
        int len=this.sortedArray.size()-1;
        int index=len/2;

        // find the middle number in the list to do binary search
        if (this.sortedArray.get(index) > x) {
            System.out.println("middle number is:" +this.sortedArray.get(index));
            

        }else if (this.sortedArray.get(index) < x){
            System.out.println("middle number is less than "+this.sortedArray.get(index));
            
        }else if (this.sortedArray.get(index) ==x){
            System.out.println("found the number");
            return index;
        }else{
            System.out.println("number not in array");
            return -1;            
        }
        
        
        
        return x;
    }

}