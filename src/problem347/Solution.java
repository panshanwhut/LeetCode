package problem347;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {
	public List<Integer> topKFrequent( int[] nums , int k) {
		
		//����HashMap���洢����Ԫ�أ�key����Ԫ�أ�value������ִ���
		HashMap<Integer, Integer> srcMap = new HashMap<>();
		for(int item:nums)
			if( !srcMap.containsKey(item))
				srcMap.put(item, 1);
			else
				srcMap.put(item, srcMap.get(item)+1);
		
		//����ArrayList�������ڴ洢hashmap����entry
		ArrayList<Map.Entry<Integer, Integer>> arraylist = new ArrayList<>(srcMap.entrySet());
		ArrayList<Integer> results = new ArrayList<>();
		
		if(arraylist.size() <= k){
			for(Map.Entry<Integer, Integer> item:arraylist)
				results.add(item.getKey());
		}else{
			//��ArrayList��Ԫ�ص�value���н�������
			Collections.sort(arraylist, new Comparator<Map.Entry<Integer, Integer>>() {
				
				@Override
				public int compare(Map.Entry<Integer, Integer> o1 , Map.Entry<Integer, Integer> o2) {
					return o1.getValue()-o2.getValue();
				}
			});
			
			//���ArrayList��ǰk��Ԫ�ص�valueֵ
			for(int i=0 ; i<k ; i++)
				results.add(arraylist.get(i).getKey());			
		}
		
		return results;
	}
}