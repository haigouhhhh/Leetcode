package helloworld;

import java.util.ArrayList;

public class Solution 
{
	public static int reverse(int x) 
    {
		double res=0;
		int tail=x%10;
		while(x!=0)
		{
			double new_res=res*10+tail;
			x=x/10;
			tail=x%10;
			res=new_res;
		}
		if(res>=Math.pow(2, 31)||res<-Math.pow(2, 31))
			return 0;
		else
			return (int)res;
    }//С��2 -31����reverse�Ƿ�Խ��
	public static void main(String[] args)
	{
		System.out.print(reverse(1563847412));
	}
}
