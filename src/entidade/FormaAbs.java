package entidade;

import entidade.enums.Cor;

public abstract class FormaAbs implements Forma{
	
	private Cor cor;
	
	

	public FormaAbs(Cor cor) {
		super();
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}
	
	

}
