public class StringReverse {

    public static String solve(String A) {

        char[] arr = A.toCharArray();
        int l=0, r=arr.length-1;

        for(l=0; l<r; l++,r--) {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
        }

        return new String(arr);

    }

    public static void main (String ar[]) {

        String A = "soumya";
        System.out.println(solve(A));
    }

}
