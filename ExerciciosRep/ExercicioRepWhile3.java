package Turma15;

import java.util.Scanner;

public class ExercicioRepWhile3 {

	public static void main(String[] args) {
		int idade = 0, n=0,v=0;
		
		
		while (idade !=-99) {
			Scanner ler = new Scanner (System.in);
			System.out.println("Por favor, digite sua idade: ");
		    idade = ler.nextInt();	
		}
			if(idade<=21)
			{
			    n++;
			}
			if (idade>=50)
			{
				v++;
			}
			System.out.println("Total de pessoas menores de 21 anos: "+n);
			System.out.println("Total de pessoas maiores de 50 anos: "+v);
			
				
				}
			}
	
	
		
	
