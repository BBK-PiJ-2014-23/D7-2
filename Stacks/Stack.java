public class Stack {
    private IntegerNode first;
    
    public Stack() {
       first = null; 
    }
    
    public void push(int number) {
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
    
    public void pop() {
        if (empty()) {
            first = null;
            return;
        }
        first = first.getNext();
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
    
    public boolean empty() {
        if (first == null) {
            return true;
        } else {
            return false;
        }
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
        Stack intList = new Stack();
        intList.printList();
        System.out.println(intList.size());
        System.out.println(intList.empty());
        intList = ListUtilities.arrayToStack(array);
        intList.printList();
        System.out.println(intList.size());
        System.out.println(intList.empty());
        intList.pop();
        intList.printList();
        System.out.println(intList.size());
         System.out.println(intList.empty());
        intList.push(4);
        intList.printList();
        System.out.println(intList.size());
         System.out.println(intList.empty());
    }
}