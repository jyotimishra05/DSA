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


public class add2Numbers {
    public static Node NodeaddTwoNumbers(Node l1, Node l2) {
        Node dummyNode = new Node(-1);
        Node resultNode = dummyNode;
        int carry =0;
        
        while(l1!=null || l2!=null || carry==1){
            int sum=0;
            if(l1!=null){
                sum=sum+l1.data;
                l1=l1.next;
            }
            if(l2!=null){
                sum=sum+l2.data;
                l2=l2.next;
            }
            
            sum=sum+carry;
            carry=sum/10;
            Node lastDigit = new Node(sum%10);
            resultNode.next= lastDigit;
            resultNode=lastDigit;   
            
        }
        
        return dummyNode.next;
        
    }
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
    public static void main(String[] args) {
        int arr1[]={9,9,9,9,9,9,9};
        int arr2[]={9,9,9,9};
        Node head1=converArrToLL(arr1);
        Node head2=converArrToLL(arr2);
        
        Node resNode = NodeaddTwoNumbers(head1,head2);
        Node temp=resNode;
      while (temp != null) {
        System.out.print(temp.data+"->");
        temp =temp.next;
    }
    System.out.println("null");

    }
}
