package entidade;

public class Funcionario {
	private String nome;
	private Integer hora;
	private Double valor_hora;

	public Funcionario() {
		
	}
	
	public Funcionario(String nome , Integer hora, Double valor_hora) {
		this.nome = nome;
		this.hora=hora;
		this.valor_hora = valor_hora;
	}
	
	public String getnome() {
		return nome;
	}
	
	public Integer gethora() {
		return hora;
	}
	
	public Double getvalor_hora() {
		return valor_hora;
		
	}
	
	public void setnome(String nome) {
		this.nome =nome;
	}
	
	public void sethora(Integer hora) {
		this.hora = hora;
	}
	
	public void setsalario(Double valor_hora) {
		this.valor_hora = valor_hora;
	}
	
	public double pagamento() {
		return valor_hora * hora;
	}
	
	
}
