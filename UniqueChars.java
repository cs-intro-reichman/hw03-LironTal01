/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        
       String ans = "" + (char)(s.charAt(0));
       int n = 0;

       for (int i = 0; i<s.length(); i++){
           n=ans.indexOf(s.charAt(i)); // #feedback - you can remove this "n" vairable and call the indexOf directly inside the "if".
           if (n>=0 && s.charAt(i) != ' ') {
            ans = ans;
           }
           else {
            ans = ans + s.charAt(i);
           }
    }
    return ans;
}
}
