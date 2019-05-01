package day35_review;

public class DecryptionFun {
	public static void main(String[] args) {
		
			System.out.println(decryptChar('a'));
			System.out.println(decryptWord("trlezmmr"));
			
			String encrypted = "sgno";
			String normal = decryptWord(encrypted);
			System.out.println("encrypted: " +encrypted+ "\n" + "normal: " +normal);
			
			System.out.println(decryptSentence("qzez rh ufm"));
		}
	
		public static char decryptChar(char ch) {
			String alphabet = "abcdefghijklmnopqrstuvwxyz";
			String encrypted ="zyxwvutsrqponmlkjihgfedcba";
			
			int i = alphabet.indexOf(ch);
			char ret = encrypted.charAt(i);
			return ret;
		}
		
		public static String decryptWord(String word) {
			String cyphered = "";
			for (int i = 0; i < word.length(); i++) {
				cyphered += decryptChar(word.charAt(i));
			}
			return cyphered;
		}
		
		public static String decryptSentence(String sentence) {
			String[] wordsArr = sentence.split(" ");
			String retValue = "";
			
			for( String word: wordsArr ) {
				retValue += decryptWord(word) + " ";
			}
			return retValue.trim();
		}
		
	}				
