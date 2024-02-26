class Solution {
    public int romanToInt(String s) {
        Map<String , Integer> map = new HashMap();
        int  sum = 0;
        map.put("I",1);map.put("V",5);map.put("X",10);map.put("L",50);map.put("C",100);
        map.put("D",500);map.put("M",1000);
        int index = s.length();
        int currentMax = 0;
        for( ; index>0;index--){
            int right = map.get(s.substring(index-1,index));
            if(right>=currentMax){
                currentMax = right;
                sum+= currentMax;
            }else{
                sum-=right;
            }
        }
        return sum;
    }
}