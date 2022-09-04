package ex05_01;
import java.util.Scanner;

class Circle extends Shape{

	@Override
	public void draw() {
		System.out.println("Circle");
	}
	
}

class Line extends Shape{
	@Override
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape{
	@Override
	public void draw() {
		System.out.println("Rect");		
	}	
}

public class GraphicEditor extends Shape{
	private Shape head, tail;
	
	Scanner scan = new Scanner(System.in);
	
	public GraphicEditor() {
		head = null;
		tail = null;
	}
	
	public void run() {
		System.out.println("�׷��� ������ beauty�� �����մϴ�.");
		while(true) {
			System.out.println("����(1), ����(2), ��κ���(3), ����(4)>>");
			int operation = scan.nextInt();
			switch(operation) {
				case 1 :
					System.out.println("Line(1), Rect(2), Circle(3)>>");
				operation = scan.nextInt();
				insert(operation);
				break;
				case 2 : 
					System.out.println("������ ������ ��ġ>>");
					operation = scan.nextInt();
				delete(operation);	
				break;
				case 3 :
					print();
					break;
				case 4 :
					System.out.println("���α׷��� �����մϴ�.");
					scan.close();
					return;
			}
			
		}	
	}
	void insert(int operation) {
		switch(operation) {
			case 1 :
				setNext(new Line());				
			break;
			case 2 : 
				setNext(new Rect());
			break;
			case 3 :
				setNext(new Circle());
			break;
			default : 
				System.out.println("�߸��Է� �Ǿ���.");
				return;
		}
		if(head == null) { //head�� �ƹ��� ����Ű�� ������,
			head = getNext();
			tail = getNext();
		}
		else { // ������ ������.
			tail.setNext(getNext());
			tail = getNext();
		}
		
	}
	
	public void delete(int num) {
		Shape pre = head; //�������
		Shape tmp = head;
		int cnt = 1;
		if(head==null) { //��尡 ������....
			System.out.println("������ �� �����ϴ�.");
			return;
		}
		if(num == cnt)// ù���� ��� �Ǵ�
		{
			if (head.getNext() == null) { //��尡 �Ѱ��ϋ�
				head = head.getNext();
				tail = head;
			}
			else { //��尡 �Ѱ��� �ƴҋ� �׳� �̾����.
				head= head.getNext();
			}
			return;
		}
		
		while(pre.getNext() != null) {

			cnt++;
			tmp = pre;
			pre = pre.getNext();
			if(cnt==num)
			{
				tmp.setNext(pre.getNext());
				return;
			}
		}
		if(cnt<num)
			System.out.println("�����Ҽ� �����ϴ�");


			
		
		
	}
	public void print() {
		Shape s = head;
		while(s != null) {
			s.draw();
			s = s.getNext();
		}
	}
	@Override
	public void draw() {
		
	}

}
