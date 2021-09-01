class Solution {
    public boolean isPalindrome(int x) {
        String num = Integer.toString(x);
        String backward = "";
        
        for (int i = num.length() - 1; i >= 0; i--) {
            backward = backward + num.substring(i, i + 1);
        }
        
        if (backward.equals(num)) {
            return true;
        }
        return false;
    }
}
