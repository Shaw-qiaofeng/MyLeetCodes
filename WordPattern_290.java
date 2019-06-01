public class wordPattern_290 {
    public boolean wordPattern(String pattern, String str) {
        if(pattern.length()+str.length()==0) return true;
        if((pattern.length()+str.length()!=0)&&((pattern.length()==0)||(str.length()==0))) return false;
        
        String[] p = pattern.split("");
        String[] s = str.split(" ");
        
        if(p.length!=s.length)return false;
        
        for(int i = 0; i < p.length-1; i++){
            for(int j = i+1; j < p.length; j++){
                if(s[i].equals(s[j])){
                    if(!p[i].equals(p[j])){
                        return false;
                    }
                }
            }
        }
        
        for(int i = 0; i < p.length-1; i++){
            for(int j = i+1; j < p.length; j++){
                if(p[i].equals(p[j])){
                    if(!s[i].equals(s[j])){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}