package helloworld;

public class InsertElement 
{
	class Solution {
	    public int searchInsert(int[] nums, int target)
	    {
	        if(nums.length==0)
	            return 0;
	        int i=0;
	        for(;i<nums.length;i++)
	        {
	            if(target==nums[i]||target<nums[i])
	                return i;
	        }
	        return i;
	    }
	}
}
