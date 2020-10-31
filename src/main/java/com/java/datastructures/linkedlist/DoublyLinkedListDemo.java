package com.java.datastructures.linkedlist;

public class DoublyLinkedListDemo {

	private int length;
    private Node head;
    private Node tail;
    
    public DoublyLinkedListDemo(){
        this.length=0;
        this.head=null;
        this.tail=null;
    }
    
    public void addNodeFromBeginning(int data){
        Node newNode=new Node(data);
        Node temp;
        if(head ==null){
            this.head=newNode; 
            this.tail=newNode;
        }
        else {
            this.head.previousNode=newNode;
            newNode.nextNode=this.head;
            this.head=newNode;
        }
        
    }
    
     public void addNodeFromEnd(int data){
         Node newNode=new Node(data);
         if(head==null){
             this.head=newNode;
         }else{
             this.tail.nextNode=newNode;
             newNode.previousNode=this.tail;
         }
          this.tail=newNode;
      }
    public void printListFromStart(Node head){
        Node temp=head;
        while(temp !=null){
            System.out.print("->"+temp.data);
            temp=temp.nextNode;
            
        }
    }
    
    public void printListFromEnd(Node tail){
        Node temp=tail;
        while(temp !=null){
            System.out.println(temp.data);
            temp=temp.previousNode;
            
        }
    }
    public static void main(String[] args){
    	DoublyLinkedListDemo doublyLinkedListFromStart=new DoublyLinkedListDemo();
    	doublyLinkedListFromStart.addNodeFromBeginning(10);
    	doublyLinkedListFromStart.addNodeFromBeginning(20);
    	doublyLinkedListFromStart.addNodeFromBeginning(30);
    	doublyLinkedListFromStart.addNodeFromBeginning(40);
    	doublyLinkedListFromStart.addNodeFromBeginning(50);
    	doublyLinkedListFromStart.addNodeFromBeginning(60);
        
        DoublyLinkedListDemo doublyLinkedListFromEnd=new DoublyLinkedListDemo();
        doublyLinkedListFromEnd.addNodeFromEnd(10);
        doublyLinkedListFromEnd.addNodeFromEnd(20);
        doublyLinkedListFromEnd.addNodeFromEnd(30);
        doublyLinkedListFromEnd.addNodeFromEnd(40);
        doublyLinkedListFromEnd.addNodeFromEnd(50);
        doublyLinkedListFromEnd.addNodeFromEnd(60);

        System.out.println("----------- Print List from Start or Head------------"+'\n');
        doublyLinkedListFromStart.printListFromStart(doublyLinkedListFromStart.head);
        System.out.println('\n');
        System.out.println("----------- Print List from End or Tail ------------"+'\n');
         doublyLinkedListFromEnd.printListFromStart(doublyLinkedListFromEnd.head);

    }
}

class Node {
    
    int data;
    Node previousNode;
    Node nextNode;
    
    public Node(int data){
        this.data=data;     
    }

}

