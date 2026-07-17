// Last updated: 7/17/2026, 9:01:47 AM
1class LRUCache {
2    Node head;
3    Node tail;
4    int cap;
5    Map<Integer, Node> mp;
6
7
8    public LRUCache(int capacity) {
9        cap = capacity;
10        mp = new HashMap<>();
11        head = new Node(-1, -1);
12        tail = new Node(-1, -1);
13        head.next = tail;
14        tail.prev = head;    
15    }
16
17    void delete(Node temp){
18        temp.prev.next = temp.next;
19        temp.next.prev = temp.prev;
20    }
21
22    void addNodeAtHead(Node temp){
23        temp.next = head.next;
24        temp.prev = head;
25        head.next.prev = temp;
26        head.next = temp;
27    }
28    
29    public int get(int key) {
30        if(mp.containsKey(key)){
31            Node temp = mp.get(key);
32            delete(temp);
33            addNodeAtHead(temp);
34            return temp.val;
35        }
36        return -1;
37   }
38    
39    public void put(int key, int value) {
40        if(mp.containsKey(key)){
41            Node temp = mp.get(key);
42            delete(temp);
43            mp.remove(key);
44        }else{
45            if(cap == mp.size()){
46                Node temp = tail.prev;
47                delete(temp);
48                mp.remove(temp.key);
49            }
50        }
51        Node newNode = new Node(key, value);
52        addNodeAtHead(newNode);
53        mp.put(key, newNode);
54    }
55
56    class Node{
57        Node next;
58        Node prev;
59        int key;
60        int val;
61        
62        Node(int key, int val){
63            this.val = val;
64            this.key = key;
65        }
66    }
67}
68
69
70/**
71 * Your LRUCache object will be instantiated and called as such:
72 * LRUCache obj = new LRUCache(capacity);
73 * int param_1 = obj.get(key);
74 * obj.put(key,value);
75 */