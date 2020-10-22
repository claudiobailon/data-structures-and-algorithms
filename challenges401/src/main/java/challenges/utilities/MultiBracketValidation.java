package challenges.utilities;

import java.util.*;


public class MultiBracketValidation {
    // referenced https://www.thepolyglotdeveloper.com/2015/02/validate-bracket-parenthesis-combos-using-stacks/
    public boolean multiBracketValidation(String input) throws NullPointerException{
        if(input == null)throw new NullPointerException();
        boolean result = true;//will assume true until a condition returns false
        Stack<Character> stack = new Stack<Character>();
        char current, previous;// variables to help keep track
        for (int i = 0; i < input.length(); i++) {//iterates through the entire string
            current = input.charAt(i);
            if (current == '(' || current == '{' || current == '[') {
                stack.push(current);//this pushes any opening brackets into the stack
            } else if (current == ')' || current == '}' || current == ']') {
                if (stack.isEmpty())
                    result = false;//if we find a closing bracket and the stack is empty, that means it has no matching bracket so we return false
                else {
                    previous = stack.peek();//this shows the last open curly bracket that we pushed into the stack
                    if ((current == ')' && previous == '(' || current == '}' && previous == '{' ||
                            current == ']' && previous == '[')) {//if the current bracket matches the previous bracket, we pop off the previous bracket
                        stack.pop();
                    } else result = false;//if they don't match, the string isn't balanced so we return false
                }
            }
        }
        if(!stack.isEmpty()) result = false;//if we iterate through the string and the stack still has a value, return false
        return result;
    }
}
