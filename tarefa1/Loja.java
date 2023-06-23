package tarefa1;

public class Loja {

	public static void main(String[] args) {
		String[] produto = new String[5];
		Livros livro1 = new Livros("Harry Potter 1", 30.40, "JK Rowling");
		Livros livro2 = new Livros("Harry Potter 2", 38.70, "JK Rowling");
		Livros livro3 = new Livros("Harry Potter 3", 34.30, "JK Rowling");
		produto[0] = livro1.toString();
		produto[1] = livro2.toString();
		produto[2] = livro3.toString();
		Cds cd = new Cds("Chitãozinho e Xororó", 24.99, 15);
		produto[3] = cd.toString();
		Dvds dvd = new Dvds("A Era do Gelo", 20.00, 145);
		produto[4] = dvd.toString();
		for (int cont=0; cont<= 4; cont++){
			System.out.println(produto[cont]);
		}
		
	}

}
