package problem344;

public class Solution {
    public String reverseString(String s) {
        StringBuffer sb = new StringBuffer();	//����stringbuffer����
        
        for(int i = s.length()-1 ; i >= 0 ; i--){
        	sb.append(s.charAt(i));
        }
    	return sb.toString();
    }
}
