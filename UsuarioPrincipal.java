package formativaFpoo;

public class UsuarioPrincipal {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario(1, "Jão", 123, "autorizado", "jotape");
		System.out.println(usuario.getId());
		System.out.println(usuario.getNome());
		System.out.println(usuario.getPassword());
		System.out.println(usuario.getPermissao());
		System.out.println(usuario.getUsuario());
		
		System.out.println("-------------");
		
		Usuario usuario2 = new Usuario(2, "Gui", 123, "negado", "guicelestino");
		System.out.println(usuario2.getId());
		System.out.println(usuario2.getNome());
		System.out.println(usuario2.getPassword());
		System.out.println(usuario2.getPermissao());
		System.out.println(usuario2.getUsuario());	
	}
}
