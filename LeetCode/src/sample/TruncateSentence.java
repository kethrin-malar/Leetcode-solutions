// 1816 Truncate Sentence


package sample;

public class TruncateSentence {
	public String truncate(String s, int k) {
		String[] arr = s.split(" ");
		String res = "";
		for(int i=0;i<k;i++) {
			res=res+arr[i]+" ";
		}
				
		return res.trim();	//removes all the leading and trailing spaces in the string. 	

	}

	public static void main(String[] args) {
		
		String s = "Hello how are you Contestant";
        int k = 4;
        TruncateSentence obj = new TruncateSentence();
        String truncatedSentence = obj.truncate(s, k);
        System.out.println("Truncated Sentence: " + truncatedSentence);
    }
}	
