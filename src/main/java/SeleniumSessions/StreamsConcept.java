package SeleniumSessions;

import java.util.Arrays;

public class StreamsConcept {

	public static void main(String[] args) {
		int num[] = { 10, 30, 45, 88, 99 };

		Arrays.stream(num).filter(ele -> ele % 2 == 0).forEach(ele -> System.out.print(ele + " "));
		Arrays.stream(num).filter(ele -> ele % 2 != 0).forEach(ele -> System.out.println(ele + " "));
	}

}
