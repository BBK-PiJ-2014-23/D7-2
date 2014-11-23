public class IntegerNode {
    int number;
    IntegerNode next;
    
    public IntegerNode(int number) {
        this.number = number;
    }
    
    public int getNumber() {
        return number;
    }
    
    public void setNext(IntegerNode next) {
        this.next = next;
    }
    
    public IntegerNode getNext() {
        return next;
    }
}