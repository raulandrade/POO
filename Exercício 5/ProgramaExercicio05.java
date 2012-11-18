public class ProgramaExercicio05 {

	public static void main(String[] args){
		Agenda agenda = new Agenda();
		
		agenda.adicionarContato("José", "8888-0000");
		
		try {
			agenda.pesquisaContato("José");
			System.out.println("Contato encontrado!");
		} catch (ContatoInexistenteException e) {
			System.err.println(e.getMessage());
		}
		

		try {
			agenda.pesquisaContato("Maria");
			System.out.println("Contato encontrado!");
		} catch (ContatoInexistenteException e) {
			System.err.println(e.getMessage());
		}
		
	}
}