package problem345;

import java.util.HashSet;

public class Solution {
    public String reverseVowels(String s) {
        StringBuffer sb = new StringBuffer();	//����stringbuffer����
        char[] ch = s.toCharArray();					//���ַ������Ϊ����

        //����hashset���ϣ����Ԫ����ĸ
        HashSet<Character> hashset = new HashSet<Character>();
        hashset.add('a');hashset.add('e');hashset.add('i');hashset.add('o');hashset.add('u');
        hashset.add('A');hashset.add('E');hashset.add('I');hashset.add('O');hashset.add('U');

        int head = 0 , tail = ch.length-1;
        while(head < tail){
        	if( hashset.contains(ch[head]) && hashset.contains(ch[tail]) ){	//�����ǰ��ͷ��β��ΪԪ������ô������Ԫ�أ�ͷָ����ƣ�βָ��ǰ��
        		char temp = ch[head] ; ch[head] = ch[tail] ; ch[tail] = temp;
        		head++ ; tail--;
        	}else{																						//���ͷ��β��ͬʱ����Ԫ��
        		if( !hashset.contains(ch[head]) )		//ͷ��������Ԫ��ʱ��ͷָ����ƣ�Ԫ�ر��ֲ���	
        			head++;
        		if( !hashset.contains(ch[tail]) )		//β��������Ԫ��ʱ��βָ��ǰ�ƣ�Ԫ�ر��ֲ���
        			tail--;
        	}
        }
        sb.append(ch);
    	return sb.toString();
    }
}
