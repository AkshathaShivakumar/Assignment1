package Assignments.Module8;
// LeetCode 387 – First Unique Character in a String
class FirstUniqueCharacter {

    public static int firstUniqChar(String s) {
        int[] count = new int[26];

        // Step 1: Count frequency
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        // Step 2: Find first unique character
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));      // 0
        System.out.println(firstUniqChar("loveleetcode"));  // 2
        System.out.println(firstUniqChar("aabb"));          // -1
    }
}