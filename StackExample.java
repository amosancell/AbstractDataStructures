import java.util.*;
public class StackExample {

    private int[] ints;

    public StackExample() {
        this.ints = new int[20];
        for(int i=0; i < this.ints.length; i++) {
            this.ints[i] = (int) (Math.random() * 100 + 1);
        }
        Arrays.sort(this.ints);
    }

    public int[] getInts() {
        return ints;
    }

    public static void main(String[] args) {
        StackExample ex = new StackExample();
        int[] arr = ex.getInts();

        // load the values of the array into a stack
        Stack<Integer> s = new Stack<Integer>();
        for(int val : arr) {
            s.push(val);
        }
        System.out.println(Arrays.toString(arr));
        // reverse the order of the array by popping out the values of the stack into the array. this shows LIFO
        for(int i=0; i < arr.length; i++) {
            arr[i] = s.pop();
        }
        System.out.println(Arrays.toString(arr));
    }

}
