class Solution {
    public boolean isHappy(int n) {
	    if (n == 1)return true;
        if(n == 4 || n == 16 || n == 37 || n == 58 || n == 145 || n == 42 || n== 20) return false;
        int sum = 0;
	    while (n > 0) {
		    sum = sum + (n % 10) * (n % 10);
		    n /= 10;
	    }
	    return isHappy(sum);
    }
}