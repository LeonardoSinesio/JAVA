package aulasGil;

public class Aula2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Cadeira c1= new Cadeira();
		c1.serrar();
		c1.lixar();
		c1.setCor("Vermelh");
		c1.pintar();
		//c1.cor = "Azul";
		System.out.println("A cor atual é "+c1.getCor());
		
		Cadeira c2= new Cadeira();
		c2.pintar();*/
		
		Aluno a1 = new Aluno("Leonardo");
		a1.setTelefone("11111111111");
		a1.setMatricula("000001");
		
		Aluno a2 = new Aluno("Patricia");
		a2.setTelefone("22222222222");
		a2.setMatricula("0000002");
		
		//ImprimeDados(a1);
		a1.ImprimeDados();
		System.out.println("\n");
		a2.ImprimeDados();
		
		double media = Aluno.Media(10, 20);
		System.out.println("Média: "+ media);
		
		//ImprimeDados(a2);
		
		

	}
	/*
	public static void ImprimeDados(Aluno A) {
		System.out.println("Nome: "+A.getNome());
		System.out.println("Telefone: "+A.getTelefone());
		System.out.println("Matricula: "+A.getMatricula());
	}*/

}
