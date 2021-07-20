public class MyList {
    Node list;
    Node tale;
    Node head;

    public void addElement(int element) {
        if (this.list == null) {
            this.list = new Node();
            this.list.setIndex(0);
            this.list.setNumber(element);
            this.tale = this.list;
            this.head = this.list;
        } else if (this.head.equals(this.tale)) {
            this.head.setNext(new Node());
            this.head.getNext().setIndex(this.head.getIndex() + 1);
            this.head.getNext().setNumber(element);
            this.tale = head.getNext();
        } else {
            this.tale.setNext(new Node());
            this.tale.getNext().setIndex(this.tale.getIndex() + 1);
            this.tale.getNext().setNumber(element);
            this.tale = this.tale.getNext();
        }
    }
}
