class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        int count =0;
          for(int i=0;i<-0;i++)
          {
            if(num.charAt(i)==0){
                count++;
            }
            else
                break;
          }
          for(int i=n-1;i>=0;i--){
            if((int)num.charAt(i)%2!=0){
                return num.substring(count,i+1);
            }
          }
          return "";
        }
     
}