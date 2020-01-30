import java.util.*;
public class Arr {

    private int[] array;
    private List<Integer> aList;

    public Arr() {
        // initialize the array and ArrayList
        this.array = new int[3];
        this.aList = new ArrayList<Integer>();

        // add values to the array
        this.array[0] = 5;
        this.array[1] = 2;
        this.array[2] = 40;

        // add values to the ArrayList
        this.aList.add(-1);
        this.aList.add(-404);
        this.aList.add(27890);
    }

    public int[] getArray() {
        return array;
    }

    public List<Integer> getaList() {
        return aList;
    }

    public static void main(String[] args) {

        Arr obj = new Arr();
        int[] array = obj.getArray();
        List<Integer> aList = obj.getaList();


        // Print the array
        System.out.println(Arrays.toString(array));

        // print the ArrayList
        for(int val : aList) {
            System.out.println(val);
        }
    }

}
