public class App {
    public static void main(String[] args) throws Exception {
        Trie trie = new Trie();
        trie.insert("API");
        trie.insert("APIS");
        trie.search("API");
        // trie.search("APIS");
        // trie.search("AP");
        // trie.search("APS");
        trie.delete("API");
        trie.search("API");
    }
}
