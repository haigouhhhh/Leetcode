package helloworld;

public class Palindrome_Number 
{
	 public static boolean isPalindrome(int x) 
	    {
		 if(x<0)
			 return false;
	        double res=0;
	        int num=x;
	        int tail=x%10;
	        while(x!=0)
	        {
	            double new_res=res*10+tail;
	            x=x/10;
	            tail=x%10;
	            res=new_res;
	        }
	        if(res>Math.pow(2, 31)-1)
	        	return false;
	        else
	        {
	        	if(num==(int)res)
	        		return true;
	        	else 
					return false;
	        }
	    }
	 public static void main(String[] args)
	 {
		 if(isPalindrome(1))
			 System.out.print("YES");
	 }
}
