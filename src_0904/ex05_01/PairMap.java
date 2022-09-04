package ex05_01;

abstract class PairMap {
	protected String keyArray[];//key ���� �����ϴ� �迭
	protected String valueArray[]; //value ���� �����ϴ� �迭
	abstract String get(String key);//key���� ���� value ����. ������ null ����
	abstract void put(String key, String value); //key�� value�� ������ ����. ������ key�� ������, ���� value�� ����.
	abstract String delete(String key); //key ���� ���� ������(value�� �Բ�) ����. ������ value �� ����
	abstract int length(); //���� ����� �������� ���� ����
}
