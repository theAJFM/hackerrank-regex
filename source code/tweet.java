import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class tweet {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
        int count = 0;
		int testcase = in.nextInt();
		String b = in.nextLine();
        String format = "(?i).*(#|@|)hackerrank.*";
		String[] fill = new String[testcase];
		for (int i = 0;i<fill.length; i++){
			fill[i] = in.nextLine();
			if(fill[i].matches(format) == true){
				count++;
			}
		}
        System.out.println(count);
    }
}
