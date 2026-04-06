class Node{
    int key;
    int value;
    Node prev;
    Node next;

    public Node(int key, int value){
        this.key=key;
        this.value=value;
    }
}

class LRUCache {
    int capacity;
    HashMap<Integer,Node> map;
    Node head;
    Node tail;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        map = new HashMap<>();
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next=tail;
        tail.prev = head;
    }
    public void remove(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    public void insert(Node node){
        node.next=head.next;
        head.next.prev=node;
        head.next=node;
        node.prev=head;
    }
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node getNode = map.get(key);
        remove(getNode);
        insert(getNode);
        return getNode.value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node updateNode = map.get(key);
            remove(updateNode);
            updateNode.value=value;
            insert(updateNode);
        }
        else{
            if(map.size()==capacity){
                Node removeNode = tail.prev;
                remove(removeNode);
                map.remove(removeNode.key);
            }
            Node newNode = new Node(key,value);
            insert(newNode);
            map.put(key,newNode);
        }
        
    }
}
