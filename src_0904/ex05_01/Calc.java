package ex05_01;

abstract class Calc {
	int a;
	int b;
	abstract void setValue(int a, int b);
	abstract int calculate(char cal);
}