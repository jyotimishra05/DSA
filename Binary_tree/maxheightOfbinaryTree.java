public class maxheightOfbinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
     static int maxHeight(Node root){
        if(root==null){
            return 0;
        }
        int lh = maxHeight(root.left);
        int rh = maxHeight(root.right);
        int h = Math.max(lh, rh)+1;
        return h;
     }
     static int count(Node root){
        if(root==null){
            return 0;
        }
        int lc = count(root.left);
        int rc = count(root.right);
        int h = lc +rc+1;
        return h;
     }
     static int nodeSum(Node root){
        if(root==null){
            return 0;
        }
        int l = nodeSum(root.left);
        int r = nodeSum(root.right);
        int totalcount = l +r+root.data;
        return totalcount;
     }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        int maxdepth = maxHeight(root);
        System.out.println("maxDepth : " + maxdepth);
        int totalNodes = count(root);
        System.out.println("totalNodes count : "+totalNodes);
        int sumOfNode = nodeSum(root);
        System.out.println("totalcount : "+sumOfNode);

        
    }
}
