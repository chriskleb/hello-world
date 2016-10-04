import java.util.regex.*;
public class replaceStringExample {

	public static void main(String[] args) {
		String str = "My name is Milan, people know me as Milan Vasic.";

	    Pattern p = Pattern.compile("(Milan)(?! Vasic)");
	    Matcher m = p.matcher(str);

	    StringBuffer sb = new StringBuffer();

	    while(m.find()) {
	        m.appendReplacement(sb, "Milan Vasic");
	    }

	    m.appendTail(sb);
	    System.out.println(sb);


	}

}
