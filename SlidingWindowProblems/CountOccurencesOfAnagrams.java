/*
Count Occurrences of Anagrams
--------------------------------
 * Given a word and a text, return the count of the occurrences 
 * of anagrams of the word in the text(For eg: anagrams of word 
 * for are for, ofr, rof etc.))

Examples: 
------------
Input : forxxorfxdofr
            for
Output : 3
Explanation : Anagrams of the word for – for, orf, ofr appear in the text and hence the count is 3.

Input : aabaabaa
            aaba
Output : 4
Explanation : Anagrams of the word aaba – aaba, abaa each appear twice in the text and hence the count is 4.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class CountOccurencesOfAnagrams {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strSource = br.readLine();
        String strPattern = br.readLine();
        System.out.println(countAnagrams(strSource, strPattern));
    }

    public static int countAnagrams(String source, String pattern) {
        int i=0, j=0, count=0;
        //String ans = " "; // to store starting index of string anagram
        Map<Character, Integer> sourceMap = new HashMap<>();
        Map<Character, Integer> patternMap = new HashMap<>();
        for(int k=0; k<pattern.length(); k++) {
            char ch = pattern.charAt(k);
            patternMap.put(ch, patternMap.getOrDefault(ch,0)+1);
        }
        while(j<source.length()) {
            char ch = source.charAt(j);
            sourceMap.put(ch, sourceMap.getOrDefault(ch,0)+1);
            if(j-i+1 < pattern.length())
                j++;
            else if(j-i+1 == pattern.length()) {
                if(compare(sourceMap,patternMap)) {
                    count++;
                    //ans += i + " "; // to get starting index of string anagram
                }
                if(sourceMap.get(source.charAt(i))==1)
                    sourceMap.remove(source.charAt(i));
                else {
                    sourceMap.put(source.charAt(i), 
                        sourceMap.get(source.charAt(i))-1);
                }
                i++;j++;       
            }
        }
        //System.out.println(ans); to print starting index of string anagram
        return count;
    }

    public static boolean compare(Map<Character,Integer> sourceMap, 
        Map<Character,Integer> patternMap) {
            for(char ch : sourceMap.keySet()) {
                if(patternMap.getOrDefault(ch, 0)
                    != sourceMap.get(ch)){
                        return false;
                    }
            }
            return true;
        }
}
