Use a bucket to count the number of each letter in the two strings. If the buckets of s and t are the same, then they are anagram.

```java
// The most intuitive answer
public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) return false;

    int[] bucketS = new int[26];
    int[] bucketT = new int[26];
    for (int i = 0; i < s.length(); i++) {
        bucketS[s.charAt(i) - 'a']++;
    }
    for (int i = 0; i < t.length(); i++) {
        bucketT[t.charAt(i) - 'a']++;
    }
    for (int i = 0; i < 26; i++) {
        if (bucketS[i] != bucketT[i]) {
            return false;
        }
    }
    return true;
}
```

To optimize the code:

If the two buckets are the same, then the subtraction of each element in the two buckets is always zero. So we can combine two buckets into one.