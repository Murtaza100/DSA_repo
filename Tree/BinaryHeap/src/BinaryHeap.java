public class BinaryHeap {
    int[] arr;
    int sizeOfTree;

    public BinaryHeap(int size) {
        this.arr = new int[size + 1]; // we will be ignoring 0th index and start with 1st index
        this.sizeOfTree = 0;
    }

    public boolean isEmpty() {
        if(sizeOfTree == 0)
            return true;
        return false;
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Binary heap is empty");
            return -1;
        }
        return arr[1];
    }

    public int sizeOfHeap() {
        return sizeOfTree;
    }

    public void preOrder(int index) {
        if(index > sizeOfTree){
            return;
        }
        System.out.print(arr[index] + " ");
        preOrder(2*index);
        preOrder(2*index + 1);
    }

    public void inOrder(int index) {
        if(index > sizeOfTree){
            return;
        }
        inOrder(2*index);
        System.out.print(arr[index] + " ");
        inOrder(2*index + 1);
    }

    public void postOrder(int index) {
        if(index > sizeOfTree) {
            return;
        }
        postOrder(2*index);
        postOrder(2*index + 1);
        System.out.print(arr[index] + " ");
    }

    public void levelOrder() {
        if(isEmpty()) {
            System.out.println("Heap is empty");
            return;
        }
        for(int i=1; i<=sizeOfTree; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    // heapify for insert
    public void heapifyBottomToTop(int index, String typeOfHeap) {
        int parent = index/2;
        if(index <= 1) {
            return;
        }
        if(typeOfHeap == "Max") {
            if(arr[index] > arr[parent]) {
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        }
        else if(typeOfHeap == "Min") {
             if(arr[index] < arr[parent]) {
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        }
        heapifyBottomToTop(parent, typeOfHeap);
    }

    public void insert(int value, String typeOfHeap) {
        arr[++sizeOfTree] = value;
        heapifyBottomToTop(sizeOfTree, typeOfHeap);
    }

    // heapifyTopToBottom to extract or remove root node or head
    public void heapifyTopToBottom(int index, String heapType) {
        int left = index*2;
        int right = index*2 + 1;
        int swapChild = 0;
        if (sizeOfTree < left) {  // node with no child
        return;
        }
        if (heapType == "Max") {
        if (sizeOfTree == left) { // node with 1 child
            if (arr[index] < arr[left]) {
            int tmp = arr[index];
            arr[index] = arr[left];
            arr[left] = tmp;
            }
            return;
        } else {                  // node with 2 child
            if (arr[left]>arr[right]) {
            swapChild = left;
            } else {
            swapChild = right;
            }
            if (arr[index] < arr[swapChild]) {
            int tmp = arr[index];
            arr[index] = arr[swapChild];
            arr[swapChild] = tmp;
            }
        }
        } else if (heapType == "Min") {
        if (sizeOfTree == left) {   // node with 1 child
            if (arr[index] > arr[left]) {
            int tmp = arr[index];
            arr[index] = arr[left];
            arr[left] = tmp;
            }
            return;
        } else {                    // node with 2 child
            if (arr[left] < arr[right]) {
            swapChild = left;
            } else {
            swapChild = right;
            }
            if (arr[index] > arr[swapChild]) {
            int tmp = arr[index];
            arr[index] = arr[swapChild];
            arr[swapChild] = tmp;
            }
        }
        }
        heapifyTopToBottom(swapChild, heapType);
    }

    public int extractHeadOfBP(String heapType) {
        if (isEmpty()) {
          return -1;
        } else {
          int extractedValue = arr[1]; // taking head
          arr[1] = arr[sizeOfTree]; // replacing head with last ele
          sizeOfTree--; // dectreasing size
          heapifyTopToBottom(1, heapType); // adjusting heap property
          return extractedValue;
        }
    }
    
      // delete
    public void deleteBH() {
        arr = null;
        System.out.println("BH has been successfully deleted");
    }
}