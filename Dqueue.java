package mypack;

class DqueueStruct
{
	class Node
	{
		int data;
		Node next;
		Node prev;
		
		Node(int data)
		{
			this.data=data;
			next=null;
			prev=null;
		}
	}
	Node head;
	Node tail;
	
	public void insertElement(int data)
	{
		Node obj=new Node(data);
		if(head==null)
		{
			head=obj;
			tail=head;
			obj.next=null;
			obj.prev=null;
		}
		else
		{
			tail.next=obj;
			obj.prev=tail;
			tail=obj;
			obj.next=null;
		}
	}
	
	public void insertAtFirst(int data)
	{
		Node obj=new Node(data);
		if(head==null)
		{
			head=obj;
			head.prev=null;
			head.next=null;
			tail=head;
		}
		else
		{
			Node current=head;
			obj.next=current;
			head=obj;
			
		}
	}
	
	public void insertAtLast(int data)
	{
		Node obj=new Node(data);
		if(head==null)
		{
			head=obj;
			obj.next=null;
			obj.prev=null;
			tail=head;
		}
		else
		{
			Node last=tail;
			last.next=obj;
			tail=obj;
			obj.next=null;
			
		}
	}
	
	public void deleteFirst()
	{
		if(head==null)
		{
			System.out.println("List are empty...!");
		}
		else
		{
			Node current=head;
			head=current.next;
			head.prev=null;
		}
	}
	
	public void deleteLast() {
	    if (head == null) {
	        System.out.println("List is empty...!");
	    }
	    else 
	    {
	        tail = tail.prev;
	        if (tail != null)
	        {  
	            tail.next = null;
	        }
	    }
	}
	
	public void search(int data)
	{
		if(head==null)
		{
			System.out.println("List is an empty");
		}
		else
		{
			Node current=head;
			while(current!=null)
			{
				if(current.data==data)
				{
					System.out.println("Found");
					return;
				}
				current=current.next;
			}
			System.out.println("Not found");
		}
	}
	public void display()
	{
		Node current=head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
}
public class Dqueue {

	public static void main(String[] args) {
		DqueueStruct obj=new DqueueStruct();
		obj.insertElement(10);
		obj.insertElement(20);
		obj.insertElement(30);
		obj.insertAtFirst(40);
		obj.insertAtLast(50);
		obj.deleteFirst();
		obj.deleteLast();
		obj.search(90);
		obj.display();
	}

}
