package problem299;

import java.util.ArrayList;

/*���Ƚ��ַ���תΪ�ַ����飬���αȽ��ַ������ϵĶ�ӦԪ��
 * 		�����ȣ���ͳ��ֵcountb++
 * 		�������ȣ��򽫶�ӦԪ�طֱ�洢��ArrayList��
 * 
 * Ȼ����arraylist1��indexλ���ϵ�Ԫ���Ƿ���arraylist2��
 * 		���ڵĻ�����index++
 * 		�ڵĻ�countc++,���ҷֱ��Ƴ�����arraylist�е���ӦԪ�أ�index���ֲ���
 * �ظ��ڶ�����ֱ��������ͷ����һ���б�Ϊ��
 * */

public class Solution {
	public String getHint(String secret, String guess) {
		char[] sch = secret.toCharArray();
		char[] gch = guess.toCharArray();
		
		int countb=0,countc=0;
		ArrayList<Character> slist = new ArrayList<>();
		ArrayList<Character> glist = new ArrayList<>();
		
		for(int index=0 ; index<sch.length ; index++){
			if(sch[index] == gch[index])
				countb++;
			else{
				slist.add(sch[index]);
				glist.add(gch[index]);
			}
		}
		
		for(int index=0 ; index<slist.size() && (!glist.isEmpty()) ; index++){
			if( !glist.contains(slist.get(index)) )
				continue;
			else{
				countc++;
				glist.remove(slist.get(index));
				slist.remove(index);
				index--;
			}
		}
		
		return countb+"A"+countc+"B";
	}
}
