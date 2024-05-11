/**
 * ll
 */

 /**
  * Innerll
  */
class Node{
      int data;
      Node next;
      Node(int data1 , Node next1){
        this.data=data1;
        this.next=next1;
      }
      Node(int data1){
        this.data=data1;
        this.next=null;
      }
 
    
 }
public class ll {

private static Node converArrToLL(int arr[]){
      Node head=new Node(arr[0]);
      // System.out.println(head.data);
      Node mover = head;
      for(int i=1;i<arr.length;i++){
        Node temp = new Node(arr[i]);
        mover.next=temp;
        mover = temp;
      }
      return head;
}
private static int lengthOfLL(Node head){
        int count=0;
        Node temp = head;
        while (temp!=null) {
          count++;
          temp=temp.next;
          
        }
        return count;
}
private static int searchLL(Node head , int k){
      Node temp = head;
      while(temp!=null){
        if(temp.data==k){
          return 1;
        }
        temp = temp.next;
      }
      return 0;
}
private static Node deleteHead(Node head){
     if(head==null){
        return head;
     }
     head=head.next;
     return head;
}

private static Node deleteTail(Node head){
    if(head==null || head.next==null){
      return null;
    }
    Node temp = head;
    while(temp.next.next!=null){
      temp=temp.next;
    }
    temp.next=null;
    return head;
}

public static Node deleteKthNodeFromStart(Node head,int kth){
      if(head==null){
        return head;
      }
      if(kth==1){   //deleteFirst
        head= head.next;

      }
      Node temp = head;
      Node prev = null;
      int count=0;
      while(temp!=null){
          count++;
          if(kth==count){
            prev.next=prev.next.next;
            break;

          }
          prev=temp;
          temp=temp.next;
      }
      return head;
}
public static Node deleteKthElementFromStart(Node head , int element){
        if(head.data==element){
          head=head.next;
          return head;
        }
        Node temp=head;
        Node prev = null;
        while(temp!=null){
            if(temp.data==element){
              prev.next=prev.next.next;
              break;
            }
            prev = temp;
            temp=temp.next;
        }
        return head;
}
public static Node insertAtHead(Node head,int ele){
       Node temp = new Node(ele);
       temp.next=head;
       head=temp;
       return head;

}
public static Node insertAtLast(Node head,int ele){
  Node temp=head;
  Node newTemp = new Node(ele);
  while(temp.next!=null){
    temp=temp.next;
  }
  temp.next=newTemp;
  return head;

}
public static Node insertAtKth(Node head, int idx ,int ele){

        Node newNode = new Node(ele);
           if(head==null){
              if(ele==1){
               head = newNode;
               return head;

              }
        else{
          return head;
        }
      }
        Node temp = head;
        int count=0;
        // Node prev=null;
        if(idx==1){
          newNode.next=head;
          head=newNode;
          return head;
        }
        while(temp!=null){
          count++;
          if(count==(idx-1)){
            
             newNode.next=temp.next;
             temp.next=newNode;
             break;
          }
         
          temp=temp.next;
          
        }
        return head;
}
    public static void main(String[] args) {
      int arr[]={1,2,3,4,5};
      Node head = converArrToLL(arr);
      
        // System.out.println(head.data);
        //  head=deleteTail(head); 
        // head = deleteKthNodeFromStart(head, 2); //(index)
        // head = deleteKthElementFromStart(head, 2); //(element)
        // head = insertAtHead(head, 6);
        //  head=insertAtLast(head, 10);
        // head = insertAtKth(head,1,6);
        head = insertAtKth(head,3,6);
        Node temp=head;

      while (temp != null) {
        System.out.print(temp.data+"->");
        temp =temp.next;
    }
    System.out.println("null");
    System.out.println("Length of LL : "+ lengthOfLL(head));
    // System.out.println(searchLL(head, 4));
     //delete head
      // head = deleteHead(head);
      // System.out.println(head.data); //2

   
  
  
        
    }
}