package sara;

import java.util.Arrays;

public class LearningArray {

	public static void main(String[] args) {
		String [] a = {"Mahesh","Sara","Karthik","Sid","Rekha"};
		
		//System.out.println(a.length);
		int length = a.length;
		
		System.out.println(a[length-1]);
		Arrays.sort(a);
		
	}
}
