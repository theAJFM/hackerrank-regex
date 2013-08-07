import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PAN {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcase = in.nextInt();
		String b = in.nextLine();
		String[] fill = new String[testcase];
		for (int i = 0;i<fill.length; i++){
			fill[i] = in.nextLine();
			if(fill[i].matches("[A-Z][A-Z][A-Z][A-Z][A-Z][0-9][0-9][0-9][0-9][A-Z]") == true || fill[i].matches("[a-z][a-z][a-z][a-z][a-z][0-9][0-9][0-9][0-9][a-z]") == true){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
    }
}
