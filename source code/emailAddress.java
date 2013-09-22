import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class emailAddress {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String format = "([a-zA-Z0-9\\_\\.\\-]+)@([a-zA-Z0-9\\-\\.]+)(\\.[a-zA-Z]+)(/\\S*)?";
		Pattern pattern = Pattern.compile(format);
		ArrayList<String>links = new ArrayList<String>();
		int testcase = in.nextInt();
		String dec = in.nextLine();
		for(int i = 0;i<testcase;i++){
			String assessed = in.nextLine();
			Matcher match = pattern.matcher(assessed);
			while(match.find()){
					match.groupCount();
					if(links.contains(match.group(1)+ '@' + match.group(2)+match.group(3)) == false){
						links.add(match.group(1)+'@' +match.group(2)+match.group(3));
					}
			}
		}
		Collections.sort(links);
		for(int j = 0;j<links.size();j++){
			if(j == links.size()-1){
				System.out.println(links.get(j));
			}
			else{
				System.out.print(links.get(j)+";");
			}
		}
    }
}
