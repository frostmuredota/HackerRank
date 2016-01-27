package hackerrank30days.ReviewBinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by ramon on 26-01-16.
 */
public class Binary {
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

    private static void levelOrder(Node root) {
        Queue<Node> queue=new LinkedList<Node>();
        queue.add(root);
        while (queue.size()>0){
            Node aux = queue.poll();
            System.out.println(aux.data);
            if(aux.left!=null){
                queue.add(aux.left);
            }
            if(aux.right!=null){
                queue.add(aux.right);
            }
        }
    }



}
