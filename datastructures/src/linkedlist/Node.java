package linkedlist;

class Node {
	public int Data;
	public Node link;
	
	public Node()
	{
		Data=0;
		link=null;
	}
	
	public Node(int d, Node l)
	{
		Data=d;
		link=l;
	}
	
	public void setData(int n)
	{
		Data=n;
	}
	
	public void setLink(Node l)
	{
		link=l;
	}
	
	public int getData()
	{
		return Data;
	}
	
	public Node getLink()
	{
		return link;
	}

}

class LinkedList
{
	public Node start;
	public Node end;
	public int size;
	
	public LinkedList()
	{
		start=null;
		end=null;
		size=0;
	}
	
	public boolean isEmpty()
	{
		if(start==null)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public void insertatStart(int val)
	{
		Node nptr=new Node(val,null);
		size++;
		if ( start==null)
		{
			start=nptr;
			end=nptr;
			
		}
		
		else
		{
			nptr.setLink(start);
			start=nptr;
			
			
		}
	}
	public void insertatEnd(int val)
	{
		Node enptr=new Node(val,null);
		size++;
		if(end==null)
		{
			end=enptr;
			start=enptr;
			
		}
		else
		{
			end.setLink(enptr);
			end=enptr;
		}
		
	}
	
	public void insertatPos(int val,int pos)
	{
		
	}
	
	
}
