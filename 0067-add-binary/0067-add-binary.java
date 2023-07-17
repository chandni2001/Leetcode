class Solution {
    public String addBinary(String a, String b) {
        
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() -1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0) sum += b.charAt(j--) - '0';
            if (i >= 0) sum += a.charAt(i--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
//         String str="";
//         char c='0';
//         int i = a.length() -1;
//         int j = b.length() - 1;
//         while(i >= 0 && j >= 0) {
            
//             char c1=a.charAt(i);
//             char c2=b.charAt(j);
//             if(c1=='1' && c2=='1'){
//                 str='0'+str;
//                 c='1';
//             }
//             else if(c1=='1' && c2=='0' || c2=='1' && c1=='0'){
//                 if(c=='1'){
//                     str='0'+str;
//                     c='1';
//                 }
//                 else{
//                     str='1'+str;
//                     c='0';

//                 }
//             }

//             else if(c1=='0' && c2=='0'){
//                 if(c=='1'){
//                     str='1'+str;
//                     c='0';
//                 }
//                 else{
//                     str='0'+str;
//                     c='0';
//                 }
//             }
//              i--; j--;

//         }
        
//         if(i >= 0){
//             while( i >= 0){
//                 char ch = a.charAt(i);
                
//                 if(ch == '1' && c == '1'){
//                     str = '0' + str;
//                     c = '1';
//                 }else if((ch == '1' && c == '0') || (ch == '0' && c == '1')){
//                     str = '1' + str;
//                     c = '0';
//                 }
//                 else if( ch == '0' && c == '0'){
//                     str = '0' + str;
//                     c = 0;
//                 }
//             i--;
                
//             }
//         }
//         if( j >= 0){
//             while( j >= 0){
//                 char ch = b.charAt(j);
                
//                 if(ch == '1' && c == '1'){
//                     str = '0' + str;
//                     c = '1';
//                 }else if((ch == '1' && c == '0') || (ch == '0' && c == '1')){
//                     str = '1' + str;
//                     c = '0';
//                 }
//                 else if( ch == '0' && c == '0'){
//                     str = '0' + str;
//                     c = 0;
//                 }
//                 j--;   
//             }
//         }
        
//         if(c =='1'){
//             str= '1'+str;
//         }
//         return str;
        
    }
}