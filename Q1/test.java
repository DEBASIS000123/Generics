package Q1;
class MyGeneric <T1>{
	int val;
	T1 t1;
	public MyGeneric(int val,T1 t1) {
		this.val=val;
		this.t1=t1;
	}
	public int getval() {
		return val;
	}
	public T1 gett1() {
		return t1;
	}
	public void setval(int val) {
		this.val=val;
	}
	public void sett1(T1 t1) {
		this.t1=t1;
	}
}
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyGeneric <String> mg=new MyGeneric (10,"hello");
		int i=mg.getval();
		String str=mg.gett1();
		System.out.println(i+" "+str);
		mg.setval(99);
		mg.sett1("hii");
		int i2=mg.getval();
		String str2=mg.gett1();
		System.out.println(i2+" "+str2);
	}

}
