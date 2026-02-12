public class Main{
    public static void main(String[] args){
        Heap heap = new Heap();
        heap.add(10);
        heap.add(5);
        heap.printArray();
        heap.add(20);
        heap.printArray();
        heap.removeMax();
        heap.printArray();
    }
}