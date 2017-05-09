package Algorithms;

import java.util.HashMap;
import java.util.Map;

/*
 * Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */
public class TwoSum {

	public static int [] get(int [] arr,int target)
	{
		//Array to store the indices
		int [] result= new int[2];
		
		Map<Integer,Integer> map= new HashMap<Integer,Integer>();
		for(int i=0;i<=arr.length;i++){
			if(map.containsKey(target-arr[i])){
				result[1]=i+1;
				result[0]=map.get(target-arr[i]);
				return result;
			}
			map.put(arr[i],arr[i+1]);
		}
		return result;
				
	}
}
