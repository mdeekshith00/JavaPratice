package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>>  arr = new ArrayList<>();
       arr.add((ArrayList<Integer>) Arrays.asList(1,2,3));
       arr.add((ArrayList<Integer>) Arrays.asList(3,4));
       arr.add((ArrayList<Integer>) Arrays.asList(1,4,5));
       
       System.out.println(minimumVerticalSum( arr));
	}
	public static int minimumVerticalSum(ArrayList<ArrayList<Integer>> arr) {
		int  n = arr.size();
		int ans = Integer.MAX_VALUE;
		
		for(int i=0; i<1001; i++) {
			int sum = 0;
			
			for(int j=0; j<n; j++) {
				if(arr.get(j).size() > i) {
					sum = sum + arr.get(i).get(j);
				}
			}
			if(sum > 0) {
				ans = Math.min(ans, sum);
			}
		}
		return ans;
	}
}
