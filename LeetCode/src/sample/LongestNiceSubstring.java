package sample;

public class LongestNiceSubstring {
	
	
		public static void main(String[] args) {
			//String n1="0123456789";
			String s1 = "AaBb";//true
			String s2 = "sTts";//false
			String s3 = "AbbaTT";//false

			System.out.println(isNice(s1));
			System.out.println(isNice(s2));
			System.out.println(isNice(s3));
		}

		public static boolean isNice(String s) {
			boolean hasUpperCase = false;
			boolean hasLowerCase = false;
			int i=0;
			char CaseConvert;//A->a
		
				while((i<s.length())&&(!hasUpperCase)) {
					hasLowerCase = false;
					if(Character.isLowerCase(s.charAt(i))) {
						CaseConvert=Character.toUpperCase(s.charAt(i));
					}else {
						CaseConvert=Character.toLowerCase(s.charAt(i));
					}
					int j=0;
					while((j<s.length())&&(!hasLowerCase)) {
						if(CaseConvert==(s.charAt(j))){
							hasLowerCase=true;
						}
						j++;
					}
					i++;
					if(!hasLowerCase) {
						return hasLowerCase;
					}	
				}
				return hasLowerCase;
			}
		}
