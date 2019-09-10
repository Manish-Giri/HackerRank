package tutorials.thirtydaysofcode;
import java.util.*;
import java.io.*;
class Node {
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

public class BSTLevelOrderTraversal {
    static void levelOrder(Node root){
        //Write your code here
        ArrayDeque<Node> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()) {
            Node current = q.remove();
            System.out.print(current.data+ " ");
            Node lc = current.left;
            Node rc = current.right;
            if(lc != null) {
                q.add(lc);
            }
            if(rc != null) {
                q.add(rc);
            }
        }
    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}
