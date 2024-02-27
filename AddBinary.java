class Solution {
    public String addBinary(String a, String b) {
       int i = a.length()-1;
       int j = b.length()-1;
       int aInt = 0 , bInt = 0 ,carry =0;
       int sum = 0;
       String result = "";
       while(i>=0 || j>= 0 || carry !=0){
           aInt = bInt = 0;
           if(i>=0){
               aInt = Character.getNumericValue(a.charAt(i));
               i-=1;
           }
           if(j>=0){
               bInt = Character.getNumericValue(b.charAt(j));
               j-=1;
           }
           sum = aInt+bInt+carry;
           carry = sum / 2;
           result  = sum%2 + result;
       }
       return result;
    }
}