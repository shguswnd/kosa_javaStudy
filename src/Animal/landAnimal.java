package Animal;

class Animal{
	void eat() {} //먹는다.
	void alive() {} //살아있다
	void move() {} //움직인다.
	void crying() {} //울음소리.
}
public class landAnimal extends Animal{
	String name; //동물이름
	int lag; //다리수
	boolean tail; //꼬리
	String food;//음식/먹이
	
	
	public landAnimal(String name, int lag, boolean tail, String food){
		this.name = name;
		this.lag = lag;
		this.tail = tail;
		this.food = food;
	}
	
	void poop(){
		
	}//배설행위
	void fight(){
		
	}//사냥
	public static void print(landAnimal Animal) {
		System.out.printf("이름 : %s, 다리개수 : %d, 꼬리여부 : %b, 음식성향 : %s", Animal.name, Animal.lag, Animal.tail, Animal.food);
		System.out.println();
	}// 출력

}