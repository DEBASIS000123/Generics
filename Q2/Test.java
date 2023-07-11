package Q2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[]= {1,2,3,4,5};
		Double arr2[]= {10.8,49.3,53.2,33.1,22.1};
		String arr3[]= {"aaa","bbb","ccc"};
		print(arr);
		print(arr2);
		print(arr3);
	}
	public static <T>void print(T arr[]){
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			System.out.println();
		}
	}

}
