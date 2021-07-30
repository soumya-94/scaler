public class IsAlpha {

    public static int solve(char [] A) {

        int result = 0;

        for(char c : A) {

            int num = c;

            if(num >= 97 && num <=122) // a-z
                result=1;
            else if(num >= 65 && num <= 90) //A-Z
                result = 1;
            else
                return 0;
        }

        return 1;

    }

    public static void main (String ar[]) {

        char [] A = {'S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0'};



    }

}
