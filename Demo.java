public class Demo {
    public static void main(String[] args) {
        // int n = Integer.parseInt(args[0]);
        // printLoop(n);

        System.out.println(arrDeepToString(create2DArrayRandomized(6, 4, 4)).replace("}, ", "},\n"));
    }

    public static void printLoop(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static String arrToString(int[] arr) {
        if (arr.length == 0) return "{}";

        String out = "{";
        for (int i = 0; i < arr.length - 1; i++) {
            out += arr[i] + ", ";
        }
        out += arr[arr.length - 1] + "}";
        return out;
    }

    public static String arrToString(String[] arr){
        if (arr.length == 0) return "{}";
        
        String out = "{";
        for (int i = 0; i < arr.length - 1; i++) {
            out += arr[i] + ", ";
        }
        out += arr[arr.length - 1] + "}";
        return out;
    }

    public static String arrDeepToString(int[][] arr) {
        String[] strings = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            strings[i] = arrToString(arr[i]);
        }
        return arrToString(strings);
    }

    public static int[][] create2DArray(int rows, int cols, int MaxValue) {
        int[][] out = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                out[row][col] = (int) (Math.random() * (MaxValue + 1));
            }
        }
        return out;
    }

    public static int[][] create2DArrayRandomized(int rows, int cols, int MaxValue) {
        int[][] out = new int[rows][];
        for (int row = 0; row < rows; row++) {
            int[] thisCol = new int[(int) (Math.random() * (cols + 1))];
            for (int i = 0; i < thisCol.length; i++) {
                thisCol[i] = (int) (Math.random() * (MaxValue + 1));
            }
            out[row] = thisCol;
        }
        return out;
    }
}
