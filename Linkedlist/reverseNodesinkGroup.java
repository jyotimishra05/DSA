class Node{
    int data;
    Node next;
    Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
      }

}
public class reverseNodesinkGroup {
    public static Node converArrToLL(int arr[]){
        Node head = new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp  = new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    public static Node findKthNode(Node temp,int k){
        //1 2 3 4 we want kth as 3 for k=3 
      //k 2 1 0  llop break return temp;
        k=k-1;
        while(temp!=null && k>0){
            k--;
            temp=temp.next;
        }
        return temp;
    }
    public static Node reverse(Node head){
        Node prev =null;
        Node curr = head;
        Node next;
        while(curr!=null){
            next= curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
       
        return head;
       
       

    }
    public static Node getReverseByGroupk(Node head, int k){
        Node temp=head;
        Node prevNode=null;
        while(temp!=null){
            Node kthNode = findKthNode(temp,k);
            //1->2->3 (3 kth node)
            if(kthNode ==null){
                if(prevNode!=null){
                prevNode.next=temp;
                break;
                }
            }
            Node nextNode = kthNode.next; //(we have stored 4th node )
            kthNode.next=null;
            reverse(temp);
            //3->2->1
          //  k      head and temp (at 1)
            if(head==temp){
                head=kthNode;
            }
            else{
                //6->5->4
                //k      temp
                prevNode.next=kthNode;
            }
            prevNode=temp;
            temp=nextNode;
            

        }
        // System.out.println(head.data);
        return head;
    }
    public static void main(String[] args) {
        // Node head = new Node(1);
        // head.next=new Node(2);
       int arr[]={1,2,3,4,5,6,7,8,9,10,11};
       int k=3;
       Node head=converArrToLL(arr);
       Node reversebyGroupk= getReverseByGroupk(head,k);
       Node temp=reversebyGroupk;
       while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
       }
       System.out.println("null");
        
    }
}
