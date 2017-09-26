package helloworld;

import java.util.HashMap;
import java.util.Map;

public class Roman_to_Integer 
{
	 public static int romanToInt(String s) 
	    {
	        Map<String, Integer>  map1=new HashMap<String, Integer>();
	        map1.put("I",1);
	        map1.put("II",2);
	        map1.put("III",3);
	        map1.put("IV",4);
	        map1.put("V", 5);
	        map1.put("VI", 6);
	        map1.put("VII", 7);
	        map1.put("VIII", 8);
	        map1.put("IX", 9);
	        map1.put("X", 10);
	        map1.put("XX", 20);
	        map1.put("XXX",30 );
	        map1.put("XL",40 );
	        map1.put("L",50 );
	        map1.put("LX",60 );
	        map1.put("LXX",70 );
	        map1.put("LXXX",80 );
	        map1.put("XC",90 );
	        map1.put("C",100 );
	        map1.put("CC",200 );
	        map1.put("CCC",300 );
	        map1.put("CD",400 );
	        map1.put("D",500 );
	        map1.put("DC",600 );
	        map1.put("DCC",700 );
	        map1.put("DCCC",800 );
	        map1.put("CM",900 );
	        map1.put("M",1000 );
	        map1.put("MM",2000 );
	        map1.put("MMM",3000 );
	        int num=0;
	        Boolean flag=false;
	        for(int i=0;i<s.length();i++)
	        {
	        	if(s.length()-i>=4)
	        	{
	        		if(map1.containsKey(s.subSequence(i, i+4)))
	        		{
	        			num=num+map1.get(s.subSequence(i, i+4));
	        			i=i+3;
	        			continue;
	        		}
	        		if(map1.containsKey(s.subSequence(i, i+3)))
	        		{
	        			num=num+map1.get(s.subSequence(i, i+3));
	        			i=i+2;
	        			continue;
	        		}
	        		if(map1.containsKey(s.subSequence(i, i+2)))
	        		{
	        			num=num+map1.get(s.subSequence(i, i+2));
	        			i=i+1;
	        			continue;
	        		}
	        		if(map1.containsKey(s.subSequence(i, i+1)))
	        		{
	        			num=num+map1.get(s.subSequence(i, i+1));
	        			continue;
	        		}
	        	}
	        	if(s.length()-i>=3)
	        	{
	        		if(map1.containsKey(s.subSequence(i, i+3)))
	        		{
	        			num=num+map1.get(s.subSequence(i, i+3));
	        			i=i+2;
	        			continue;
	        		}
	        		if(map1.containsKey(s.subSequence(i, i+2)))
	        		{
	        			num=num+map1.get(s.subSequence(i, i+2));
	        			i=i+1;
	        			continue;
	        		}
	        		if(map1.containsKey(s.subSequence(i, i+1)))
	        		{
	        			num=num+map1.get(s.subSequence(i, i+1));
	        			continue;
	        		}
	        	}
	        	if(s.length()-i>=2)
	        	{
	        		if(map1.containsKey(s.subSequence(i, i+2)))
	        		{
	        			num=num+map1.get(s.subSequence(i, i+2));
	        			i=i+1;
	        			continue;
	        		}
	        		if(map1.containsKey(s.subSequence(i, i+1)))
	        		{
	        			num=num+map1.get(s.subSequence(i, i+1));
	        			continue;
	        		}
	        	}
	        	else
	        		num=num+map1.get(s.subSequence(i, i+1));
	        }
	        return num;
	    }
	 public static void main(String[] args)
	 {
		 System.out.print(romanToInt("MMMDLXXXVI"));
	 }
}
