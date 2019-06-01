public class ValidAnagram_242 {
    public boolean isAnagram(String s, String t) {
        int[] alphaOne = new int[26];
        for(int i = 0; i < s.length(); i++){
            alphaOne[indexOf(s.charAt(i))]++;
        }
        int[] alphaTwo = new int[26];
        for(int i = 0; i < t.length(); i++){
            alphaTwo[indexOf(t.charAt(i))]++;
        }
        
        if(Arrays.equals(alphaOne,alphaTwo)){
            return true;
        }else{
            return false;
        }
    }
    
    public int indexOf(char s){
        String mode = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < 26; i++){
            if(s == mode.charAt(i)){
                return i;
            }
        }
        return -1;
    }
}
