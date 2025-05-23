package package1;

import java.util.HashMap;

public class StringAcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I LOVE INDIA AND WELCOME TO INDIA";
		
		String[] s = str.split("\\s");
		
	// 	System.out.println(s);
		
		for(int i=0; i<s.length; i++) {
			int count = 0;
			for(int j=0; j<s.length; j++) {
				if(s[i].equalsIgnoreCase(s[j])) {
					count++;
				}
				
			}
			System.out.println(s[i] + ":" + count);
		}
		

	}

}
