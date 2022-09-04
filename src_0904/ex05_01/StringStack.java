package ex05_01;


public class StringStack implements Stack{
	private int index;
	private int size;
	public String[] StackArray;
	private String popStr;
	public StringStack(int size) {
		this.size = size;
		StackArray = new String [size];
		this.index =-1;
	}
	@Override
	public int length() {
		return this.index+1;
	}

	@Override
	public int capacity() {
		return StackArray.length;
	}

	@Override
	public String pop() {
		if(index == -1)
			return "�޸� ��ȯ�� �� �Ǿ����Ƿ�, pop�Ұ�";
		else {
			this.popStr = StackArray[index];
			index--;
			return popStr;
		}
	}

	@Override
	public boolean push(String val) {
		if(index+1 < size) {
			index++;
			StackArray[index] = val;
			return true;
		}
		return false;
	}
	
}
