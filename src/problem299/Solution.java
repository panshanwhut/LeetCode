package problem299;

import java.util.ArrayList;

/*首先将字符串转为字符数组，依次比较字符数组上的对应元素
 * 		如果相等，则统计值countb++
 * 		如果不相等，则将对应元素分别存储到ArrayList中
 * 
 * 然后检查arraylist1中index位置上的元素是否在arraylist2中
 * 		不在的话索引index++
 * 		在的话countc++,并且分别移除两个arraylist中的相应元素，index保持不变
 * 重复第二步，直至索引到头或另一个列表为空
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
