public class sisu {

    public static int restock(int itemCount[], int target) {

        int sum = 0;

        for(int item : itemCount) {
            sum+=item;
            if(sum >= target)
                break;
        }

        if(sum < target)
            return sum - target;
        else
            return target - sum;

    }

    public static void main(String ar[]) {

        int[] arr = {10, 20, 30, 40, 15};

        System.out.println(restock(arr, 130));

    }

}
