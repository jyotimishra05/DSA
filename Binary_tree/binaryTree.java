import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.*;

/**
 * binaryTree
 */

public class binaryTree {
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
    
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left= buildTree(nodes);
            newNode.right= buildTree(nodes);
            return newNode;
        }

        public static void preorder(Node root){   //O(n)
            if(root ==null){
                return;
            }
            System.out.print(root.data+ " ");
            preorder(root.left);
            preorder(root.right);

        }
        public static void inorder(Node root){   //O(n)
            if(root ==null){
                return;
            }
           
            preorder(root.left);
            System.out.print(root.data+ " ");
            preorder(root.right);

        }
        public static void postorder(Node root){   //O(n)   (as we had treaversed on each root)
            if(root ==null){
                return;
            }
           
            preorder(root.left);
           
            preorder(root.right);
            System.out.print(root.data+ " ");

        }

        //level order traversal 
        public static void levelOrderTraversal(Node root){
            if(root==null){
                return;
            }
            Queue<Node>q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node curNode = q.remove();
                if(curNode==null){
                    System.out.println();
                    if(!q.isEmpty()){
                        q.add(curNode);
                    }
                    else{
                        break;
                    }
                }
                else{
                    System.out.print(curNode.data+" ");
                    if(curNode.left!=null){
                        q.add(curNode.left);
                    }
                    if(curNode.right!=null){
                        q.add(curNode.right);
                    }
                }
                

            }
        }

        public static int maxHeight(Node root){
            if(root==null){
                return 0;
            }
            int lh = maxHeight(root.left);
            int rh=maxHeight(root.right);
            int h = Math.max(lh, rh)+1;
            return h;
        }
    
    }
      public static void main(String[] args) {
       int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
      BinaryTree tree = new BinaryTree();
      Node root= tree.buildTree(arr);
    //   System.out.println(root.data);
    //   tree.preorder(root);  //root left subtree  rightsubtree
    //   tree.inorder(root);  //left subtree root rightsubtree
            // tree.postorder(root); //eft subtree  rightsubtree root

            // tree.levelOrderTraversal(root);
            int maxh = tree.maxHeight(root);
            System.out.println(maxh);

        
    }

    
}

// 1
// / \
// 2   3
// / \
// 4   5
// class Solution {
//     public List<Integer> preorderTraversal(TreeNode root) {
//         List<Integer>list = new ArrayList<>();
//         if(root==null){
//            return list;
//         }
//         list.add(root.val);
//         list.addAll(preorderTraversal(root.left));
//         list.addAll(preorderTraversal(root.right));
//         return list;
//     }
// }

// Now, let's perform a dry run of the preorderTraversal method.

// Initial call: preorderTraversal(root) where root is the node with value 1.

// List initialized: list = []
// root is not null.
// Add root.val (1) to the list: list = [1]
// Recursive call on root.left (node2 with value 2).
// Recursive call: preorderTraversal(node2) where node2 is the node with value 2.

// List initialized: list = []
// node2 is not null.
// Add node2.val (2) to the list: list = [2]
// Recursive call on node2.left (node4 with value 4).
// Recursive call: preorderTraversal(node4) where node4 is the node with value 4.

// List initialized: list = []
// node4 is not null.
// Add node4.val (4) to the list: list = [4]
// Recursive call on node4.left (null).
// Recursive call: preorderTraversal(null) for the left child of node4.

// List initialized: list = []
// root is null.
// Return empty list: list = []
// Back to node4: Combine lists: list = [4] + [] = [4]

// Recursive call on node4.right (null).
// Recursive call: preorderTraversal(null) for the right child of node4.

// List initialized: list = []
// root is null.
// Return empty list: list = []
// Back to node4: Combine lists: list = [4] + [] = [4]

// Return list: list = [4]
// Back to node2: Combine lists: list = [2] + [4] = [2, 4]

// Recursive call on node2.right (node5 with value 5).
// Recursive call: preorderTraversal(node5) where node5 is the node with value 5.

// List initialized: list = []
// node5 is not null.
// Add node5.val (5) to the list: list = [5]
// Recursive call on node5.left (null).
// Recursive call: preorderTraversal(null) for the left child of node5.

// List initialized: list = []
// root is null.
// Return empty list: list = []
// Back to node5: Combine lists: list = [5] + [] = [5]

// Recursive call on node5.right (null).
// Recursive call: preorderTraversal(null) for the right child of node5.

// List initialized: list = []
// root is null.
// Return empty list: list = []
// Back to node5: Combine lists: list = [5] + [] = [5]

// Return list: list = [5]
// Back to node2: Combine lists: list = [2, 4] + [5] = [2, 4, 5]

// Return list: list = [2, 4, 5]
// Back to root (node1): Combine lists: list = [1] + [2, 4, 5] = [1, 2, 4, 5]

// Recursive call on root.right (node3 with value 3).
// Recursive call: preorderTraversal(node3) where node3 is the node with value 3.

// List initialized: list = []
// node3 is not null.
// Add node3.val (3) to the list: list = [3]
// Recursive call on node3.left (null).
// Recursive call: preorderTraversal(null) for the left child of node3.

// List initialized: list = []
// root is null.
// Return empty list: list = []
// Back to node3: Combine lists: list = [3] + [] = [3]

// Recursive call on node3.right (null).
// Recursive call: preorderTraversal(null) for the right child of node3.

// List initialized: list = []
// root is null.
// Return empty list: list = []
// Back to node3: Combine lists: list = [3] + [] = [3]

// Return list: list = [3]
// Back to root (node1): Combine lists: list = [1, 2, 4, 5] + [3] = [1, 2, 4, 5, 3]

// Return final list: list = [1, 2, 4, 5, 3]
// The final output of the preorder traversal is [1, 2, 4, 5, 3].





