public class IntegerList {
    private IntegerNode first;
    
    public IntegerList() {
       first = null; 
    }
    
    public void add(int number) {
        IntegerNode newNumber = new IntegerNode(number);
        if (first == null) {
            first = newNumber;
            return;
        }
        IntegerNode current = first;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(newNumber);
    }
    
    public void printList() {
        IntegerNode current = first;
        while (current != null) {
            System.out.print(current.getNumber() + ", ");
            current = current.getNext();
        }
    }   
    
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        IntegerList intList = ListUtilities.arrayToLinkedList(array);
        intList.printList();
    }
}