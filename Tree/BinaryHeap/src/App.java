public class App {
    public static void main(String[] args) throws Exception {
       BinaryHeap minHeap = new BinaryHeap(6);
       minHeap.insert(5, "Min");
       minHeap.insert(6, "Min");
       minHeap.insert(2, "Min");
       minHeap.insert(3, "Min");
       minHeap.insert(9, "Min");
       minHeap.insert(15, "Min");
       minHeap.levelOrder();
    //    BinaryHeap maxHeap = new BinaryHeap(6);
    //    maxHeap.insert(5, "Max");
    //    maxHeap.insert(6, "Max");
    //    maxHeap.insert(2, "Max");
    //    maxHeap.insert(3, "Max");
    //    maxHeap.insert(9, "Max");
    //    maxHeap.insert(15, "Max");
    //    maxHeap.levelOrder();
        minHeap.extractHeadOfBP("Min");
        minHeap.levelOrder();
    }
}
