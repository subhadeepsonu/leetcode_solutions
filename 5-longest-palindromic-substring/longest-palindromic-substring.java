class Solution {
    private String Oddpal(String s){
        String lg = "";
        for(int i = 0 ; i < s.length() ; i++){
            int mid = i;
            int sa = mid;
            int e = mid;
            String substr = "";
            while(sa >= 0 && e < s.length()){
                if(s.charAt(sa)==s.charAt(e)){
                    substr=s.substring(sa,e+1);
                    if(substr.length()>lg.length()){
                        lg=substr;
                    }
                    sa--;
                    e++;
                }else{
                    break;
                }

            }

        }
        return lg;
    }
    private String Evenpal(String s){
        String lg ="";
        for(int i = 0 ; i < s.length()-1 ; i++){
            int sa = i;
            int e = i+1;
            String substr = "";
            while(sa>=0 && e <s.length()){
                if(s.charAt(sa)==s.charAt(e)){
                    substr = s.substring(sa,e+1);
                    if(substr.length()>lg.length()){
                        lg=substr;
                    }
                    sa--;
                    e++;
                }
                else{
                    break;
                }
                
            }
        }
        return lg;
    }
    public String longestPalindrome(String s) {
        String a = Oddpal(s);
        String b = Evenpal(s);
        if(a.length()>b.length()){
            return a;
        }
        else{
            return b;
        }
    }   
}