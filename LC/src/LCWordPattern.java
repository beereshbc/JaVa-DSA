public class LCWordPattern {
    static void main(String[] args) {
    wordPattern("abba", "dog cat cat dog");
    }
//incompleted
    static void wordPattern(String pattern, String s) {
        String[] words = pattern.split(" ");
        for (int i = 0; i < pattern.length(); i++) {
            char str = pattern.charAt(1);

            System.out.println(str);
        }



    }
}
