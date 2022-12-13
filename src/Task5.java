public class Task5 {
    //https://leetcode.com/problems/valid-palindrome/submissions/858249188/
    public boolean isPalindrome(String s) {
        // задаем два курсор left =идет слева right= идет справа
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left += 1;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right -= 1;
            }
            char leftChar = Character.toLowerCase(s.charAt(left));
            char rightChar = Character.toLowerCase(s.charAt(right));
            if (leftChar != rightChar) {
                return false;
            }
            left += 1;
            right -= 1;
        }
        return true;


    }
}
