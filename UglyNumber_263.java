class Solution {
    public boolean isUgly(int num) {
        if(num < 1)return false;
        while(num>=1){
            if(num==1)return true;
            else if(num%2==0)num/=2;
            else if(num%3==0)num/=3;
            else if(num%5==0)num/=5;
            else return false;
        }
    return false;
    }
}