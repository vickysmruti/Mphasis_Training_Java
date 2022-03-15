import java.util.NoSuchElementException;
public class SingleLinkList<T> {	
	private Node<T> head;
	private static class Node<T>{		
		private T data;
		private Node<T> next;
		public Node(T data) {
			super();
			this.data = data;
			this.next = null;
		}
	}
	public void insert(T data) {
		Node<T> newNode = new Node<T>(data);
		if(head == null) {
			head = newNode;
		}else {
			Node<T> currentNode = head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			 currentNode.next = newNode;
		}
	}
    public boolean remove(T key) {
    	boolean isFound = false;
    	if(head == null) {
			throw new NoSuchElementException("List is Empty!!");
		}    	
    	if(head.data == key) {
    		head = head.next;
    		return true;
    	}
		Node<T> currentNode = head;
		Node<T> previousNode = null;
		while(currentNode !=null) {
			if(currentNode.data == key) {
				isFound = true;
				break;
			}
			previousNode = currentNode;
			currentNode = currentNode.next;
		}
		if(currentNode == null) {
			return isFound;
		}
		currentNode = previousNode.next;
		previousNode.next = currentNode.next;
		currentNode.next = null;
		return isFound;
    }
	public void displayLinkedList() {
		Node<T> currentNode = head;
		while(currentNode!= null) {
			System.out.print(currentNode.data+" ");
			currentNode = currentNode.next;
		}
	}	
	public static void main(String[] args) {
		
		SingleLinkList<Integer> linkedList = new SingleLinkList<>();
		linkedList.insert(10);
		linkedList.insert(20);
		linkedList.insert(30);
		linkedList.insert(40);
		linkedList.insert(50);
		linkedList.insert(60);
		linkedList.insert(40);
		
		System.out.println("Original LinkedList:");
		linkedList.displayLinkedList();
		System.out.println();
		
		int key = 40;
		if (linkedList.remove(key)) {
			System.out.println("After removing an Element = " + key + " LinkedList is:");
			linkedList.displayLinkedList();
		} else
			System.out.println(key + " not found in List");
	}
}
