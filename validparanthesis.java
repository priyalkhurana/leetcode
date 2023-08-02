class Solution {
    public boolean isValid(String s) {
        Stack<Character> brackets= new Stack<>();
        Map<Character, Character> bracketlookup= new HashMap<>(3);

        bracketlookup.put(')','(');
        bracketlookup.put('}','{');
        bracketlookup.put(']','[');

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(bracketlookup.containsKey(c)){
                if(!brackets.isEmpty() && bracketlookup.get(c).equals(brackets.peek())){
                    brackets.pop();
                }
                else{
                    return false;
                }
            }else{
                brackets.push(c);
            }
        }
        return brackets.isEmpty();

    }
}
