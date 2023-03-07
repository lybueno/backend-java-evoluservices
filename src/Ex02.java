import java.util.Locale;

public class Ex02 {

    public boolean isPalindrome(String s){

        boolean flag = false;
        String sLowerCase = s.toLowerCase();
        int end = sLowerCase.length() - 1;
        int start = 0;

        while(start <= end){

            if(sLowerCase.charAt(start) == sLowerCase.charAt(end)){
                flag = true;
            } else {
               flag = false;
            }
            start++;
            end--;
        }

        return flag;
    }

}
