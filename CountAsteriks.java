public class CountAsteriks {
    public int countAsterisks(String s) {
        int out = 0;
        int i = 0;

        while(i<s.length()){
            char ch = s.charAt(i);
            if(ch == '|'){
                int j = 0;
                for(j=i+1; j<s.length(); j++){
                    char c = s.charAt(j);
                    if(c == '|'){
                        i = j+1;
                        break;
                    }
                }
            }else{
                if(ch == '*'){
                    out++;
                }
                i++;
            }
        }
        return out;
    }
}
