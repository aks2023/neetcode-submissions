

public class Solution {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length())   // length prefix
              .append('#')          // delimiter
              .append(s);           // actual string
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {
            // Find the '#' delimiter
            int j = i;
            while (s.charAt(j) != '#') j++;

            // Parse the length prefix
            int len = Integer.parseInt(s.substring(i, j));

            // Extract exactly `len` characters after '#'
            result.add(s.substring(j + 1, j + 1 + len));

            // Move pointer past this encoded chunk
            i = j + 1 + len;
        }

        return result;
    }
}