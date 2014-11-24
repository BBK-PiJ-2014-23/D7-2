public class Queue {
    private IntegerNode first;
    
    public Queue() {
       first = null; 
    }
    
    public void insert(int number) {
        IntegerNode newNumber = new IntegerNode(number);
        if (first == null) {
            first = newNumber;
            return;
        } else {
            IntegerNode temp = first;
            first = newNumber;
            first.setNext(temp);
        }
    }
    
    public void retrieve() {
        if (first.getNext() == null) {
            first = null;
            return;
        }
        IntegerNode current = first;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
    }
    
    public int size() {
        if (first == null) {
            return 0;
        }
        IntegerNode current = first;
        int counter = 1;
        while (current.getNext() != null) {
            counter++;
            current = current.getNext();
        }
        return counter;
    }
    
    public void printList() {
        IntegerNode current = first;
        while (current != null) {
            System.out.print(current.getNumber() + ", ");
            current = current.getNext();
        }
        System.out.println();
    }   
    
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        Queue intList = ListUtilities.arrayToQueue(array);
        intList.printList();
        System.out.println(intList.size());
        intList.retrieve();
        intList.printList();
        System.out.println(intList.size());
        intList.insert(4);
        intList.printList();
        System.out.println(intList.size());
    }
}