package first;

public class stack{
	public void  modifyArray(int[] array){
		for(int i=0;i<array.length;i++){
			array[i]=i*array[i];
		}
	}
	public void printArray(int[] array){
		for(int i:array){
			System.out.println("value of array="+i);
		}
	}
}
