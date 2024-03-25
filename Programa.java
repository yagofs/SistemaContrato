package SistemaContrato;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Programa {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
		
		 Projeto p1 = new Projeto("Construção da loja XYZ", df.parse("01/01/2020"), df.parse("31/12/2021"));
	     Funcionario f1 = new Funcionario("Dory", TipoDeDocumento.CPF, "999.999.999-00");
	     Funcionario f2 = new Funcionario("Carline", TipoDeDocumento.CPF, "111.111.111-00");
	     Contratacao c1 = new Contratacao(df.parse("01/01/2020"), Cargo.DIRETOR, f1, p1);
	     Contratacao c2 = new Contratacao(df.parse("11/10/2020"), Cargo.ADMINISTRATIVO, f2, p1);
		
		p1.listarContratacoes();
		
		c1.contratar();
		p1.listarContratacoes();
		
		c1.demitir();
		c2.contratar();
		p1.listarContratacoes();
	}
}
