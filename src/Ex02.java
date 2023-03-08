import java.util.Locale;

public class Ex02 {

    public boolean isPalindrome(String s){

        String sLowerCase = s.toLowerCase().trim();
        int end = sLowerCase.length() - 1;
        int start = 0;

        if(sLowerCase.length() < 2){
            return false;
        }

        while(start <= end){

            if(sLowerCase.charAt(start) != sLowerCase.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

}
