
public class TesteVariáveis {

	public static void main(String[] args) {

		final int CONSTANTE = 1;

		int variavelEspaco = 10;
		long l = 1000000000000000000L;

		int k = 10;

		int b = ++k;

		int j = --k;

		long d = 100000000000000000L; int p; p = (int)d;

		int t = 3;
		double o = 10 - 5 * 2 + --t; // 10 - 10 + 2

		System.out.println(p);
		System.out.println(l);
		System.out.println(t);
		System.out.println("J: " + j);
		System.out.println(o);
		
		if ((10 + 15) < 20)
		    System.out.println("Verdade");
		else
		    System.out.println("Mentira");

	}

}