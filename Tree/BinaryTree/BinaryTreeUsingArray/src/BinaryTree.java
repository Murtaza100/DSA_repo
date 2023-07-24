public class BinaryTree {
    String[] arr;
    int lastUsedIndex;

    public BinaryTree(int size) {
        this.arr = new String[size+1]; // since we will not used 0th index
        lastUsedIndex=0;
        System.out.println("Created blank binary tree of size "+size);
    }

    // if binary tree is full or not
    public boolean isFull() {
        if(lastUsedIndex == arr.length-1)
            return true;
        else
            return false;
    }

    // inserting in BT
    public void insert(String value) {
        if(!isFull()) {
            arr[lastUsedIndex + 1] = value;
            lastUsedIndex++;
            System.out.println(value + " is inserted");
        }
        else {
            System.out.println("BT is full, can't insert new node");
        }
    }

    // PreOrder traversal => Node -> left -> right
    public void preOrder(int index) {
        if(index > lastUsedIndex){
            return;
        }
        System.out.print(arr[index] + " ");
        preOrder(2*index);
        preOrder(2*index + 1);
    }

    // InOrder traversal => left -> Node -> right
    public void inOrder(int index) {
        if(index > lastUsedIndex)
            return;
        inOrder(2*index);
        System.out.print(arr[index] + " ");
        inOrder(index*2 + 1);
    }

    // PostOrder traversal => left -> right -> Node
    public void postOrder(int index) {
        if(index > lastUsedIndex)
            return;
        postOrder(index*2);
        postOrder(index*2 + 1);
        System.out.print(arr[index] + " ");
    }

    // LevelOrder traversal
    public void levelOrder() {
        for(int i=1; i<= lastUsedIndex; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Search in BT
    public int search(String value) {
        for(int i=1; i<= lastUsedIndex; i++) {
            if(arr[i] == value){
                System.out.println("found "+value+" at index "+i);
                return i;
            }
        }
        System.out.println("Element not found");
        return -1;
    }

    // Delete a node from BT
    public void deleteNode(String value) {
        int location = search(value);
        if(location == -1){
            System.out.println("No node found to delete with value "+value);
            return;
        }
        arr[location] = arr[lastUsedIndex]; // since deepest node is at index lastUsedIndex
        lastUsedIndex--;
        System.out.println("successfully deleted node with value "+value);
    }

    // Delete whole BT
    public void deleteBT() {
        arr = null;
        System.out.println("BT deleted successfully");
    }
}



