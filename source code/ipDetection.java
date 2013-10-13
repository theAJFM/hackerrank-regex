import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ipDetection {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcase = in.nextInt();
		String b = in.nextLine();
		for (int i = 0;i<testcase; i++){
			String test = in.nextLine();
			String splitter [] = test.split(" "); 
			if(splitter[0].matches("([0-9]{1,2}|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.([0-9]{1,2}|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.([0-9]{1,2}|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.([0-9]{1,2}|1[0-9][0-9]|2[0-4][0-9]|25[0-5])") == true){
				System.out.println("IPv4");
			}
			else if(splitter[0].matches("([0-9a-f]+)\\:([0-9a-f]+)\\:([0-9a-f]+)\\:([0-9a-f]+)\\:([0-9a-f]+)\\:([0-9a-f]+)\\:([0-9a-f]+)\\:([0-9a-f]+)") == true){
				System.out.println("IPv6");
			}
			else{
				System.out.println("Neither");
			}
		}
    }
}
