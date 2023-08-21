public class App {
    public static void main(String[] args) throws Exception {
        LinkedList ll1 = new LinkedList();
        // ll1.createLinkedList(1);
        // ll1.insertNode(2);
        // ll1.insertNode(1);
        // ll1.insertNode(9);
        // ll1.insertNode(4);
        // ll1.insertNode(8);
        // ll1.createLinkedList(3);
        // ll1.insertNode(5); 
        // ll1.insertNode(8); 
        // ll1.insertNode(5); 
        // ll1.insertNode(10); 
        // ll1.insertNode(2); 
        // ll1.insertNode(1);
        ll1.createLinkedList(1);
        ll1.insertNode(4);
        ll1.insertNode(3);
        ll1.insertNode(2);
        ll1.insertNode(5);
        ll1.insertNode(2);

        
        // ll1.traverseList();
       Questions questions = new Questions();

    // Remove Duplicates
    // questions.removeDuplicates(ll1);
    // ll1.traverseList();

    // Return Nth to Last
    Node ans = questions.nthToLast(ll1,2);
    System.out.println("nth last value is : " + ans.value);
       
    // Remove Nth Node from last
    // questions.removeNthToLast(ll1, 3);
    // ll1.traverseList();

    // Partition
    // LinkedList resultantList = questions.partition(ll1, 3);
    // resultantList.traverseList();

    // Sum Lists
    // LinkedList ll2 = new LinkedList();
    // ll2.insertNode(7);
    // ll2.insertNode(1);
    // ll2.insertNode(6);
    // LinkedList ll3 = new LinkedList();
    // ll3.insertNode(5);
    // ll3.insertNode(9);
    // ll3.insertNode(2);
    // LinkedList ans = questions.sumLists(ll2, ll3);
    // ans.traverseList();


    // intersection
    LinkedList llA = new LinkedList();
    llA.insertNode(3);
    llA.insertNode(1);
    llA.insertNode(5);
    llA.insertNode(9);
    LinkedList llB = new LinkedList();
    llB.insertNode(2);
    llB.insertNode(4);
    llB.insertNode(6);

    // questions.addSameNode(llA, llB, 7);
    // questions.addSameNode(llA, llB, 2);
    // questions.addSameNode(llA, llB, 1);
    // Node inter = questions.findIntersection(llA, llB);
    // System.out.println(inter.value);

    questions.reverseList(llB);
    llB.traverseList();
    }
}
