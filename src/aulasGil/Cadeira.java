package aulasGil;

public class Cadeira {
	private double altura;
	private float altura_assento;
	private String cor ;
	
	public Cadeira() {
		cor =  "marrom";
		altura = 0.50;
		altura_assento = 1.20f;
	}
	
	void serrar() {
		System.out.println("Serrando");
	}
	
	public void lixar() {
		System.out.println("Lixando");
	}
	public void pintar() {
		System.out.println("Pintando");
	}
	
	String getCor(){
		return cor;
	}
	
	public void setCor(String c) {
		if(c.equals("Verde") || c.equals("Vermelho"))
			cor = c;
		else
			System.out.println("Não há tintas nessa cor");
		
	}

}
