package arrayandaarlist;



public class leetcode1380 {
    public static void main(String[] args) {

    }

static int lucky(int [][] matrix){
 int min=0;
 int max=0;
    for (int i = 0; i < matrix.length; i++) {

        for (int j = 0; j < matrix[i].length; j++) {
            if (matrix[i][j]>min){
                min=matrix[i][j];

            }
       }
    }
    return 0;
}
}
