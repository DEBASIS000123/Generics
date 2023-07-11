package Q3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a=10,b=99,c=88;
		String d="aa",e="cc",f="bb";
		findmax(a,b,c);
		findmax(d,e,f);
	}
	public static <T extends Comparable<T>>void findmax(T a,T b,T c){
		T max=a;
		if(b.compareTo(max)>0) {
			max=b;
		}
		if(c.compareTo(max)>0) {
			max=c;
		}
		System.out.println("Maximum is "+max);
			
	}
}
