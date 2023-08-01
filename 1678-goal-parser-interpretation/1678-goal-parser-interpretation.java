class Solution {
    public String interpret(String command) {
        String str="";
        for(int i=0;i<command.length();i++){
            char ch=command.charAt(i);
            if(ch=='G'){
                str=str+ch;
            }
            else if(ch=='('){
                if(command.charAt(i+1)==')'){
                      str=str+'o';
                }
                
                
            }
            else if(ch=='a'){
                str=str+ch;
            }
            else if(ch=='l'){
                str=str+ch;
            }
        }
        return str;
    }
}