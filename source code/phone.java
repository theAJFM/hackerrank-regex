import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class phone {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String telformat = "([0-9]+)-([0-9]+)-([0-9]+)";
		String other = "([0-9]+) ([0-9]+) ([0-9]+)";
		Matcher match;
		int testcase = in.nextInt();
		String dec = in.nextLine();
		for(int i = 0; i<testcase;i++){
			String x = in.nextLine();
			if(x.matches(telformat)){
				Pattern pattern = Pattern.compile(telformat);
				match = pattern.matcher(x);
				match.matches();
				match.groupCount();
			}

			else{
				Pattern pattern = Pattern.compile(other);
				match = pattern.matcher(x);
				match.matches();
				match.groupCount();
			}
			System.out.println("CountryCode=" + match.group(1) + ",LocalAreaCode=" + match.group(2)+ ",Number=" + match.group(3));
		}
    }
}
