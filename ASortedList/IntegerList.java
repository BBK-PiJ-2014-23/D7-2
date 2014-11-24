public class IntegerList {
    private IntegerNode first;

    public IntegerList() {
        first = null; 
    }

    public void add(int number) {
        IntegerNode newNode = new IntegerNode(number);
        if (first == null) {
            first = newNode;
            return;
        } else if (first.getNumber() > newNode.getNumber()) {
            IntegerNode temp = first;
            first = newNode;
            first.setNext(temp);
            return;
        }
        IntegerNode current = first;
        while (current.getNext() != null && current.getNext().getNumber() < newNode.getNumber()) {
            current = current.getNext();
        }
        IntegerNode temp = current.getNext();
        current.setNext(newNode);
        current.getNext().setNext(temp);
    }

    public void printList() {
        IntegerNode current = first;
        while (current != null) {
            System.out.print(current.getNumber() + ", ");
            current = current.getNext();
        }
    }   

    public static void main(String[] args) {
        int[] array = {8, 3, 2, 4, 1};
        IntegerList intList = ListUtilities.arrayToLinkedList(array);
        intList.printList();
//         IntegerList list = new IntegerList();
//         list.add(8);
//         list.add(1);
//         list.add(5);
//         list.printList();
    }
}