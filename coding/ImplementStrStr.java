package coding;

import javax.crypto.KeyAgreement;

/**
 * Implement strStr().
 * 
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * 
 * Clarification:
 * 
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 * 
 * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * Example 2:
 * 
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 * Example 3:
 * 
 * Input: haystack = "", needle = ""
 * Output: 0
 *  
 * 
 * Constraints:
 * 
 * 0 <= haystack.length, needle.length <= 5 * 104
 * haystack and needle consist of only lower-case English characters.
 */
public class ImplementStrStr {

    /**
     * Finds if needle is present in haystack, and return its index.
     * 
     * Steps:
     * 1. If hayStack < needle, return -1.
     * 2. If needle = "", return 0
     * 3. Start a loop from 0 to n-m where n is length of haystack, m is length of needle.
     * 4. For string of needle length starting from index in haystack, check if it matches the needle.
     * 5. If matches, return that index.
     * 6. At the end, return -1.
     * @param haystack
     * @param needle
     * @return
     */
    public int findSubString(String haystack, String needle) { // O(nm), O(1)
        int haystackLen = haystack.length(); // O(1), O(1)
        int needleLen = needle.length(); // O(1), O(1)
        if (haystackLen < needleLen) return -1; // O(1), O(1)
        if (needle.equals("")) return 0; // O(1), O(1)
        for (int i = 0; i < haystackLen-needleLen; i++) { // O(nm), O(1)
            if (matches(i, haystack, needle)) return i; // O(m), O(1)
        }
        return -1; // O(1), O(1)
    }

    /**
     * Checks if both strings matches.
     * 
     * Steps:
     * 2. start a for loop from 0 to str2.length
     * 3. Compare that each char at ith index of str2 is equal to each char at ith+start1 of str1.
     * 4. If doesn't match, return false.
     * 5. At the end of loop, return true.
     * @param start1
     * @param str1
     * @param str2
     * @return
     */
    private boolean matches(int start1, String str1, String str2) { // O(m), O(1) where m is length of str2.
        int str2Len = str2.length(); // O(1), O(1)
        for (int i = 0; i < str2Len; i++) { // O(m)
            if (str2.charAt(i) != str1.charAt(start1 + i)) return false; // O(1), O(1)
        }
        return true; // O(1), O(1)
    }

    /**
     * Finds the index of needle in haystack. If found, return index, otherwise -1.
     * 
     * Steps:
     * 1. If haystack.length < needle.length, return -1.
     * 2. If needle.length = 0, return 0.
     * 3. Find the hashcode of needle.
     * 4. Start a for loop from 0 to n-m.
     * 5. For each i in haystack, find the hashcode of m length string starting from i.
     * 6. Compare both hashcodes. 
     * 7. If hashcode matches, then check each character of both strings to ensure they are equals(as hashcode can be same for two different strings because of collision).
     * 8. If string mathces, return the index.
     * 9. At the end of loop, return -1.
     * @param haystack
     * @param needle
     * @return
     */
    public int findSubStringByHashCode(String haystack, String needle) { // O(nm), O(1)
        int haystackLen = haystack.length(); // O(1), O(1)
        int needleLen = needle.length(); // O(1), O(1)
        if(haystackLen < needle.length()) return -1; // O(1), O(1)
        if (needleLen == 0) return 0; // O(1), O(1)
        int needleHash = hashcode(needle, 0, needleLen-1); // O(m), O(1)
        for (int i = 0; i < haystackLen-needleLen; i++) { // O(nm), O(1)
            int haystackHash = hashcode(haystack, i, i+needleLen-1); // O(m), O(1)
            if (haystackHash == needleHash && equals(needle, haystack, i)) { // O(m), O(1)
                return i; // O(1), O(1)
            }
        }
        return -1; // O(1), O(1)
    }

    /**
     * Comapres that str1 and str2 are equal for the given index range.
     * 
     * Steps:
     * 2. start a for loop from 0 to str1.length.
     * 3. Check the ith character of str1 with (i+start2)th character.
     * 4. If not equal, return false.
     * 5. At the end of loop, return true.
     * @param str1
     * @param str2
     * @param start2
     * @return
     */
    private boolean equals(String str1, String str2, int start2) { // O(m), O(1) where m is length of str1.
        for(int i = 0; i < str1.length(); i++) { // O(m)
            if (str1.charAt(i) != str2.charAt(i+start2)) return false; // O(1), O(1)
        }
        return true; // O(1), O(1)
    }

    /**
     * Finds hashcode of string takinf chars from start to end.
     * 
     * Steps:
     * 1. Start a for loop from start to end.
     * 2. For each i, h = h*31 + str[i]
     * 3. At the end of loop, return h.
     * 
     * @param str
     * @param start
     * @param end
     * @return
     */
    private int hashcode(String str, int start, int end) {// O(m), O(1) where m is gap between end and start.
        int hashCode = 0; // O(1), O(1)
        for (int i = start; i <= end; i++) {// O(m), O(1)
            hashCode = hashCode*31 + str.charAt(i); // O(1), O(1)
        }
        return hashCode; // O(1), O(1)
    }

    /**
     * Finds if needle is present in haystack. If yes, return index, else -1.
     * 
     * Steps:
     * 1. If haystack.length < needle.length, return -1.
     * 2. If needle.length == 0. return 0.
     * 3. Find the hashcode of needle.
     * 4. Find the starting hashcode of haystack i..e from 0 to m-1.
     * 5. Start for loop from i = 0 to n-m for haystack.
     * 6. For i != 0, caluclate using rolling hash. (h = h*31 - haystack[i].31^m + haystack[i+m-1])
     * 7. Compare both hashcodes.
     * 8. If hashcode matches, checks if both strings are equal or not.
     * 9. If strings equals, return i.
     * 10. At the end of loop, return -1.
     * @param haystack
     * @param needle
     * @return
     */
    public int findSubStringByRollingHash(String haystack, String needle) { // O(n+m) if collisions are less, otherwise O(nm)
        int haystackLen = haystack.length(); // O(1), O(1)
        int needleLen = needle.length(); // O(1), O(1)
        if (haystackLen < needleLen) return -1; // O(1), O(1)
        if (needleLen == 0) return 0; // O(1), O(1)
        int needleHash = hashcode(needle, 0, needleLen-1); // O(m), O(1)
        int haystackHash = hashcode(haystack, 0, needleLen-1); // O(m), O(1)
        int power = (int)Math.pow(31, needleLen); // O(m), O(1)
        for (int i = 0; i < haystackLen-needleLen; i++) { // O((n-m)*m) if collisions very frequent, otherwise O(n)
            if (i != 0) haystackHash = rollingHashCode(haystackHash, haystack, i, i+needleLen-1, power); // O(1), O(1)
            if (haystackHash == needleHash &&
                equals(needle, haystack, i)) { // O(m), O(1)
                return i; // O(1), O(1)
            }
        }
        return -1; // O(1), O(1)
    }

    private int rollingHashCode(int oldHash, String haystack, int start, int end, int power) { // O(1), O(1)
        return oldHash*31 - haystack.charAt(start-1)*power + haystack.charAt(end); // O(1), O(1)
    }
    
}
