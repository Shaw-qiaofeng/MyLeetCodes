import java.util.ArrayList;

public class ReverseWordsInAString_151 {
    public String reverseWords(String s) {
        if(s.length()==0){
            return s;
        }
        boolean voi = true;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)!=' '){
                voi = false;
            }
        }
        if(voi){
            return "";
        }
        while(s.charAt(0)==' '){
            s = s.substring(1,s.length()-1);
        }
        while(s.charAt(s.length()-1)==' '){
            s = s.substring(0,s.length()-2);
        }
        String[] buff = s.split(" ");
        ArrayList<String> haha = new ArrayList();
        for(int i = 0; i < buff.length; i++){
            if(buff[i].length()>0){
                haha.add(buff[i]);
            }
        }
        StringBuffer buffer = new StringBuffer();
        for(int i = 0; i < haha.size(); i++){
            buffer.append(haha.get(haha.size()-1-i));
            if(i < haha.size()-1){
                buffer.append(" ");
            }
        }
        return buffer.toString();
    }
}