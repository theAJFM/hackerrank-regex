import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class alien {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int testcase = in.nextInt();
		String b = in.nextLine();
		String telformat = "(_|\\.)([0-9]+)([a-zA-Z]*)(_|)";
		String[] fill = new String[testcase];
		for (int i = 0;i<fill.length; i++){
			fill[i] = in.nextLine();
			if(fill[i].matches(telformat) == true){
				System.out.println("VALID");
			}
			else{
				System.out.println("INVALID");
			}
		}
    }
}
