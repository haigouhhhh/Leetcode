package helloworld;

import java.util.Arrays;

public class Implement_strStr28 
{
	 public static int strStr(String haystack, String needle) 
	    {
	        if(haystack.length()==0&&needle.length()==0)
	            return 0;
	        int length=needle.length();
	        int i=0;
	        while(i+length<=haystack.length())
	        {
	            if(haystack.substring(i,i+length).equals(needle))
	                return i;
	            i++;
	        }
	        return -1;
	    }
	 public static void main(String[] args)
		{
			String s1="";
			String s2="a";
			System.out.println(Implement_strStr28.strStr(s1, s2));
		}
}
