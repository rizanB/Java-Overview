package basic;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] a = {
            {1,2,3}, {4,5,6}, {7,8}
        };

        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }

        }
    }
}
