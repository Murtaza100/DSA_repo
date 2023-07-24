import java.util.HashSet;;

public class Questions {

    /*
     * Remove Duplicates - gfg
     * ---------------------------
    Write a method to remove duplicates from an unsorted linked list.

    Example

    linkedList = 1->2->1->3
    removeDuplicates(linkedList)
    //Output
    1->2->3
     */

    public void removeDuplicates(LinkedList ll) {
        HashSet<Integer> hs = new HashSet<>();
        Node curNode = ll.head;
        Node prevNode = null;
        while(curNode != null){
            if(hs.contains(curNode.value)){
                prevNode.next = curNode.next;
                ll.size--;
            }
            else{
                hs.add(curNode.value);
                prevNode=curNode;
            }
            curNode=curNode.next;
        }
    }

    /*
     * Return Nth to Last
     * -----------------------
        Implement and algorithm to find the nth to last element of a singly linked list.

        Example

        linkedList = 1->2->3->4-5
        nthToLast(linkedList, 2)
        //Output
        4 - 
        //Explanation - as 4 is 2nd element from last
     */
    Node nthToLast(LinkedList ll,int n){
        Node p1 = ll.head;
        Node p2 = ll.head;
        for(int i=1; i<=n; i++){
            if(p2==null){
                return null;
            }
            p2=p2.next;
        }
        while(p2 != null){
            p2=p2.next;
            p1=p1.next;
        }
        return p1;
    }

    /*
     * Remove Nth to Last - leetcode
     * -------------------------------
        Implement and algorithm to find and remove the nth to last element of a singly linked list
        and return head of linked list.
        Example

        linkedList = 1->2->3->4->5
        removeNthToLast(linkedList, 2)
        //Output
        return head of list - 1->2->3->5
        //Explanation - as 4 is 2nd element from last it should be removed
     */
    Node removeNthToLast(LinkedList ll,int n){
        Node p1 = ll.head;
        Node p2 = ll.head;
        for(int i=1; i<=n; i++){
            if(p2==null){
                return null;
            }
            p2=p2.next;
        }
        while(p2.next != null){
            p2=p2.next;
            p1=p1.next;
        }
        p1.next = p1.next.next;
        ll.size--;
        return ll.head;
    }

    /*
     * Partition -
     * ------------------------------------------------
    Write code to partition a linked list around a value x, such that all nodes less than x come before all nodes greater than or equal to x.
    Note: here order can or can not be preserved.
    Example
    --------
    Input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [x=5]

    Output: 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
     */
    public LinkedList partition(LinkedList ll, int x){
        Node curNode = ll.head;
        ll.tail = ll.head;
        while(curNode!=null){
            Node next = curNode.next;
            if(curNode.value < x){
                curNode.next=ll.head;
                ll.head=curNode;
                // System.out.println("in if");
                // ll.traverseList();
            }
            else{
                ll.tail.next = curNode;
                ll.tail=curNode;
                // System.out.println("in else");
                //  ll.traverseList();
            }
            curNode=next;
        }
        ll.tail.next=null;
        return ll;
    }

    // method 2 of partition problem
    /*
     * leetcode (86. Partition List)
     * ------------------------------------------------
    Write code to partition a linked list around a value x, such that all nodes less than x come before all nodes greater than or equal to x.
    Note: You should preserve the original relative order of the nodes in each of the two partitions.
    Example
    --------
    Input:  [1,4,3,2,5,2], x = 3
    Output: [1,2,2,4,3,5]

    Input:  [2,1], x = 2
    Output: [1,2]
     */
    public LinkedList partitionList(LinkedList ll, int x) {
        Node small = new Node();
        Node large = new Node();
        Node smallHead = small;
        Node largeHead = large;

        while(ll.head != null){
            if(ll.head.value < x){
                smallHead.next=ll.head;
                smallHead=smallHead.next;
            }
            else{
                largeHead.next=ll.head;
                largeHead=largeHead.next;
            }
            ll.head= ll.head.next;
        }
        smallHead.next = large.next;
        largeHead.next = null;
        ll.head = small.next;  
        return ll;
    }

    /*
     * Sum Lists
     * --------------
    You have two numbers represented by a linked list, where each node contains a single digit. 
    The digits are stored in reverse order, such that the 1's digit is at the head of the list. 
    Write a function that adds the two numbers and returns the sum as a linked list.

    list1 = 7 -> 1 -> 6
    list2 =  5 -> 9 -> 2
    result = 2 -> 1 -> 9

    Input: l1 = [2,4,3], l2 = [5,6,4]
    Output: [7,0,8]
    Explanation: 342 + 465 = 807.

    Input: l1 = [0], l2 = [0]
    Output: [0]

    Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
    Output: [8,9,9,9,0,0,0,1]
     */
    public LinkedList sumLists(LinkedList l1, LinkedList l2) {
        LinkedList resultList = new LinkedList();
        Node p1 = l1.head;
        Node p2 = l2.head;
        int carry = 0;
        while(p1 != null || p2 != null){
            int result = carry;
            if(p1 != null){
                result += p1.value;
                p1 = p1.next;
            }
            if(p2 != null){
                result += p2.value;
                p2 = p2.next;
            }
            resultList.insertNode(result%10);
            carry = result/10;
        }
        return resultList;
    }

    /*
     * Intersection - leetcode
     * -----------------------------
    Given two (singly) linked lists, determine if the two lists intersect. 
    Return the intersecting node. Note that the intersection is defined 
    based on reference, not value. That is, if the kth node of the first 
    linked list is the exact same node (by reference) as the jth node of 
    the second linked list, then they are intersecting.

    llA.insertNode(3);
    llA.insertNode(1);
    llA.insertNode(5);
    llA.insertNode(9);
    LinkedList llB = new LinkedList();
    llB.insertNode(2);
    llB.insertNode(4);
    llB.insertNode(6);
    Exercise ex = new Exercise();
    ex.addSameNode(llA, llB, 7);
    ex.addSameNode(llA, llB, 2);
    ex.addSameNode(llA, llB, 1);
    Node inter = ex.findIntersection(llA, llB);
    System.out.println(inter.value);
 
    // output - 7 // intersecting node value

    for more explanation about input output, refer :
    https://leetcode.com/problems/intersection-of-two-linked-lists/

     */
    Node findIntersection(LinkedList llA, LinkedList llB) {
        Node p1 = llA.head;
        Node p2 = llB.head;
        Node curr = llA.head;; int a=0,b=0;
        while(curr != null){
            a++;
            curr = curr.next;
        }
        curr = llB.head;
        while(curr != null){
            b++;
            curr=curr.next;
        }
        if(a>b){
            int diff=a-b;
            while(diff>0){
                p1=p1.next;
                diff--;
            }
        }
        else{
            int diff = b-a;
            while(diff>0){
                p2=p2.next;
                diff--;
            }
        }
        while(p1!=null && p2!=null){
            if(p1==p2){
                return p1;
            }
            p1=p1.next;
            p2=p2.next;
        }
        return null;
    }
    // Add same node
    void addSameNode(LinkedList llA, LinkedList llB, int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        llA.tail.next = newNode;
        llA.tail = newNode;
        llB.tail.next = newNode;
        llB.tail = newNode;
    }

}

