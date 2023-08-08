import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencySortUsingMap {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        String[] nk = br.readLine().split(" ");
        n = Integer.parseInt(nk[0]);
        String[] arrInput = br.readLine().split(" ");
        int[] arr = new int[n];
        for(int i=0; i<n ; i++) {
            arr[i] = Integer.parseInt(arrInput[i]);
        } 
        for(int i : freqSort(arr)) {
            System.out.print(i + " ");
        }
    }

    public static List<Integer> freqSort(int[] arr) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            list.add(Integer.valueOf(arr[i]));
        }
        Collections.sort(list, (f1,f2) -> {
            int freq1 = map.get(f1);
            int freq2 = map.get(f2);
            if(freq1 != freq2)
                return freq2-freq1;
            else
                return f1-f2;
        });
        
        return list;
    }
}
