class Solution {
    public boolean isPalindrome(String s) {
        String newString = s.toLowerCase();
        String result = "";

        for (int i = 0; i < newString.length(); i++) {
            if (Character.isLetterOrDigit(newString.charAt(i))) {
                result += newString.charAt(i);
            }
        }

        int left = 0;
        int right = result.length() - 1;

        while (left < right) {
            if (result.charAt(left) != result.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}