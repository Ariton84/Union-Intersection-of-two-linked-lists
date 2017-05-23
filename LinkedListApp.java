
public class LinkedListApp {

	
	public static void main(String args[])
	{
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();
		LinkedList union = new LinkedList();
		LinkedList intersect = new LinkedList();

		/*create a linked list */
		list1.push(20);
		list1.push(4);
		list1.push(15);
		list1.push(10);
		list1.push(33);

		/*create a linked list */
		list2.push(10);
		list2.push(2);
		list2.push(4);
		list2.push(8);
		list2.push(33);

		intersect.getIntersection(list1.head, list2.head);
		union.getUnion(list1.head, list2.head);

		System.out.println("First List is");
		list1.printList();

		System.out.println("Second List is");
		list2.printList();

		System.out.println("Intersection List is");
		intersect.printList();

		System.out.println("Union List is");
		union.printList();
	}

}
