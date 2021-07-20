public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.addElement(5);
        myList.addElement(10);
        myList.addElement(43);
        myList.addElement(21);
        myList.addElement(3);
        myList.addElement(81);
        myList.addElement(18);
        System.out.println(myList.head.getIndex() + ": " + myList.head.getNumber());
        System.out.println(myList.head.getNext().getIndex() + ": " + myList.head.getNext().getNumber());
        System.out.println(myList.head.getNext().getNext().getIndex() + ": " + myList.head.getNext().getNext().getNumber());
        System.out.println(myList.head.getNext().getNext().getNext().getIndex() + ": " + myList.head.getNext().getNext().getNext().getNumber());
        System.out.println(myList.head.getNext().getNext().getNext().getNext().getIndex() + ": " + myList.head.getNext().getNext().getNext().getNext().getNumber());
        System.out.println(myList.head.getNext().getNext().getNext().getNext().getNext().getIndex() + ": " + myList.head.getNext().getNext().getNext().getNext().getNext().getNumber());
        System.out.println(myList.head.getNext().getNext().getNext().getNext().getNext().getNext().getIndex() + ": " + myList.head.getNext().getNext().getNext().getNext().getNext().getNext().getNumber());
        System.out.println(myList.tale.getIndex() + ": " + myList.tale.getNumber());
    }
}
