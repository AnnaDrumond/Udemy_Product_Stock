package entities;
//porque o produto � uma entidade do meu neg�cio

public class Product {
	// a classe se chama Product pois � o nome determinado pelo Projeto da classe no
	// Pdf

	public String name;
	// nota: lembre que os nomes de atributos e m�todos usam o Camel Case
	public double price;
	// o "public" indica que o atributo/metodo pode ser usado em outros arquivos
	public int quantity;

	// Agora que os atributos j� foram criados acima, vamos criar os m�todos abaixo:
	// "double", pois o m�todo ir� retornar um valor do tipo double.
	// o "public" indica que o atributo/metodo pode ser usado em outros arquivos
	public double totalValueInStock() {
		return price * quantity;
	}
	
	// "void" porque n�o vai retornar nenhuma informa��o
	// este "quantity () � o par�metro, que n�o deve ser confundido com o "quantity"
	// do inicio do programa, que � um atributo, s�o coisas distintas, apenas � boa
	// pr�tica usar o mesmo nome este "quantity" que vem como argumento, � o que o usu�rio vai digitar como
	// sendo a qtde de acrescimo no stock
	public void addProducts(int quantity) {
		this.quantity += quantity;
		} // para referenciar/garantir que o programa vai se referir ao atributo e n�o ao
		// argumento, usamos este "this." palavra reservada que significa auto referencia para o
		// objeto abaixo no this.quantity, estou sendo explicito que quero acessar o atributo
		// da classe.
	

	// este "quantity" que vem como argumento, � o que o usu�rio vai digitar como
	// sendo a qtde de decrescimo no stock
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	// � toString - converte o objeto (aqui product) para string
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
