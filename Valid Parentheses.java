public class Solution {
    public boolean isValid(String s) {
        if (s == null || s.equals("")) return true;
        if (s.length() == 1) return false;

        char[] c = s.toCharArray();
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < c.length; i++) {
            if (c[i] == '(' || c[i] == '[' || c[i] == '{') {
                st.push(c[i]);
            } else {
                if (st.isEmpty()) return false;
                Character head = st.pop();
                if ((c[i] == ')' && !head.equals('(')) ||
                        (c[i] == ']' && !head.equals('[')) ||
                        (c[i] == '}' && !head.equals('{'))) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
