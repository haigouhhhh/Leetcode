package helloworld;

import java.util.Arrays;

public class plusone_66
{
	 static public int[] plusOne(int[] digits) 
	    {
		 if(digits[0]==0)
	            return new int[]{1};
	        for(int i=digits.length-1;i>=0;i--)
	        {
	        	digits[i]=digits[i]+1;
	        	if(digits[i]==10)
                 digits[i]=0;
             else
                 break;
	        }
	        if(digits[0]==0)
	        {
	        	int[] A=new int[digits.length+1];
	        	for(int i=1;i<digits.length+1;i++)
	        		A[i]=0;
	        	A[0]=1;
	        	 return A;
	        }
	       return digits;
	    }
	 static public void main(String[] args)
	 {
		 System.out.println(Arrays.toString(plusOne(new int[]{9})));
	 }
}
