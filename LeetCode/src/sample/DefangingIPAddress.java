//1108 Defanging an IP Address

package sample;
public class DefangingIPAddress {
	public String defangIPaddr(String address) {
	        String str="";//string is empty intially after store the defanging ip address
	        for(int i=0;i<address.length();i++){
	            if(address.charAt(i)=='.'){
	                     str=str+"[.]";
	            }else{
	                str=str+address.charAt(i);
	            }
	        }
	        return str;
	    }
	

    public static void main(String[] args) {
        DefangingIPAddress defanger = new DefangingIPAddress();
        String address = ".1.1.1";
        String defangedAddress = defanger.defangIPaddr(address);
        System.out.println(defangedAddress);
    }
}
