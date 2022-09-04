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
		System.out.println("그래픽 에디터 beauty을 실행합니다.");
		while(true) {
			System.out.println("삽입(1), 삭제(2), 모두보기(3), 종료(4)>>");
			int operation = scan.nextInt();
			switch(operation) {
				case 1 :
					System.out.println("Line(1), Rect(2), Circle(3)>>");
				operation = scan.nextInt();
				insert(operation);
				break;
				case 2 : 
					System.out.println("삭제할 도형의 위치>>");
					operation = scan.nextInt();
				delete(operation);	
				break;
				case 3 :
					print();
					break;
				case 4 :
					System.out.println("프로그램을 종료합니다.");
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
				System.out.println("잘못입력 되었다.");
				return;
		}
		if(head == null) { //head가 아무도 가리키지 않으면,
			head = getNext();
			tail = getNext();
		}
		else { // 꼬리를 붙힌다.
			tail.setNext(getNext());
			tail = getNext();
		}
		
	}
	
	public void delete(int num) {
		Shape pre = head; //이전노드
		Shape tmp = head;
		int cnt = 1;
		if(head==null) { //노드가 없을떄....
			System.out.println("삭제할 수 없습니다.");
			return;
		}
		if(num == cnt)// 첫번재 노드 판단
		{
			if (head.getNext() == null) { //노드가 한개일떄
				head = head.getNext();
				tail = head;
			}
			else { //노드가 한개가 아닐떄 그냥 이어붙힘.
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
			System.out.println("삭제할수 없습니다");


			
		
		
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
