class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        int next=1;
          String k="";
        int openingbrac=0;
        int closingbrac=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                openingbrac++;
            }
            else{
                closingbrac++;
            }
             if(openingbrac==closingbrac){
                   k+=s.substring(next,i);
                   next =i+2;
                   
          openingbrac=0;
         closingbrac=0;
             }
        }
       return k;
    
    }
}