import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class stackexchangeScraper {

    public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		String format1 = "<a href=\"/questions/([0-9]+).*>(.*)</a>";
		String format2 = ".*class=\"relativetime\">(.*)</span>";
		Pattern pattern1 = Pattern.compile(format1);
		Pattern pattern2 = Pattern.compile(format2);
		ArrayList<String>ID = new ArrayList<String>();
		ArrayList<String>question = new ArrayList<String>();
		while(in.hasNext()){
			String assessed = in.nextLine();
			Matcher match = pattern1.matcher(assessed);
			Matcher match2 = pattern2.matcher(assessed);
			while(match.find() || match2.find()){
				match.groupCount();
				ID.add(match.group(1));
				question.add(match.group(2));
				System.out.println("Found");
		}
		}
		for(int j = 0;j<ID.size();j++){
			System.out.println(ID.get(j) + ";"+question.get(j));
		}
    }
}
