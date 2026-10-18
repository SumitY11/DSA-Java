class Solution {
 
    private boolean isAlphaNumeric(char ch) {
        return (ch >= 'a'&& ch <= 'z') ||
               (ch >='A' && ch <= 'Z') ||
               (ch >='0' && ch <= '9');
    }

    private char toLowerChar(char ch) {
        if(ch >= 'A' && ch <= 'Z') {
            return (char)(ch + 32);
        }
 
        return ch;
    }
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
 
        while(left < right) {
            while(left < right && !isAlphaNumeric(s.charAt(left))) {
                left++;
            }
            while(left < right && !isAlphaNumeric(s.charAt(right))) {
                right--;
            }
            if(toLowerChar(s.charAt(left)) != toLowerChar(s.charAt(right))) {
                return false;
            }
 
            left++;
            right--;
        }
 
        return true;
    }
}
 