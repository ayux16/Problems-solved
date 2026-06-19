class LRUCache {
    class Node{
        int key;
        int val;
        Node next;
        Node prev;
        Node(int a,int b){
            this.key=a;
            this.val=b;
            next=null;
            prev=null;
        }
    }
    Map<Integer,Node> hm;
    int capacity;
    Node head=new Node(-1,-1);
    Node tail=new Node(-1,-1);

    public LRUCache(int capacity){
        hm=new HashMap<>();
        this.capacity=capacity;
        head.next=tail;
        tail.prev=head;
    }
    public int get(int key) {
        if(!hm.containsKey(key)){
            return -1;
        }
        /*
        if key exist in hashmap
        remove from front of list
        and add in rear;
        */
        Node nn=hm.get(key);
        deleteNode(nn);
        insertNode(tail,nn);
        return nn.val;
    }
    
    public void put(int key, int value) {
        if(hm.containsKey(key)){
            Node nn=hm.get(key);
            deleteNode(nn);
            insertNode(tail,nn);
            nn.val=value;
        }
        /*
        else condition is 
        if that key doesn't then check capacity first
        if capacity ==hm.size 
        remove first element 
        else
        add in last place
        */
        else {
            if(capacity==hm.size()){
                Node nn=head.next;
                deleteNode(nn);
                hm.remove(nn.key);
            }
            Node nn=new Node(key,value);
            insertNode(tail,nn);
            hm.put(key,nn);
        }
    }
    public void insertNode(Node tail, Node nn){
        Node temp=tail.prev;
        temp.next=nn;
        nn.next=tail;
        tail.prev=nn;
        nn.prev=temp;
    }
    public void deleteNode(Node nn){
        Node t1=nn.prev;
        Node t2=nn.next;
        t1.next=t2;
        t2.prev=t1;
        nn.prev=null;
        nn.next=null;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */