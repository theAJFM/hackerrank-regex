import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HTMLlinks {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String format = ".*<a href( |)=( |)\"([^>^\"]+)\"( |).*>( |)(<tag>)*([\\w \\,\\.\\?\\!\\/^<]*)( |)(</tag>)*";
		ArrayList<String> tag = new ArrayList<String>();
		int testcase = in.nextInt();
		String dec = in.nextLine();
		for(int i = 0; i<testcase;i++){
			String x = in.nextLine();
			String[] y = x.split("</.>");
			for(int j = 0;j<y.length;j++){
				if(y[j].matches(format) == true){
					Pattern pattern = Pattern.compile(format);
					Matcher match = pattern.matcher(y[j]);
					match.matches();
					match.groupCount();
					System.out.println(match.group(3)+","+match.group(7));
				}
			}
		}
    }
}
