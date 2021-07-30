package Arrays;

public class RotateMatrix {

    public static void main(String ar[]) {

        int[][] a = {{1,2},{3,4}};

        //take transpose
        for(int i=0; i<a.length; i++) {
            for(int j=i; j<a[0].length; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        //reverse all rows one by one - to make first column the last column and so on

        for(int i=0; i<a.length; i++) {
            int left = 0;
            int right = a[i].length-1;

            while(left<=right) {
                int temp = a[i][left];
                a[i][left] = a[i][right];
                a[i][right] = temp;
                left++;
                right--;
            }

        }

        for (int i=0; i<a.length; i++) {
            System.out.println();
            for(int j=0; j<a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
        }

    }

}
