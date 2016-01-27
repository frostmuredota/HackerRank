package hackerrank30days.MoreLinkedList;

import java.util.*;

/**
 * Created by ramon on 26-01-16.
 */
public class MoreLinked {
    public static  Node insert(Node head,int data)
    {
        Node p=new Node(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
    {
        Node start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Node head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);

    }

    private static Node removeDuplicates(Node head) {
        Node start=head;
        Node aux = null;
        List<Integer> l = new ArrayList<Integer>();
        Set<Integer> hs = new HashSet<Integer>();
        while(start!=null) {
            if(start.next==null){
                l.add(start.data);
                break;
            }else{
                if(start.data==start.next.data){
                    l.add(start.data);
                    start=start.next.next;
                }else{
                    l.add(start.data);
                    start=start.next;
                }
            }
        }
        hs.addAll(l);
        l.clear();
        l.addAll(hs);
        for (int i = 0; i <l.size() ; i++) {
            aux=insert(aux,l.get(i));
        }
        return aux;
    }
}
