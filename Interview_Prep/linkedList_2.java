/*
	This example builds on the previously created Linked List asking some 
	basic questions.
*/
/*
	This is the Link object. It contains a value, a constructor to set this value,
	a Link object that will equal the next link in the chain and a displayLink()
	method to print the link's value.
*/
class Link{
	public int value;
	public Link next;

	public Link(int value){
		this.value = value;
	}

	public void displayLink(){
		System.out.println(value + " ");
	}
}

class myLinkedList{
	//This Link object will represent the last link in the chain, 
	//and the first link included
	public Link head;

	/*
		This method will insert a new link object in the list
		and push the original head to element space 1
	*/
	public void insertHead(int x){
		//Link created
		Link newLink = new Link(x);
		//pushing original head along
		newLink.next = head;
		//telling what object now the new head
		head = newLink;
	}

	/*
		This method will delete the current head value
		in the Linked List
	*/
	public void deleteHead(){
		head = head.next;		//We tell list that head.next is now the head
	}

	//Method to determine if the Linked List has any values
	public boolean isEmpty(){
		return head == null;
	}

	/*
		Method to display values in the Linked List
	*/
	public void display(){
		//we get link to head and store it in current
		Link current = head;
		//we say while current is not empty
		while(current != null){
			//call the current object's display method which prints the value
			current.displayLink();
			//update current onto the next link until it hits null
			current = current.next;
		}
	}

	/*
		This method allows the user to insert a value into a linkedlist
		to replace a specific value

	*/
	public void insertAtSpecificValue(int oldValue, int newValue){
		//check if the LinkedList is empty
		if(isEmpty()){
			//if so return this print statement
			System.out.println("Unable to find node as LinkedList is empty");
		} else {
			//create a link to the head of the LinkedList
			Link current = head;
			boolean found = false;

			//loop through the linkedlist
			while(current != null){

				if(current.value == oldValue){
					current.value = newValue;
					found = true;
				} else{
					current = current.next;
				}
			}

			System.out.println("Found and Updated: " + found);
		}
	}
}

public class linkedList_2{
	public static void main(String [] args){
		//Linked list object created
		myLinkedList myList = new myLinkedList();

		//insert method called inserting values
		myList.insertHead(5);
		myList.insertHead(2);
		myList.insertHead(9);
		myList.insertHead(1);
		myList.insertHead(8);

		//delete head method called deleting the head
		myList.deleteHead();

		//display method to display information
		myList.display();

		System.out.println("Updating a Specific value: ");
		myList.insertAtSpecificValue(9, 10);
		myList.display();
	}
}












