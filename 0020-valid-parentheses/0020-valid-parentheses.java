import java.util.*;
class Solution {
    public boolean isValid(String s) {
    Stack<Character> stack = new Stack<Character>();
    char charr[] = s.toCharArray();
    for(char ch : charr){
        switch(ch){
            case '(': 
            case '[':
            case '{':
                stack.push(ch);
                break;
            case ')':
            if(!stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
            break;

             case ']':
            if(!stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
            break;

             case '}':
            if(!stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
            break;
        }
    }


    return stack.isEmpty();  
    }
}