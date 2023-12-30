//1221  Split a String in Balanced Strings


package sample;

public class StringisBalanced {
	public int balancedStringSplit(String s) {
		int L=0,R=0,count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='L') {
				L++;
			}
			else {
				R++;
			}
			if(R==L) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "RLRRLLRLRR";
		StringisBalanced split = new StringisBalanced();
		int result = split.balancedStringSplit(s);
		System.out.println("balancedStringSplit: " + result);
		
		
	}

}
