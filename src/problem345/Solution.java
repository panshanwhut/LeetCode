package problem345;

import java.util.HashSet;

public class Solution {
    public String reverseVowels(String s) {
        StringBuffer sb = new StringBuffer();	//构造stringbuffer对象
        char[] ch = s.toCharArray();					//将字符串拆分为数组

        //创建hashset集合，存放元音字母
        HashSet<Character> hashset = new HashSet<Character>();
        hashset.add('a');hashset.add('e');hashset.add('i');hashset.add('o');hashset.add('u');
        hashset.add('A');hashset.add('E');hashset.add('I');hashset.add('O');hashset.add('U');

        int head = 0 , tail = ch.length-1;
        while(head < tail){
        	if( hashset.contains(ch[head]) && hashset.contains(ch[tail]) ){	//如果当前的头、尾均为元音，那么交换两元素；头指针后移，尾指针前移
        		char temp = ch[head] ; ch[head] = ch[tail] ; ch[tail] = temp;
        		head++ ; tail--;
        	}else{																						//如果头和尾不同时包含元音
        		if( !hashset.contains(ch[head]) )		//头部不包含元音时，头指针后移，元素保持不变	
        			head++;
        		if( !hashset.contains(ch[tail]) )		//尾部不包含元音时，尾指针前移，元素保持不变
        			tail--;
        	}
        }
        sb.append(ch);
    	return sb.toString();
    }
}
