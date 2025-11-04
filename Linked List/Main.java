public class Main {
    public static void main(String[] args) {
        // Cria a lista
        _LinkedList_ linkedList = new _LinkedList_();
        
        // Adiciona nodes
        linkedList.add(new Node(10));
        linkedList.add(new Node(20));
        linkedList.add(new Node(20));
        linkedList.add(new Node(30));
        linkedList.add(new Node(30));
        linkedList.add(new Node(50));
        linkedList.add(new Node(60));
        linkedList.add(new Node(70));
        linkedList.add(new Node(100));
        
        // Pega o head da lista
        Node head = linkedList.head;
        
        // Imprime a lista no início
        linkedList.printSelf(head);

        // Remove head
        linkedList.remove(10);

        // Remove node qualquer
        linkedList.remove(30);

        // Remove tail
        linkedList.remove(100);

        // Tentando remover valor inexistente
        linkedList.remove(200);

        // Localiza um node
        Node found = linkedList.find(60, head);
        System.out.println("Node encontrado: " + found);

        // Imprime a lista no fim
        linkedList.printSelf(head);
    }
}