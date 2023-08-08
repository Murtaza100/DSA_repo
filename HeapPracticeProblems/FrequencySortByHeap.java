import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequencySortByHeap {
    public static class Pair implements Comparable<Pair> {
        int value;
        int  frequency;
    
        public Pair(int value, int frequency) {
            this.value = value;
            this.frequency = frequency;
        }
    
        @Override
        public int compareTo(Pair o) {
            return this.frequency - o.frequency;
        }
    
    }
    

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n , k;
        String[] nk = br.readLine().split(" ");
        n = Integer.parseInt(nk[0]);
        String[] arrInput = br.readLine().split(" ");
        int[] arr = new int[n];
        for(int i=0; i<n ; i++) {
            arr[i] = Integer.parseInt(arrInput[i]);
        } 
        for(int i : frequencySort(arr)) {
            System.out.print(i + " ");
        }
    }

    public static List<Integer> frequencySort(int[] arr) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> freqCount = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            freqCount.put(arr[i], freqCount.getOrDefault(arr[i], 0)+1);
        }
        PriorityQueue<Pair> minHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for(Map.Entry<Integer,Integer> e : freqCount.entrySet()) {
            minHeap.offer(new Pair(e.getKey(), e.getValue()));
        }
        while(minHeap.size()>0) {
            int freq = minHeap.peek().frequency;
            for(int i=0; i<freq; i++) {
                list.add(minHeap.peek().value);
            }
            minHeap.poll();
            
        }
        return list;
    }
}
