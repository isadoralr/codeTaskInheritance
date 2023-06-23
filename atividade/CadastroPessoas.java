package atividade;
import java.util.ArrayList;
public class CadastroPessoas {
	
	static ArrayList<String> listapessoas = new ArrayList<>();
	public static void cadastrapessoa(String pess) {
		listapessoas.add(pess);
	}
	
	public static void imprimecadastro() {
		listapessoas.forEach(listapessoas ->{
		System.out.println(listapessoas);
		});
		}
		
	
}
