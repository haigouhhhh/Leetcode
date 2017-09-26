package helloworld;

import java.util.HashMap;
import java.util.Map;

public class helloworld
{
    public static int[] twoSum(int[] nums, int target) 
    {
    	Map<Integer, Integer> map1=new HashMap<>();
    	for(int i=0;i<nums.length;i++)
    		map1.put(nums[i], i);
    	for(int i=0;i<nums.length;i++)
    	{
    		int complement=target-nums[i];
    		if(map1.containsKey(complement)&&map1.get(complement)!=i)
    		{
    			return new int[]{i,map1.get(complement)};
    		}
    	}
    	throw new IllegalArgumentException("NULL");
    }
    public static void main(String args[])
    {
    	int[] nums={1,2,3};
    	int target=5;
    	int[] a=twoSum(nums,target).clone();
     	System.out.println(a[0]);
     	System.out.println(a[1]);

    }
}
