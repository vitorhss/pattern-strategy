
public class TesteCalculaImposto {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(100.00);
		CalculadorDeImposto calculador = new CalculadorDeImposto();
		
		System.out.println("ICMS " + calculador.efetuaCalculo(orcamento, new ICMS()));
		System.out.println("ISS  " + calculador.efetuaCalculo(orcamento, new ISS()));
	}

}
