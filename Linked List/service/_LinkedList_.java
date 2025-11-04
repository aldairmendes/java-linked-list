public class _LinkedList_ {
    public Node head;
    public Node tail;
    public int size;
    
    public _LinkedList_() {
    }

    public void add(Node node) {
        if(this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            Node tempNode = this.tail;
            this.tail.next = node;
            this.tail = node;
            this.tail.prev = tempNode;
            this.tail.next = null;
        }
        
        this.tail.next = null;
        this.size++;
    }

    public void remove(int value) {
        Node node = find(value, this.head);

        if (node == this.head) {
            Node current = this.head;
            this.head = current.next;
            while(current.next != null){
                current = current.next;
            }
            current.next = null;
            return;
        }

        if (node == this.tail) {
            this.tail = this.tail.prev;
            this.tail.next = null;
            return;
        }

        if(node != null){
            node.prev.next = node.next;
            return;
        }

        System.out.println("Valor ["+ value +"] não encontrado.");
    }

    public Node find(int value, Node current) {
        if(current == null) {
            System.out.println("Valor não encontrado.");
            return null;
        }

        if(value == current.value) {
            return current;
        }
        return find(value, current.next);
    }

    public void printSelf(Node current) {
        if(current == null) {
            return;
        }

        System.out.println(current);
        printSelf(current.next);
    }

}