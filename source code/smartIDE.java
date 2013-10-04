import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class smartIDE {

    public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		String java = ".*import java\\..*";
		String c = ".*#include<.*";
        boolean checked = false;
		while(in.hasNext()){
			String assessed = in.nextLine();
            if(assessed.matches(java)){
                System.out.println("Java");
                checked = true;
                break;
            }
            else if(assessed.matches(c)){
                System.out.println("C");
                checked = true;
                break;
            }
		}
        if(checked == false){
            System.out.println("Python");
        }
    }
}
