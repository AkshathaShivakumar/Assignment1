package Assignments.Module8;

import java.util.*;

//LeetCode 49 – Group Anagrams
class GroupAnagramsSimple {

    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {

            // Convert word to char array and sort it
            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            // Convert back to string (this will be the key)
            String sortedWord = new String(chars);

            // If key not present, create new list
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            // Add original word to correct group
            map.get(sortedWord).add(word);
        }

        // Return all grouped values
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> result = groupAnagrams(strs);

        System.out.println(result);
    }
}