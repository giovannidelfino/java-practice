package day36_wrapperclasses_arraylistintro;

public class WrapperClassMethods {
	public static void main(String[] args) {
		System.out.println(Byte.MIN_VALUE);//-128
		System.out.println(Byte.MAX_VALUE);//-127
		System.out.println();
		System.out.println(Short.MIN_VALUE);//-32768
		System.out.println(Short.MAX_VALUE);//32767
		System.out.println();
		System.out.println(Integer.MIN_VALUE);//-2147483648
		System.out.println(Integer.MAX_VALUE);//2147483647
		System.out.println();
		System.out.println(Long.MIN_VALUE);//-9223372036854775808
		System.out.println(Long.MAX_VALUE);//9223372036854775807
		System.out.println();
		System.out.println(Float.MIN_VALUE);//1.4E-45
		System.out.println(Float.MAX_VALUE);//3.4028235E38
		System.out.println();
		System.out.println(Double.MIN_VALUE);//4.9E-324
		System.out.println(Double.MAX_VALUE);//1.7976931348623157E308
		System.out.println();
		System.out.println(Boolean.TRUE);//true
		System.out.println(Boolean.FALSE);//false
		System.out.println();
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);//?
		System.out.println();
		int count = Integer.parseInt("345356");
		System.out.println("count: " +count);
		System.out.println();
		int count2 = Integer.valueOf("56565");
		System.out.println("count2: " +count2);
		System.out.println();
		System.out.println(Character.isAlphabetic('a'));
		System.out.println(Character.isAlphabetic('1'));
		System.out.println(Character.isAlphabetic('@'));
		System.out.println();
		System.out.println(Character.isAlphabetic('j'));
		System.out.println(Character.isAlphabetic('!'));
		System.out.println();
		System.out.println(Character.isDigit(5));
		System.out.println(Character.isDigit('p'));
		String str = "java101";
		System.out.println(Character.isAlphabetic(str.charAt(0)));
		System.out.println(Character.isDigit(str.charAt(6)));
		String word = "ab123c5dfer1";
		for(int i = 0; i < word.charAt(word.length()); i++) {
			if (Character.isDigit(word.charAt(i))) {
				System.out.println(word.charAt(i));
			}
		}
	}
}
