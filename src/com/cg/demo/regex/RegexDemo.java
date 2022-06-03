package com.cg.demo.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexDemo {

	public static void main(String[] args) 
	{
	

	  String input = "1100"; // swerarbcderr
		String regex = "100";

		Pattern pat = Pattern.compile(regex);
		Matcher mat = pat.matcher(input);

		System.out.println(mat.matches()); // false
		System.out.println(mat.lookingAt()); // true
     	System.out.println(mat.find()); // true

//		// character - a-z, A-Z, 0-9, @#$... 
//		// email, password, mobile, ???
//
//		String email1 = "a@b.c";
//		System.out.println(email1);
//
//		String email2 = "a#b*c";
//		System.out.println(email2)
	}

}
