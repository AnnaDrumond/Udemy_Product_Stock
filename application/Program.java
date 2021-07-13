package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler os dados de um produto em estoque (nome, preço e
		 * quantidade no estoque). Em seguida: Mostrar os dados do produto (nome, preço,
		 * quantidade no estoque, valor total no estoque) • Realizar uma entrada no
		 * estoque e mostrar novamente os dados do produto • Realizar uma saída no
		 * estoque e mostrar novamente os dados do produto. Ver Projeto da classe no pdf 03 - Java básico
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		// é necessário instanciar as variáveis, para que cada uma tenha 
		// onde ser armazenado os valores name, price e quantity.
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		// abaixo é como se faz para ler o nome digitado e guardar no atributo "name" do objecto "product"
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println("\nProduct data: " + product);
		
		System.out.print("\nEnter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		// nao confunda esta variavel com o atributo da classe
		// agora preciso que o valor digitado pelo usuario aqui, seja usado como parametro
		// no metodo addProducts da minha classe:
		product.addProducts(quantity);
		// isso fará a atualização da quantidade dentro do objeto product no atributo quantity
		// agora vamos mostrar:
		System.out.println("\nUpdated data:: " + product);
		
		System.out.print("\nEnter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		// isso fará a atualiazação da quantidade dentro do objeto product no atributo quantity
		// agora vamos mostrar:
		System.out.println("\nUpdated data:: " + product);
		
		sc.close();
		
	}

}
