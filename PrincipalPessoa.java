package formativaFpoo;

public class PrincipalPessoa {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Julia");
		System.out.println(pessoa.getNome());
		
		System.out.println("-----------");
		
		Fisica fisica = new Fisica("José","55-751-255-55","533-355-798/52");
		System.out.println(fisica.getNome());
		System.out.println(fisica.getRg());
		System.out.println(fisica.getCpf());

	}

}
