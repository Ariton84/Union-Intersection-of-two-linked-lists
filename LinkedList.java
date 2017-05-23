// Java program to find union and intersection of two unsorted 
// linked lists
class LinkedList
{
	Node head; // head of list

	/* Linked list Node*/
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	/* Function to get Union of 2 Linked Lists */
	void getUnion(Node head1, Node head2)
	{
		Node t1 = head1, t2 = head2;

		//insert all elements of list1 in the result
		while (t1 != null)
		{
			push(t1.data);
			t1 = t1.next;
		}

		// insert those elements of list2 that are not present
		while (t2 != null)
		{
			if (!isPresent(head, t2.data))
				push(t2.data);
			t2 = t2.next;
		}
	}

	void getIntersection(Node head1, Node head2)
	{
		Node result = null;
		Node t1 = head1;

		// Review list1 and search each element of it in list2.
		// If the element is present in list 2, then insert the
		// element to result
		while (t1 != null)
		{
			if (isPresent(head2, t1.data))
				push(t1.data);
			t1 = t1.next;
		}
	}

	/* Utility function to print list */
	void printList()
	{	Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}


	/* Inserts a node at start of linked list */
	void push(int new_data)
	{	Node new_node = new Node(new_data);

		new_node.next = head;

		head = new_node;
	}

	boolean isPresent (Node head, int data)
	{	Node t = head;
		while (t != null)
		{
			if (t.data == data)
				return true;
			t = t.next;
		}
		return false;
	}

} 

