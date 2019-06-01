public class LengthOfLastWord_58{
    public static void main(String[] arguments) {
        
    }
    public int climbStairs(int n) {
        n++;
        return (int)(1/Math.sqrt(5)*(Math.pow((1+Math.sqrt(5))/2,n)-Math.pow((1-Math.sqrt(5))/2,n)));
    }
}