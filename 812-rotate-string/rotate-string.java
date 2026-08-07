class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder sb = new StringBuilder(s);
        for(int i =0;i<sb.length();i++){
            char ch = sb.charAt(0);
             sb.deleteCharAt(0);
            sb.append(ch); 
            if(sb.toString().equals(goal)){
                return true;
            }
             
        }
        return false;
    }
}