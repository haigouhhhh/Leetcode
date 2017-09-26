package helloworld;

public class RemoveDuplicate 
{
	 static  public int removeDuplicates(int[] nums) 
	    {
	        if(nums.length==0)
				 return 0;
	        int i=0;
	        for(int j=1;j<nums.length;j++)
	        {
	        	if(nums[i]!=nums[j])
	        	{
	        		i++;
	        		nums[i]=nums[j];
	        	}
	        }
	        return i;
	    }
	 public static void main(String[] args)
	 {
		 System.out.println(RemoveDuplicate.removeDuplicates(new int[]{1,1,1,2,2,3,4,4}));
	 }
}
