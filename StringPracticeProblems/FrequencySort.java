import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencySort {
        public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(freqSort(input));
    }

    public static String freqSort(String str) {
        Map<Character, Integer> map = new HashMap<>();
        char[] strArray = str.toCharArray();
        for(int i=0; i<strArray.length; i++) {
            map.put(strArray[i], map.getOrDefault(strArray[i], 0)+1);
        }
        StringBuilder sb = new StringBuilder();
        List<Map.Entry<Character,Integer>> list = new ArrayList<>();
        for(Map.Entry<Character,Integer> entry : map.entrySet()) {
            list.add(entry);
        }
        Collections.sort(list, (f1,f2) -> {
            int freq1 = map.get(f1.getKey());
            int freq2 = map.get(f2.getKey());
            return freq2-freq1;
        });
        for(Map.Entry<Character,Integer> entry : list) {
            int freq = entry.getValue();
            while(freq>0){
                sb.append(entry.getKey());
                freq--;
            }
        }
        return sb.toString();
    }
}