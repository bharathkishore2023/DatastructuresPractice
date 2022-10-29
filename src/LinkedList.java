public class LinkedList {
    Node head;

    class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
            next=null;
        }
    }
    LinkedList(){
        head=null;
    }
    public void insertAtBeginning(int dataVal){
        Node newNode=new Node(dataVal);
        // when list is empty
        if(head==null){
            head=newNode;
        }
        else{ // list is not empty
            // previous node head is new node's next
            newNode.next=head;
            head=newNode;
        }
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next; // jump
        }
    }
    public void insertAtPosition(int position,int dataval) {
    	if(position==0) {
    		insertAtBeginning(dataval);
    		return;
    	}
    	Node newNode=new Node(dataval);
    	Node temp=head;//here we assign temp to head,so already pointer in zeroth position
    	for(int i=1;i<position;i++) { // so no need to start from 0
    		temp=temp.next;
    		if(temp==null) {
    		throw new IllegalArgumentException("invalid position");
    		}
    	}
    	newNode.next=temp.next;
    	temp.next=newNode;
    }
    public void deletePosition(int position) {
    	if(head==null) {
    		throw new IndexOutOfBoundsException("Deletion attempted on empty list");
    	}
    	if(position==0) {
    		head=head.next;
    		return;
    	}
    	Node temp=head;
    	Node prev=null;
    	for(int i=1;i<=position;i++) {
    		prev=temp;
    		temp=temp.next;
    	}
    	prev.next=temp.next;
    }
    
    public void getPosition(int dataVal) {
    	Node temp=head;
    	int index=0;
    	while(temp.data!=dataVal) {
    		temp=temp.next;
    		index++;
    	}
    	System.out.println("index : "+index);
    }
    public void updatePosition(int position,int dataval) {
    	Node temp=head;
    	int index=0;
    	while(index<=position) {
    		if(index==position) {
    			temp.data=dataval;
    		}
    		temp=temp.next;
    		index++;
    	}
    }
    public void deleteAtEnd() {
    	Node temp=head;
    	Node prev=null;
    	while(temp.next!=null) {
    		prev=temp;
    		temp=temp.next;
    	}
    	prev.next=temp.next;
    }
    public void insertAtEnd(int dataval) {
    	Node temp=head;
    	Node nextNode=null;
    	while(temp.next!=null) {
    		nextNode=temp.next;
    		temp=temp.next;
    	}
    	nextNode.data=dataval;
    }
}
/*
* get(pos)
* update(pos,val)
* deleteAtEnd()
* insertAtEnd(val)
* search(val) -return index
* contains (val) -return true or false
*/
