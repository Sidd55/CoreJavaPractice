package General;

import java.util.Arrays;
import java.util.Collections;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "siddharth";
		
		String s2 = "siddharth";
		
		System.out.println(s1==s2);
		
		String s3 = new String("siddharth");
		String s4 = new String("siddharth");
		
		char arr[] = s3.toCharArray();
		
		Arrays.sort(arr);
		
		System.out.println(arr);
		
		System.out.println(s3);
		
		//System.out.println(s3.intern()==s4.intern());
		
		//System.out.println(s2==s3);
	}

}
