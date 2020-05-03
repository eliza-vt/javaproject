import java.util.Scanner;
import java.util.*;
import java.util.function.Consumer;
public class LambApps {
	public static void main(String [] args) {
		java.util.Scanner in = new Scanner(System.in);
		Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
		printUpperCase.accept("hello");
		
	}

}
