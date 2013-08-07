import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class USUK {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcase = in.nextInt();
		String b = in.nextLine();
		String fill = "";
		StringBuilder tot = new StringBuilder();

		for (int i = 0;i<testcase; i++){
			fill = in.nextLine();
			tot.append(fill + " ");
			
		}
		String[] arr = tot.toString().split(" ");
		int testString = in.nextInt();
		int count = 0;
		
		for(int j = 0;j<testString;j++){
			count = 0;
			String arg = in.next();
			for(int k = 0;k<arr.length;k++){
				String US = arr[k].replaceAll("se$", "ze");
				if(arr[k].matches(arg) == true || US.matches(arg) == true){
					count++;
				}
			}
			System.out.println(count);
		}
    }
}
