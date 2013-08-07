import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hackerRank {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcase = in.nextInt();
		String b = in.nextLine();
		String[] fill = new String[testcase];
		for (int i = 0;i<fill.length; i++){
			fill[i] = in.nextLine();
			if(fill[i].matches("hackerrank") == true){
				System.out.println(0);
			}
			else if(fill[i].matches(".+hackerrank$") == true){
				System.out.println(2);
			}
			else if(fill[i].matches("^hackerrank.+") == true){
				System.out.println(1);
			}
			else{
				System.out.println(-1);
			}
		}
    }
}
