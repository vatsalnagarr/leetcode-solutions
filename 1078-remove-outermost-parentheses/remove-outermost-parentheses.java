class Solution {
    public String removeOuterParentheses(String d) {
        //    public String removeOuterParentheses(String S) {
        StringBuilder s= new StringBuilder();
        int opened = 0;
        for (char c : d.toCharArray()) {
            if (c == '(' && opened++ > 0) s.append(c);
            if (c == ')' && opened-- > 1) s.append(c);
        }
        return s.toString();
    }
    
    }
// }