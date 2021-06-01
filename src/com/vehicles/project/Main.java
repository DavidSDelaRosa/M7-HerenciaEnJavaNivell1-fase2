package com.vehicles.project;

import java.util.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		//Datos coche:
		System.out.println("Introduce la matrícula del coche: ");
		String matricula = sc.nextLine();
		
		System.out.println("Introduce ahora la marca: ");
		String marca = sc.nextLine();
		
		System.out.println("Especifica el color del coche: ");
		String color = sc.nextLine();
		
		Car car1 = new Car(matricula, marca, color);	
		
		//Datos ruedas traseras: 
		System.out.println("De qué marca quieres la rueda trasera?: ");
		String marcaRuedaTrasera = sc.nextLine();
		
		System.out.println("Diámetro de la rueda trasera: ");
		double diametroRuedaTrasera = sc.nextDouble();
		sc.nextLine();
		
		Wheel ruedaTrasera = new Wheel(marcaRuedaTrasera, diametroRuedaTrasera);
				
		//Ruedas delanteras:
		System.out.println("De qué marca quieres la rueda delantera?: ");
		String marcaRuedaDelantera = sc.nextLine();
		
		System.out.println("Diámetro de la rueda delantera: ");
		double diametroRuedaDelantera = sc.nextDouble();
		sc.nextLine();
		
		Wheel ruedaDelantera = new Wheel(marcaRuedaDelantera, diametroRuedaDelantera);

		//Añadir las ruedas:
		List<Wheel> ruedasDelanteras = new ArrayList<>();
		ruedasDelanteras.add(ruedaDelantera);
		ruedasDelanteras.add(ruedaDelantera);
		
		List<Wheel> ruedasTraseras = new ArrayList<>();
		ruedasTraseras.add(ruedaTrasera);
		ruedasTraseras.add(ruedaTrasera);
		
		car1.addWheels(ruedasDelanteras, ruedasTraseras);
		
		
		System.out.println(car1.toString());
		
		sc.close();
	}
}
