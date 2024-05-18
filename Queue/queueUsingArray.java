import java.util.Queue;

public class queueUsingArray {
    public static class queueA {
        int front=-1;
        int rear=-1;
        int arr[]=new int[10];
        int size=0;
        public void add(int val){
            if(rear==arr.length-1){
                System.out.println("overflow");
                return;
            }
            //while adding the val if front =-1 then only it will increment by 1
            if(front==-1){
                front=0;
                rear=0;
                arr[rear]=val;
                size++;
            }
            else{
                rear++;
                arr[rear]=val;
                size++;
            }
        }
        public int remove(){
            if(size==0){
                System.out.println("underflow");
                return -1;
            }
            int x = arr[front];
            front++; 
            size--;    //front -1234  //234
            return x;
        }
        public int peek(){
            if(size==0){
                System.out.println("underflow");
                return -1;
            }
            return arr[front];
        }
        public void display(){
            if(size==0){
                System.out.println("empty !");
            }
            else{
                for(int i=front;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
    
        
    }
    public static void main(String[] args) {
        
        //create object of queueA (class)
        queueA q = new queueA();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();//1 2 3 4 5 
        System.out.println(q.remove()); //1
        System.out.println(q.peek());//2

        

    }
}
