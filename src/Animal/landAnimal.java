package Animal;

class Animal{
	void eat() {} //�Դ´�.
	void alive() {} //����ִ�
	void move() {} //�����δ�.
	void crying() {} //�����Ҹ�.
}
public class landAnimal extends Animal{
	String name; //�����̸�
	int lag; //�ٸ���
	boolean tail; //����
	String food;//����/����
	
	
	public landAnimal(String name, int lag, boolean tail, String food){
		this.name = name;
		this.lag = lag;
		this.tail = tail;
		this.food = food;
	}
	
	void poop(){
		
	}//�輳����
	void fight(){
		
	}//���
	public static void print(landAnimal Animal) {
		System.out.printf("�̸� : %s, �ٸ����� : %d, �������� : %b, ���ļ��� : %s", Animal.name, Animal.lag, Animal.tail, Animal.food);
		System.out.println();
	}// ���

}