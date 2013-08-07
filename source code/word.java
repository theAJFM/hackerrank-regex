import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
 
public class word {
 
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
		    String[] arr = tot.toString().split("\\W");
		    int testString = in.nextInt();
		    int count = 0;
		
		    for(int j = 0;j<testString;j++){
			    count = 0;
			    String arg = in.next();
			    for(int k = 0;k<arr.length;k++){
				    if(arr[k].matches(arg) == true){
					  count++;
				    }
			    }
			    System.out.println(count);
		    }
    }
}
