/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    void insertcopy(Node head){
            Node temp=head;
            while(temp!=null){
                Node Nextele=temp.next;
                Node copy=new Node(temp.val);
                copy.next=Nextele;
                temp.next=copy;
                temp=Nextele;
            }
        }
    void connectRandom(Node head){
        Node temp=head;
        while(temp!=null){
            Node copy=temp.next;
            if(temp.random!=null){
                copy.random=temp.random.next;
            }else{
                copy.random=null;
            }
            temp=temp.next.next;
        }
    }
    Node copy(Node head){
        Node temp=head;
        Node dNode=new Node(-1);
        Node res=dNode;
        while(temp!=null){
            res.next=temp.next;
            res=res.next;
            
            temp.next=temp.next.next;
            temp=temp.next;
            
        }
        return dNode.next;

    }
    public Node copyRandomList(Node head) {
        if(head==null)return null;
        insertcopy(head);
        connectRandom(head);
        return copy(head);
       
        
    }
}