public class Trie {
    private TrieNode root;
    public Trie() {
        this.root = new TrieNode();
        System.out.println("Trie has been created");
    }

    // insert word in trie
    public void insert(String word) {
        TrieNode curNode = root;
        for(int i=0; i<word.length(); i++) {
            TrieNode newNode = curNode.children.get(word.charAt(i));
            if(newNode == null) {
                newNode = new TrieNode();
                curNode.children.put(word.charAt(i), newNode);
            }
            curNode = newNode;
        }
        curNode.endOfString = true;
        System.out.println(word+" inserted into trie");
    }

    // Search for a word in Trie
    public boolean search(String word) {
        TrieNode currentNode = root;
            for (int i =0; i<word.length(); i++) {
              char ch = word.charAt(i);
              TrieNode node = currentNode.children.get(ch);
              if (node == null) {
                System.out.println("Word: "+word+ " does not exist in Trie");
                return false;
              }
              currentNode = node;
            }
            if (currentNode.endOfString == true) {
                System.out.println("Word: "+word+ " exists in Trie");
                return true;
            } else {
              System.out.println("Word: "+word+ " does not exist in Trie. But it is a prefix of another string");
            }
        return currentNode.endOfString;
    }

    // Delete a String from Trie
    private boolean delete(TrieNode parentNode, String word, int index) {
        char ch = word.charAt(index);
        TrieNode currentNode = parentNode.children.get(ch);
        boolean canThisNodeBeDeleted;
  
        // CASE 1- SOME OTHER WORD'S PREFIX IS SAME AS THAT OF WORD TO BE DELETED
        if (currentNode.children.size() > 1) { // WE CAN'T DELETE BCZ IT IS ALSO PREFIX OF OTHER WORD
          delete(currentNode, word, index+1); // GOTO NEXT NODE
          return false;
        }

        // CASE 2- WE ARE AT LAST CHAR OF THIS WORD BUT THIS WORD IS PREFIX OF SOME OTHER WORD
        if (index == word.length() -1) {
          if (currentNode.children.size()>=1) { // THIS WORD IS PREFIX OF THER WORD
            currentNode.endOfString = false; // TO MAKE THIS WORD INCOMPLETE
            return false;
          } else { // IF IT IS NOT PREFIX OF OTHER WORD
            parentNode.children.remove(ch);
            return true;
          }
        }
        
        // CASE 3- SOME OTHER WOTD IS PREFIX OF THIS WORD
        if (currentNode.endOfString == true) {
          delete(currentNode, word, index+1); // CALL FOR NEXT CHARACTER
          return false;
        }

        // CASE 4- NO OTHER WORD IS DEPENDENT ON THIS NODE
        canThisNodeBeDeleted = delete(currentNode, word, index+1);
        if (canThisNodeBeDeleted == true) { // NO ONE DEPEND ON IT
          parentNode.children.remove(ch);
          return true;
        } else { // IF OTHER WORD DEPEND ON IT
          return false;
        }
      }
  
    public void delete(String word) {
        if (search(word) == true) {
          delete(root, word, 0);
        }
    }
  
      
}
