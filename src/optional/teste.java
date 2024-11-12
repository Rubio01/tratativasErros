package optional;

import java.util.Optional;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente = new Cliente("RUB");
		
		Optional<Cliente> clienteOptional = Optional.ofNullable(cliente);
		
		String nome = clienteOptional.map(resposta-> resposta.getNome()).orElse("Cliente não encontrado!");
		
		System.out.println(nome);
		
		
		
	}

}
