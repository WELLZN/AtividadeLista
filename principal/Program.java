package principal;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collections;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		ArrayList <String> pessoa = new ArrayList <>() ;
		
		System.out.println("Escreva o nome da primeira pessoa");
		String pessoa1 = sc.next();
		
		System.out.println("Escreva o nome da Segunda pessoa");
			String pessoa2 = sc.next();
		
		System.out.println("Escreva o nome da Terceira pessoa");
			String pessoa3 = sc.next();
		
		System.out.println("Escreva o nome da Quarta pessoa");
			String pessoa4 = sc.next();
			
		System.out.println("Escreva o nome da Quinta pessoa");
			String pessoa5 = sc.next();
			sc.close();
	
	pessoa.add(pessoa1);
	pessoa.add(pessoa2);
	pessoa.add(pessoa3);
	pessoa.add(pessoa4);
	pessoa.add(pessoa5);
	
	//System.out.println(pessoa);
	
	
	Collections.sort(pessoa , String.CASE_INSENSITIVE_ORDER);
	System.out.println(pessoa);
	
	
}}
