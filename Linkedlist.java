import java.util.*;
class Node
{
	protected int data ;
	protected Node link ;
	public Node ()
	{
		link = null;
		data = 0 ;
	}
	public Node (int d,Node n )
	{
		data = d ;
		link = n ;
	}
	public void setLink (Node n )
	{
		link = n ;
	}
	public void setData (int d )
	{
		data = d ;
	}
	public Node getLink ()
	{
		return link;
	}
	public int getData ()
	{
		return data ;
	}
}
class linkedlist
{
	protected Node rear,front;
	public linkedlist ()
	{
		front = null;
		rear = null;
	}
	public void insert (int data )
	{
		int flag = 0;
		Node ob = front;
		Node nptr = new Node (data, null);
		if (rear == null)
		{
			front = nptr ;
			rear = nptr ;
			
		}
		else
		{
		while(ob !=rear.getLink()){
			if(data == ob.getData()){
				System.out.println("Sorry... Duplicate Element Not Allowed");
				flag = 1;
				break;
			}
			ob = ob. getLink ();
		}
		if (flag == 0){
				rear. setLink(nptr );
 				rear = rear. getLink ();
				
			}
				
		}
	}
	public void display ()
	{
		System.out .print("\n List = " );
		
		Node ptr = front ;
		while (ptr != rear.getLink() )
		{
			System .out.print (ptr.getData ()+ " " );
			ptr = ptr. getLink ();
		}
		System.out .println();
	}
}
public class Link
{
	public static void main (String[] args )
	{
		int r=1;
		Scanner scan = new Scanner (System. in);
		linkedlist lq = new linkedlist ();
		System.out .println("Linked List \n " );
		char ch ;
		do
		{
			System .out.println ("Enter integer element to insert" );
			lq. insert( scan. nextInt() );
			lq.display();
		}while(r>0);
	}
}

