class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str= new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                str.append(Character.toLowerCase(ch));
            }
        }
           return cp(str.toString()); //str.toString().equals(str.reverse().toString());
    }
  private boolean cp(String r){
    int i=0,j=r.length()-1;
    while(i<j){
        if(r.charAt(i)!=r.charAt(j))return false;
        i++;
        j--; 
    }
    return true;
}
}