package pacote;
import java.util.*;

class Ex01 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String [] args) {
		int num1, num2;
		System.out.println("Digite um numero: ");
		num1 = sc.nextInt();
		System.out.println("Digite mais um numero: ");
		num2 = sc.nextInt();
		System.out.println("Soma: " + (num1 + num2));
	}
}
