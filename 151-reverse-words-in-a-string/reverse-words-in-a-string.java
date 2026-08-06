class Solution {
    public String reverseWords(String s) {
        StringBuilder sb =new StringBuilder();
        s=s.trim();
        int n = s.length();
        String j ;
        for(int i=0;i<n;i++){

        int k=s.lastIndexOf(' ');
        if(k==-1){
            sb.append(s);
            break;
        }
        sb.append(s.substring(k+1) );
        sb.append(" ");
        s=s.substring(0,k).trim();
        }
        j=sb.toString();
        return j;
    }
}