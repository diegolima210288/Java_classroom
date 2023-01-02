package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
/*-------------------------
 * aplica��o para receber, em um vetor, a altura de N pessoas
 * e retornar a m�dia das alturas.
 --------------------------------*/

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double sum = 0.0;
		double avg = 0.0;
		
		//quantida de pessoas
		int n = sc.nextInt();

		double vect[] = new double[n];
		
		for (int i=0; i<n; i++) {
			//valor das alturas (vect recebe o valor na posi��o apontada pela variavel I)
			vect[i] = sc.nextDouble();
		}
		
		for (int i=0; i<n; i++) {
			//soma dos valores de altura (sum recebe o valores do vetor nas posi��es da variavel I)
			sum += vect[i];
		}
		
		//valores somados s�o dividos pela quantidade de pessoas escolhidas
		avg = sum/n;
		
		//apresenta��o do valor da m�dia com restri��o de duas casas decimais
		System.out.printf("AVERAGE HEIGHT = %.2f",avg);
		
		sc.close();

	}

}
