import java.util.Arrays;

public class Array2D {

    private int[][] arr;

    public Array2D(int nRows, int nCols) {
        // initialize the array
        this.arr = new int[nRows][nCols];
        // fill the array with random numbers between 1 and 50 inclusive
        for(int r=0; r < this.arr.length; r++) {
            for(int c=0; c < this.arr[0].length; c++) {
                this.arr[r][c] = (int) (Math.random() * 50 + 1);
            }
        }
    }

    public int crossSum(int r, int c) {
        return arr[r][c] + arr[r-1][c] + arr[r][c+1] + arr[r+1][c] + arr[r][c-1];
    }

    // returns the center (row, col) of the max cross in the array
    public int[] maxCross() {
        int[] maxCenter = {1,1};
        for(int r=1; r < arr.length-1; r++) {
            for(int c=1; c < arr[0].length-1; c++) {
                if(crossSum(r,c) > crossSum(maxCenter[0],maxCenter[1])) {
                    maxCenter[0] = r;
                    maxCenter[1] = c;
                }
            }
        }
        return maxCenter;
    }

    // print array
    public void print() {
        System.out.print("[");
        for(int r=0; r < arr.length-1; r++) {
            System.out.println(Arrays.toString(arr[r]) + ", ");
        }
        System.out.println(Arrays.toString(arr[arr.length-1]) + "]");
    }

    public static void main(String[] args) {
        Array2D arr = new Array2D(5,5);
        arr.print();
        System.out.println();
        System.out.println(Arrays.toString(arr.maxCross()));
    }
}
