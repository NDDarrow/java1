package study1219;


import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class string {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		String word = "i like banana chacha";
		char ch = word.charAt(2);
		System.out.print(ch);
		//ch = scan.next().charAt(0);
		System.out.println(ch);
		
		//2. ¹®ÀÚ¿­ ºñ±³ - equals();
		if( word.equals("i like") )
			System.out.println("°°´Ù");
		else
			System.out.println("°°Áö¾Ê´Ù");
		
		//¹®ÀÚ¿­À» byte·Î º¯È¯ getBytes(); - ÆÄÀÏ ºÒ·¯¿À±â
		byte[] code = word.getBytes();
		System.out.println( Arrays.toString( code ));
		
		//4. ¹®ÀÚ¿­¿¡¼­ Æ¯Á¤ ¹®ÀÚ¿­ÀÇ ¸®Ä¡¸¦ ¸®ÅÏ - indexOf()
		int k = word.indexOf('k');
		System.out.println( k );
		
		int banana = word.indexOf("banana");
		System.out.println( banana );
		
		int a5 = word.indexOf('a', 10);
		System.out.println( a5 );
		int cha = word.indexOf( "ch", 15 );
		System.out.println( cha );
		
		//5. ¹®ÀÚ¿­ÀÇ ±æÀÌ - length()
		int len = word.length();
		System.out.println( len );
		
		//6. ¹®ÀÚ¿­ º¯°æ(Ä¡È¯) - replace()
		String apple = word.replace("banana", "apple");
		System.out.println(apple);
		
		// ÀÚ¹Ù½ºÅ©¸³Æ®¿¡¼­ Á¤±ÔÇ¥Çö½ÄÀ» ÀÌ¿ëÇÏ¿© ¹®ÀÚ¿­ º¯°æ
		// ÀÚ¹Ù¿¡¼­µµ Á¤±ÔÇ¥Çö½ÄÀ» »ç¿ëÇÑ´Ù
		// [^0-9]
		// Æ¯¼ö¹®Á¦ÀÚ°Å [^¤¡-¤¾¤¿-¤Ó°¡-ÆRa-zA-Z0-9]
		
		String temp = "010-1234-5678";
		temp = temp.replaceAll("[^0-9]","");
		System.out.println(temp);
		
		//7. ¹®ÀÚ¿­ ÃßÃâ - substring
		
		temp = word.substring(5);
		System.out.println( temp );
		
		temp = word.substring(7,15);
		System.out.println( temp );
		
		temp = "shwo5158@naver.com";
		//¾ÆÀÌµğ¿Í Æ÷ÅĞ»çÀÌÆ® ÁÖ¼Ò ¾Ë¾Æ³»±â
		String id = temp.substring(0, temp.indexOf("@"));
		System.out.println( id );
		
		String web = temp.substring(temp.indexOf("@")+1);
		System.out.println( web );
		
		// À§ ÁÖ¼Ò¿¡¼­ µµ½Ã¸í°ú µµ·Î¸íÀ» Ãâ·Â
		
		temp = "´ëÀü±¤¿ª½Ã Áß±¸ Áß¾Ó·Î 121¹ø±æ 20";
		String city = temp.substring(0, temp.indexOf(" "));
		System.out.println( city );
		String load = temp.substring(temp.indexOf(" ", city.length()+1)+1);
		System.out.println( load );
		
		//8. ¹®ÀÚ¿­ ºĞ¸® - split()
		String[] str = word.split(" ");
		System.out.println( Arrays.toString(str));
		temp = "010-5480-5158";
		String password = temp.split("-")[2];
		
		temp = "12 °¡ 4570";
		String[] car = temp.split( " " );
		if( car[2].equals( "4570" )) {
			System.out.println("ÁÖÂ÷ºñ Á¤»ê");
		}else if( car[0].equals( "12" )) {
			System.out.println("ÁÖÂ÷ºñ Á¤»ê");	
		}
		
		//9. ´ë¹®ÀÚ, ¼Ò¹®ÀÚ º¯È¯ - toLowerCase(), toUpperCase()
		temp = word.toUpperCase();
		System.out.println(temp);
		
		temp = temp.toLowerCase();
		System.out.println(temp);
		
		//10. ¹®ÀÚ¿­°ú ¹®ÀÚ¿­À» °áÇÕ - concat()
		word = "³»°¡ ÁÁ¾ÆÇÏ´Â ³ë·¡ : ";
		temp = "Æ®·ÎÆ®°¡ ½È¾î¿ä";
		String song = word.concat(temp);
		System.out.println(song);
		
		//11. String ÂüÁ¶º¯¼ö°¡ ºó°ªÀÎÁö È®ÀÎ( ¹®ÀÚ¿­ÀÌ ÀÖ³Ä ¾ø³Ä) - isEmpty() -°á°ú boolean
		if( word.isEmpty())
			System.out.println("ºó°ª");
		else
			System.out.println("µé¾îÀÖ´Â°ª");
		
		//12. ¹®ÀÚ¿­¿¡ Æ¯Á¤ ¹®ÀÚ ¶Ç´Â ¹®ÀÚ¿­ Æ÷ÇÔ ¿©ºÎ - contains() -°á°ú boolean
		if( word.contains("³ë·¡"))
			System.out.println("µé¾îÀÖ´Â°ª");
		else
			System.out.println("ºó°ª");
		
		//13. Æ¯Á¤¹®ÀÚ·Î ½ÃÀÛ, ³¡³ª´ÂÁö °Ë»ç - startsWith(), endWith() - °á°ú boolean
		
		System.out.println(word.startsWith("³»°¡"));
	}

}
