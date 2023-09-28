package ProjetoAluguel;

public class Aluguel {
	private long id;
	private String dataFesta;
	private String horarioTermino;
	private String horarioInicial;
	private double valorCobrado;
	public Aluguel(long id, String dataFesta, String horarioTermino, String horarioInicial, double valorCobrado) {
		super();
		this.id = id;
		this.dataFesta = dataFesta;
		this.horarioTermino = horarioTermino;
		this.horarioInicial = horarioInicial;
		this.valorCobrado = valorCobrado;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDataFesta() {
		return dataFesta;
	}
	public void setDataFesta(String dataFesta) {
		this.dataFesta = dataFesta;
	}
	public String getHorarioTermino() {
		return horarioTermino;
	}
	public void setHorarioTermino(String horarioTermino) {
		this.horarioTermino = horarioTermino;
	}
	public String getHorarioInicial() {
		return horarioInicial;
	}
	public void setHorarioInicial(String horarioInicial) {
		this.horarioInicial = horarioInicial;
	}
	public double getValorCobrado() {
		return valorCobrado;
	}
	public void setValorCobrado(double valorCobrado) {
		this.valorCobrado = valorCobrado;
	}
	
	
	

}
