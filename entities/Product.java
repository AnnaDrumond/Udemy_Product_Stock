package entities;
//porque o produto é uma entidade do meu negócio

public class Product {
	// a classe se chama Product pois é o nome determinado pelo Projeto da classe no
	// Pdf

	public String name;
	// nota: lembre que os nomes de atributos e métodos usam o Camel Case
	public double price;
	// o "public" indica que o atributo/metodo pode ser usado em outros arquivos
	public int quantity;

	// Agora que os atributos já foram criados acima, vamos criar os métodos abaixo:
	// "double", pois o método irá retornar um valor do tipo double.
	// o "public" indica que o atributo/metodo pode ser usado em outros arquivos
	public double totalValueInStock() {
		return price * quantity;
	}
	
	// "void" porque não vai retornar nenhuma informação
	// este "quantity () é o parâmetro, que não deve ser confundido com o "quantity"
	// do inicio do programa, que é um atributo, são coisas distintas, apenas é boa
	// prática usar o mesmo nome este "quantity" que vem como argumento, é o que o usuário vai digitar como
	// sendo a qtde de acrescimo no stock
	public void addProducts(int quantity) {
		this.quantity += quantity;
		} // para referenciar/garantir que o programa vai se referir ao atributo e não ao
		// argumento, usamos este "this." palavra reservada que significa auto referencia para o
		// objeto abaixo no this.quantity, estou sendo explicito que quero acessar o atributo
		// da classe.
	

	// este "quantity" que vem como argumento, é o que o usuário vai digitar como
	// sendo a qtde de decrescimo no stock
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	// • toString - converte o objeto (aqui product) para string
	// Aqui eu estaria dissendo que eu quero que o meu objecto produto, na forma de
	// string retorne "TV, $ 900.00, 10 units, Total: $ 9000.00"
	public String toString(){
		return name
				+ ", $ " 
				+ String.format("%.2f", price) // coloco esta mascara, para formatar que tenha duas casas
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f",totalValueInStock());
	}

}
