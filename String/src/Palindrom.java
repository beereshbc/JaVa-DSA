public class Palindrom {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrom1(String str){
        str = str.toLowerCase();
        for (int i = 0; i <= str.length()/2; i++) {
            int start = str.charAt(i);
            int end = str.charAt(str.length()-1-i);
            if (start != end){
                return false;
            }

        }
        return true;
    }

    static boolean isPalindrome(String s) {
        s = s.toLowerCase().strip().replaceAll("[^a-z0-9]", "");
        System.out.println(s);
        for (int i = 0; i <s.length()/2 ; i++) {
            int start = s.charAt(i);
            int end = s.charAt(s.length()-1-i);
            if (start != end){
                return false;
            }

        }
 return true;
    }





}
