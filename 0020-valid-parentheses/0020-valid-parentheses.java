class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        char top;
        for(char ch:s.toCharArray()){
            if(ch=='('||ch=='['||ch=='{'){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                top=stack.pop();
               if (ch == ')' && top != '(') {
                    return false;
                }
                else if (ch == '}' && top != '{') {
                    return false;
                }
                else if (ch == ']' && top != '[') {
                    return false;
                    }
                }
            }
    if(stack.isEmpty()){
        return true;
    }
    else{
        return false;
    }
    }
}
