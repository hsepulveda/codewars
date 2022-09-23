public class Solution {

    public static int zeros(int n) {
        int count = 0;
        int m = n;

        while(m >= 5){
            count = count + m / 5;
            m = m / 5;
        }

        return count;
    }
}
