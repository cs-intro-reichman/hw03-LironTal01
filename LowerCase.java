/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
       int i = 0 ;
       String ans = "";
       while (i<s.length()) {
        char ch = s.charAt(i);
        if (ch >= 65 && ch <=90) {
            ans = ans +(char)(s.charAt(i)+32);
           
        }

        else if (ch == ' ' || ch>90 || ch<65){
            ans = ans + ch;
        }

        i++;
        
       }
        return ans;
    }
}