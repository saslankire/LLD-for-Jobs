public class Node {
    int val;
    Node next;
    public Node(int val){
        this.val = val;
        this.next = null;
    }
    public static void traverseIterative(Node root){
        if(root==null) return;
        Node curr = root;
        while(curr!=null){
            System.out.print(curr.val+" ");
            curr = curr.next;
        }
        return;
    }
    public static void traverseRecursion(Node root){
        if(root==null) {
            return;
        }
        System.out.print(root.val+" ");
        traverseRecursion(root.next);
        //print in reverse order
        //System.out.println(root.val);
    }
    public static Node insertAtBegin(Node root,int val){
        Node ans = new Node(val);
        ans.next = root;
        return ans;
    }
    public static Node insertAtEnd(Node root,int val){
       if(root==null) return new Node(val);
       Node curr = root;
       while(curr.next!=null){
           curr = curr.next;
       }
       curr.next = new Node(val);
       return root;
    }
    public static Node insertAtMiddle(Node root,int k,int val){
        Node temp = new Node(val);
        if(k==1){
            temp.next=root;
            return temp;
        }
        int pos = k-2;
        Node curr = root;
        for(int i=1;i<=pos && curr!=null;i++){
            curr = curr.next;
        }
        if(curr == null) return root;
        temp.next = curr.next;
        curr.next  = temp;
        return root;
    }
    public static Node deleteAtStart(Node root){
        if(root==null) return null;
        if(root.next==null) return null;
        Node temp = root.next;
        return temp;
    }
    public static Node deleteAtEnd(Node root){
        Node curr = root;
        if(curr.next==null) return null;
        while(curr.next.next!=null){
            curr = curr.next;
        }
        curr.next=null;
        return root;
    }

    public static void main(String[] args){
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        head.next =  second;
        second.next = third;
        Node curr = head;
        traverseIterative(head);
        System.out.println();
        traverseRecursion(head);
        System.out.println();
        head = insertAtBegin(head,19);
        traverseIterative(head);
        System.out.println();
        head = insertAtEnd(head,50);
        traverseIterative(head);
        System.out.println();
        head = insertAtMiddle(head,2,76);
        head = deleteAtStart(head);
        deleteAtEnd(head);
        traverseIterative(head);



    }
}
