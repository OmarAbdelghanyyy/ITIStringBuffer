public class ITIStringBuffer {
    private SinglyLinkedList<String> stringList;
    private int position=0;

    public ITIStringBuffer() {
        stringList = new SinglyLinkedList<>();
    }

    public ITIStringBuffer(String firstString) {
        stringList = new SinglyLinkedList<>();
        stringList.add(0,firstString);
        position++;
    }

    public void append(String nextString) {
        stringList.add(position,nextString);
        position++;
    }

    public String toString() {
        return String.join("", this.stringList);
    }

}
