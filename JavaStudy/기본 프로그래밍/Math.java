
public class Math {

	public static int sum(int n,int m) {
		return n + m;}
		
	public static int sub(int n, int m) {
		return n - m;}
	
	public static int mult(int n, int m) {
		return n * m;}
	
	public static int div(int n, int m) {
		return n / m;}
	
	public static void main(String[] args) {
		int n = 10;
		int m = 20;
		int a;
		int b;
		int c;
		int d;
		
		a = sum(n, m);
		b = sub(n, m);
		c= mult(n, m);
		d = div(n, m);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
