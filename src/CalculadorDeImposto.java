
public class CalculadorDeImposto {
	public double efetuaCalculo(Orcamento orcamento, Imposto imposto){
		return imposto.calcula(orcamento);
	}
}
