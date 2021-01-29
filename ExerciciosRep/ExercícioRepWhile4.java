package Turma15;

import java.util.Scanner;

public class ExercícioRepWhile4 {

	public static void main(String[] args) {
	int idade,sexo,fp,numpessoas=1,numpc=0,nummn=0,numha=0,numoc=0,numpn40=0,numpc18=0;

	while (numpessoas<=5) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Entre com sua idade:");
		idade = ler.nextInt();
		System.out.println("Entre com seu sexo:");
		System.out.println("\n1-Feminino");
		System.out.println("\n2-Masculino");
		System.out.println("\n3-Outros");
		sexo = ler.nextInt();
		System.out.println("Entre com seu fator psicológico:");
		System.out.println("\n1-Pessoa Calma");
		System.out.println("\n2-Pessoa Nervosa");
		System.out.println("\n3-Pessoa Agressiva");
		fp = ler.nextInt();
		
		if (fp==1) 
		{
			numpc++;
		}
		if (sexo==1 && fp==2)
		{
		    nummn++;	
		}
		if (sexo==2 && fp==3)
		{
			numha++;
		}
		if (sexo==3 && fp==1)
		{
			numoc++;
		}
		if (fp==2 && idade>40)
		{
			numpn40++;
		}
		if (fp==1 && idade<18)
		{
			numpc18++;
		}
		System.out.println("Número de pessoas calmas: " +numpc);
		System.out.println("Número de mulheres nervosas: " +nummn);
		System.out.println("Número de homens agressivos: " +numha);
		System.out.println("Número de outros calmos: " +numoc);
		System.out.println("Número de pessoas nervosas com mais de 40 anos: " +numpn40);
		System.out.println("Número de pessoas calmas com menos de 18 anos: " +numpc18);
		
	}
	}

}
