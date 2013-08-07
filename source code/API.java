import java.io.*;
import java.util.ArrayList;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class API {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		ArrayList<String> lan = new ArrayList<String>();
		lan.add("C");
		lan.add("CPP");
		lan.add("JAVA");
		lan.add("PYTHON");
		lan.add("PERL");
		lan.add("PHP");
		lan.add("RUBY");
		lan.add("CSHARP");
		lan.add("HASKELL");
		lan.add("CLOJURE");
		lan.add("BASH");
		lan.add("SCALA");
		lan.add("ERLANG");
		lan.add("CLISP");
		lan.add("LUA");
		lan.add("BRAINFUCK");
		lan.add("JAVASCRIPT");
		lan.add("GO");
		lan.add("D");
		lan.add("OCAML");
		lan.add("R");
		lan.add("PASCAL");
		lan.add("SBCL");
		lan.add("DART");
		lan.add("GROOVY");
		lan.add("OBJECTIVEC");
		int testcase = in.nextInt();
		String[] fill = new String[testcase];
		for (int i = 0;i<fill.length; i++){
			int id = in.nextInt();
			fill[i] = in.next();
			if(lan.contains(fill[i]) == true){
				System.out.println("VALID");
			}
			else{
				System.out.println("INVALID");
			}
		}
    }
}
