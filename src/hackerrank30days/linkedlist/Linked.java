package hackerrank30days.linkedlist;

import java.util.Scanner;

/**
 * Created by ramon on 15-01-16.
 */
public class Linked {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node head=null;
        int T=sc.nextInt();
        while(T>0){
            int ele=5;
            head=insert(head,ele);
            T--;
        }
        System.out.println(head.next.data);
       // display(head);
    }
    public static  Node insert(Node head,int data)
    {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return head;
        } else {
            Node runner = head;
            while (runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
            return head;
        }
    }

    public static void display(Node head) {
        Node start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");;
            start=start.next;
        }
    }
}
