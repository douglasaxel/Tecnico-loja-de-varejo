
public class Main {

	public static void main(String[] args) {
		Transportadora transportadora = new Transportadora();
	    Estoque estoque = new Estoque();
	    Produto produto = new Produto();
	    Vendedores vendedor = new Vendedores();
	    Clientes clientes = new Clientes();
	    Venda venda = new Venda();
	    Fornecedores fornecedores = new Fornecedores();

	    
	    produto.id = 1;
	    produto.name = "bayblayd";
	    produto.quantidade = 379524;
	    produto.valor = 15;
	    
	    estoque.id = 1;
	    estoque.name = "Estoque A";
	    estoque.produto = produto;
	    
	    vendedor.cpf = "02894";
	    vendedor.id = 1;
	    vendedor.name = "Teobaldo";
	    
	    clientes.cpf = "02894";
	    clientes.id = 1;
	    clientes.name = "Rodolfo";
	    
	    venda.id = 1;
	    venda.vendedores = vendedor;
	    venda.clientes = clientes;
	    venda.produto = produto;
	    
	    fornecedores.id = 1;
	    fornecedores.cnpj = "0237894";
	    fornecedores.name = "Cleber";
	    fornecedores.produto = produto;
	    
	    transportadora.name = "Transportadora xyz";
	    transportadora.estoque = estoque;
	    transportadora.vendedores = vendedor;
	    transportadora.fornecedores = fornecedores;
	    transportadora.venda = venda;
	    transportadora.cnpj = "97821346";
	    
	    System.out.printf("Transportadora: %s (%s)\n", transportadora.name, transportadora.cnpj);
	    System.out.printf("Fornecedor da transportadora: %s (%s)\n", transportadora.fornecedores.name, transportadora.fornecedores.cnpj);
	    System.out.printf("Produto do fornecedor: %s\n\n", fornecedores.produto.name);
	    System.out.printf("O vendedor %s vendeu para o cliente %s o produto %s", vendedor.name, clientes.name, produto.name);
	    
	    
	}

}
