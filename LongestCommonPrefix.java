package helloworld;

public class LongestCommonPrefix 
{
	public static String longestCommonPrefix(String[] strs) 
    {
		if(strs==null||strs.length==0||strs[0].length()==0)
			return "";
		String Old_Prefix=strs[0].substring(0,1);
        for(int i=0;i<strs[0].length();i++)
        {
        	String Prefix=strs[0].substring(0,i+1);
        	int flag=0;
        	for(int j=1;j<strs.length;j++)
        	{
        		if(strs[j].length()<i+1||!strs[j].substring(0,i+1).equals(Prefix))
        		{
        			flag=1;		
        			break;
        		}
        	}
        	if(i==0&&flag==1)
        		return "";
        	if(flag==1)
        		break;
        	Old_Prefix=Prefix;
        	//System.out.print(Old_Prefix);
        }
        return Old_Prefix;
    }
	public static void main(String[] args)
	{
		String[] str={};
		System.out.print(longestCommonPrefix(str));
	}
}
