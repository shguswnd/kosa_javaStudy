package ex05_01;

public class Won2Dollar extends Converter{
	private double res;
	public Won2Dollar(double res) {
		this.res = res;
	}
	@Override
	protected double convert(double src) {
		return src/res;
	}
	
	@Override
	protected String getSrcString() {
		return "��";
	}
	@Override
	protected String getDestString() {
		return "�޷�";
	}
	
}
