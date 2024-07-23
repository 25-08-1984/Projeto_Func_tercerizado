package entidade;

public class Tercerizado extends Funcionario {
	private Double cargaadd;
	
	public Tercerizado() {
		super();
	}
	
	public Tercerizado (String nome , Integer hora, Double valor_hora, Double cargaadd) {
		super( nome , hora,  valor_hora);
		this.cargaadd = cargaadd;
	}
	
	public Double getcargaadd() {
		return cargaadd;
	}
	
	public void setcargaadd(Double cargaadd) {
		
		this.cargaadd = cargaadd;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento() + cargaadd * 1.1; 
	}

}
