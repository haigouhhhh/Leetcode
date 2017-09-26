package helloworld;

import java.util.Stack;

public class ValidParentheses 
{
	static public boolean isValid(String s)       //½«×óÀ¨ºÅÑ¹Õ» Óö¼ûÓÒÀ¨ºÅ³öÕ» ÅĞ¶ÏÊÇ·ñÖğ¸öÆ¥Åä ±éÀúÕû¸ö´®
    { 
        if(s.length()==0)
        	return true;
        Stack<String> stack=new Stack<String>();
        for(int i=0;i<s.length();i++)
        {
        	char key=s.charAt(i);
        	if(key=='('||key=='['||key=='{')
        		stack.push(String.valueOf(key));
        	else
        	{
        		System.out.println("hi");
        		System.out.println(key);
        		if(stack.isEmpty())
        			return false;
        		String tmp=stack.pop();
        		switch (key) 
        		{
				case ')':
					if(!tmp.equals("("))
					{
						System.out.println("hello");
						return false;
					}
					break;
				case ']':
					if(!tmp.equals("["))
					{
						System.out.println("hello1");
						return false;
					}
					break;
				case '}':
					if(!tmp.equals("{"))
					{
						System.out.println("hello1");
						return false;
					}
					break;
				default:
					return false;
				}
        	}
        	System.out.println(i);
        }
        if(stack.isEmpty())
		return true;
        else
        	return false;
    }
	public static void main(String[] str)
	{
		System.out.print(isValid("[])"));
	}
}
