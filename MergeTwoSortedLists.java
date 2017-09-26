package helloworld;

import java.awt.List;

public class MergeTwoSortedLists 
{
	public static class ListNode
	{
		int val;
		ListNode next;
		public  ListNode(int x){this.val=x;}
	}
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) 
    {
        ListNode head =null;
        ListNode current=head;
        // l1: a1 a2 a3 a4 ```````an
        // l2: b1 b2 b3 b4````````bn
        while(l1!=null&&l2!=null)
        {
           if(l1==null||l1.val>l2.val)
        	   {
        	   if(head==null)
        		   {
        		   current=new ListNode(l2.val);
        		   head=current;
        		   }
        	   else
        		   current.val=l2.val;
        	   ListNode newnode=null;
        	   current.next=newnode;
        	   current=newnode;
        	   l2=l2.next;
        	   }
        	   }
           if(l2==null||l1.val<l2.val)
           {
        	   current.val=l1.val;
        	   ListNode newnode=null;
        	   current.next=newnode;
        	   current=newnode;
        	   l1=l1.next;
           }
        }
        return head;
    }
	public static void main(String[] args)
	{
		ListNode l1=null;//=new ListNode(0);
		ListNode l2=new ListNode(1);
		System.out.println(mergeTwoLists(l1,l2).val);
	}
}
