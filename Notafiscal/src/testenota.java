import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

public class testenota {

	public static void main(String[]args) {
		
		Emissor ems = new Emissor("CafeCWB", "23.300.012.0001");
		Cliente cli = new Cliente("Jeferson", "122.234.596.55");
		
		Produto pro01 = new Produto("0000233", "Colher", "Aço inox/23cm/Sopa", 6, new BigDecimal(18.90));
		
		ArrayList<Produto> listPro = new ArrayList<Produto>();
		listPro.add(pro01);
		
		NotaFiscal NF= new NotaFiscal("23445", new Date(), "chave", ems, cli, listPro);
	}
	
}
