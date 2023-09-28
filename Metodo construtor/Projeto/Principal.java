package Projeto;

import ProjetoAluguel.Aluguel;
import ProjetoCliente.Cliente;
import ProjetoEndereco.Endereco;
import ProjetoItemTema.ItemTema;
import ProjetoTema.Tema;

public class Principal {

	public static void main(String[] args) {
		Tema tema1 = new Tema( 1,"Pedro", 800, "Azul");
		ItemTema itemTema1= new ItemTema(2,"Victor", "alto");
		Endereco endereco1 = new Endereco(3,"Rua Antonio Cardoso", 214, "Casa", "atenas do sul", "Itapetininga","18208410","Sao Paulo");
		Cliente cliente1 = new Cliente(4,"Fael", "997212905", "865654856", "48451213");
		Aluguel aluguel1 = new Aluguel(5,"02/05/2023","18:00", "22:00",500.00);
		
		System.out.println(tema1.getId());
		System.out.println(tema1.getNome());
		System.out.println(tema1.getValorAluguel());
		System.out.println(tema1.getCorToalha());
		
		System.out.println("-------------------------------------------------");
		System.out.println(itemTema1.getId());
		System.out.println(itemTema1.getNome());
		System.out.println(itemTema1.getDescricao());
		
		System.out.println("-------------------------------------------------");
		System.out.println(endereco1.getId());
		System.out.println(endereco1.getLogradouro());
		System.out.println(endereco1.getCep());
		System.out.println(endereco1.getCidade());
		System.out.println(endereco1.getNumero());
		
		System.out.println("-------------------------------------------------");
		System.out.println(cliente1.getId());
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getTelefone());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getRg());
		
		System.out.println("-------------------------------------------------");
		System.out.println(aluguel1.getId());
		System.out.println(aluguel1.getDataFesta());
		System.out.println(aluguel1.getHorarioInicial());
		System.out.println(aluguel1.getHorarioTermino());
		System.out.println(aluguel1.getValorCobrado());
		
		
		
	}

}
