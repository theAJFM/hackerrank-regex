import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HTMLtags {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String format = "(\\w+)(| ).*>.*";
		ArrayList<String> tag = new ArrayList<String>();
		int testcase = in.nextInt();
		String dec = in.nextLine();
		for(int i = 0; i<testcase;i++){
			String x = in.nextLine();
			String[] y = x.split("<");
			for(int j = 0;j<y.length;j++){
				System.out.println(y[j]+" " + j);
				if(y[j].matches(format) == true){
					Pattern pattern = Pattern.compile(format);
					Matcher match = pattern.matcher(y[j]);
					match.matches();
					match.groupCount();
					if(tag.contains(match.group(1)) == false){
						tag.add(match.group(1));
					}
				}
			}
		}
		Collections.sort(tag);
		for(int k = 0;k<tag.size();k++){
			if(k == tag.size()-1){
				System.out.println(tag.get(k));
			}
			else{
			System.out.print(tag.get(k)+";");
			}
		}
    }
}
