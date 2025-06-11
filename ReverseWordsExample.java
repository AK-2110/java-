package demo;

public class ReverseWordsExample {
	public static String reverseWords(String str) {
        String[] words = str.split("\\s+"); 
        StringBuilder reversedStr = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedStr.append(reversedWord.reverse()).append(" ");
        }

        return reversedStr.toString().trim();
    }
	public static void main(String[] args) {
		String str = "Java is fun";
        String result = reverseWords(str);
        System.out.println(result); 
	}

}
