public class ConsCell {
    private int head; // the first item in the list
    private ConsCell tail; // rest of the list, or null

    public ConsCell(int h, ConsCell t) {  // Construct a new ConsCell
        head = h;
        tail = t;
    }

    public int getHead() {
        return head;
    }

    public ConsCell getTail() {
        return tail;
    }

    public void setTail(ConsCell t) {
        tail = t;
    }
}