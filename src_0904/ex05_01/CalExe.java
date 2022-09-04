package ex05_01;

public class CalExe extends Calc{
	
	public int Add() {
		return super.a + super.b;
	}
	
	public int Sub() {
		return super.a-super.b;
	}
	public int Mul() {
		return super.a*super.b;
	}
	public int Div() {
		return super.a/super.b;
	}
	@Override
	public void setValue(int a, int b) {
		super.a = a;
		super.b = b;
	}
	
	@Override
	public int calculate(char cal) {
		switch(cal)
		{
			case '+' :
				return Add();
			case '-' :
				return Sub();
			case '*' :
				return Mul();
			case '/' :
				return Div();
			default :
				return 0;
		}

	}

}
