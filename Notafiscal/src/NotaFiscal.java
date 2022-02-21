import java.util.ArrayList;
import java.util.Date;

public class NotaFiscal {

	private String numero;
	private Date dataEmissao;
	private String chave;
	private Emissor emissor;
	private Cliente cliente;
	
	private ArrayList<Produto> produtos= new ArrayList<>();

	public NotaFiscal(String numero, Date dataEmissao, String chave, Emissor emissor, Cliente cliente,
			ArrayList<Produto> produtos) {
		this.numero = numero;
		this.dataEmissao = dataEmissao;
		this.chave = chave;
		this.emissor = emissor;
		this.cliente = cliente;
		this.produtos = produtos;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public Emissor getEmissor() {
		return emissor;
	}

	public void setEmissor(Emissor emissor) {
		this.emissor = emissor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	@Override
	public String toString() {
		StringBuilder strB = new StringBuilder();
		strB.append("Numero:"+ getNumero()+"\n");
		strB.append("Data:"+ getDataEmissao()+"\n");
		strB.append("Chave:"+ getChave()+"\n");
		strB.append("Emissor:"+ getEmissor().getNome()+"\n");
		strB.append("Cliente:"+ getCliente().getDocumento()+"\n");
		strB.append("Produto:"+ getProdutos()+"\n");
		return strB .toString();
	}
	
	
	
}
