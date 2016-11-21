package problem344;

public class Solution {
    public String reverseString(String s) {
        StringBuffer sb = new StringBuffer();	//构造stringbuffer对象
        
        for(int i = s.length()-1 ; i >= 0 ; i--){
        	sb.append(s.charAt(i));
        }
    	return sb.toString();
    }
}
