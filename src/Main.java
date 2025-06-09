public class Main {
    public static int[] getMaxEachRow(int[][] A){

        int[] res = new int[A.length];
        for (int i = 0; i < A.length ; i++){
            int max = A[i][0];
            for (int j = 0; j < A[i].length; j++){
                if (A[i][j] > max){
                    max = A[i][j];
                }
            }

            res[i] = max;
        }
        return res;
    }

    public static void main(String[] args) {
        int [][] arr = {
                {1,9,3},
                {-2,-1,-6},
                {90,8,9}
        };

        int[] arr2 = getMaxEachRow(arr);

        for (int i : arr2){
            System.out.println(i);
        }
    }
}