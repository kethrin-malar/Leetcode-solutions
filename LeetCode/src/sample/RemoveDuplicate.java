//26 Remove Duplicates from Sorted Array

package sample;

public class RemoveDuplicate {
	public int removeDuplicates(int[] arr) {

		int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicate obj = new RemoveDuplicate();
		int[] arr = { 1, 1, 2, 2, 3, 4, 5, 6 };
		int result = obj.removeDuplicates(arr);

		System.out.println("Remove Duplicates From sorted Array :" + result);

	}

}
