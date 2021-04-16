import java.util.Scanner;

public class Resistencia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int nroResis=3;
		double result = 0;
		while(i<=nroResis) {
			System.out.printf("Ingrese Resistencia %d: ", i);
			double r = sc.nextInt();
			result=result+(1/r);
			i++;
		}
		System.out.printf("La resistencia total es de %f", 1/result);
	}
}
