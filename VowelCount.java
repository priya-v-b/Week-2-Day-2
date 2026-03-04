public class VowelCount {
    public static int countVowels(String str) {
    if (str == null) {
        return 0;
    }

    int count = 0;
    str = str.toLowerCase();  // Make it case-insensitive

    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            count++;
        }
    }

    return count;
}
        public static void main(String[] args) {
    String text = "We are besties";
    System.out.println(countVowels(text)); 
        
    }
}
