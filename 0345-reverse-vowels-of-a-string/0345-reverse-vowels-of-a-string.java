class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> st = new HashSet<>();
        st.add('a');
        st.add('e');
        st.add('i');
        st.add('o');
        st.add('u');
        st.add('A');
        st.add('E');
        st.add('I');
        st.add('O');
        st.add('U');
        String str = "";
        char[] ch=s.toCharArray();
        int j=ch.length-1;
        int i=0;
        while(i<j){
            if(!st.contains(ch[i])){
               i++;
            }
            else if(!st.contains(ch[j])){
                j--;
            }
            else{
                 char temp =ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                j--;
                i++;
            }
        }
        for(int p=0;p<ch.length;p++){
            str=str+ch[p];
        }
        return str;
    }
}