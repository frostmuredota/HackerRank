package hackerrank30days.BinarySearchTrees;

import java.util.Scanner;

/**
 * Created by ramon on 22-01-16.
 */
public class BinariyTrees {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur=new Node(data);
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

    public static int getHeight(Node root){
        //Write your code here
        if(root==null){
            return 0;
        }

        int left = getHeight(root.left);
        int rigth = getHeight(root.right);

        if(left>rigth){
            return left+1;
        }else{
            return rigth+1;
        }
    }

}
