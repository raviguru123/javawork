package first;

import java.util.ArrayList;

public class arrayDifference {
	ArrayList<Integer> list=new ArrayList<Integer>();
	int max;
	public void arrayDifference(int...values){
		max=Integer.MIN_VALUE;
		for(int value:values)
			list.add(value);
	}
	
	private int findMax(int first,int second){
		return first>second?first:second;
	}
	
	public int FindMaximumDifference(){
		
		int left=0,right=list.size();
		while(left<right){
			
		}
		
	return 0;
	}
	
}
