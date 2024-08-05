class Solution {
    public int reverse(int x) {
        int reverse = 0; 
        if(x<0){
            while(x<0){
            int rem = x%10;
            if (reverse < (Integer.MIN_VALUE - rem) / 10) {
                return 0;
            }
            reverse = reverse*10 +rem;
            x=x/10;
        }
        return reverse;
        }
        while(x>0){
            int rem = x%10;
            if (reverse > (Integer.MAX_VALUE - rem) / 10) {
                return 0;
            }
            reverse = reverse*10 +rem;
            System.out.println(reverse);
            x=x/10;
        }
        
        return reverse;
    }
}