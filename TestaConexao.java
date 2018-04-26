
public class TestaConexao {

	public static void main(String[] args)  {

		Conexao con = new Conexao();
		try {
		con.fecha(); 
		} catch(ArithmeticException | ConexaoException ex) {
			
		};
	
	}

}
