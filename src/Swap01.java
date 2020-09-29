
public class Swap01 {

	public static void main(String[] args) {

		int a =5;
		int b =3;
		System.out.println( "a="+a+" "+"b= "+b);
		a =a+b;
		b =a-b;
		a = a-b;

		System.out.println( "a="+a+" "+"b= "+b);
		System.out.println("==============================");
		String a1 ="apple"; 
		String b1 ="banana";
		System.out.println( "a="+a1+" "+"b= "+b1);

		a1= a1+b1;
		b1= a1.substring(0,a1.length()- b1.length());
		a1= a1.substring(b1.length());

		System.out.println( "a="+a1+" "+"b= "+b1);

	}

}
