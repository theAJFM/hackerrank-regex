import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class utopia {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcase = in.nextInt();
		String b = in.nextLine();
        String format = "([a-z]{0,3})([0-9]{2,8})([A-Z]{3,})(.|)";
		String[] fill = new String[testcase];
		for (int i = 0;i<fill.length; i++){
			fill[i] = in.nextLine();
			if(fill[i].matches(format) == true){
				System.out.println("VALID");
			}
			else{
				System.out.println("INVALID");
			}
		}
    }
}
