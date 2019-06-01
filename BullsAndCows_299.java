class Solution {
    public String getHint(String secret, String guess) {
        int bull = 0;
        int cow = 0;
        boolean[] bulled = new boolean[secret.length()];
        for(int i = 0; i < secret.length(); i++){
            bulled[i] = false;
        }
        for(int i = 0; i < secret.length(); i++){
            if(secret.charAt(i)==guess.charAt(i)){
                bulled[i] = true;
                bull++;
            }
        }
        ArrayList listSecret = new ArrayList();
        ArrayList listGuess = new ArrayList();
        
        for(int i = 0; i < secret.length(); i++){
            listSecret.add(secret.charAt(i));
            listGuess.add(guess.charAt(i));
        }
        
        for(int i = listSecret.size()-1; i >= 0; i--){
            if(bulled[i]){
                listSecret.remove(i);
                listGuess.remove(i);
            }
        }
        
        if(listSecret.size()==0)return bull+"A0B";
        
        for(int i = 0; i < listSecret.size(); i++){
            for(int j = 0; j < listSecret.size(); j++){
                if(listSecret.get(i)==listGuess.get(j)){
                    cow++;
                    listSecret.remove(i);
                    listGuess.remove(j);
                    i--;
                    break;
                }
            }
        }
        
        return bull+"A"+cow+"B";            
    }
}