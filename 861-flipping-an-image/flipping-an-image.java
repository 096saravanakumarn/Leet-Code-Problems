class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int r = image.length;
        int c = image.length;
        int arr[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            int k = 0;
            for (int j = c - 1; j >= 0; j--) {
                arr[i][k] = image[i][j];
                k++;
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] == 1) {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = 1;
                }
            }
        }
        return arr;
    }
}