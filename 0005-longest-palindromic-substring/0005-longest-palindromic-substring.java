class Solution {
    public String longestPalindrome(String s) {
       int len=s.length();
       if(len==1){
        return s;
       }
       if(len==2){
        if(s.charAt(0)==s.charAt(1)){
            return s;
        }
        else{
           String str=Character.toString(s.charAt(0));
            return str;
        }
       }
       String sub="";
       for(int i=0;i<len;i++){
        for(int j=i;j<len;j++){
            if(isPalindrome(s,i,j)){
                if(j-i+1>sub.length()){
                    sub=s.substring(i,j+1);
                }
            }
        }
       }
       return sub;
    }

            public boolean isPalindrome(String s,int i,int j){
                while(i<j){
                    if(s.charAt(i)!=s.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
            return true;
       }
    }
