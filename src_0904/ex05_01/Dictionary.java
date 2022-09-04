package ex05_01;

public class Dictionary extends PairMap{
	private int index;
	private String returnValue;
	
	public Dictionary(int array) {
		keyArray = new String[array];
		valueArray = new String[array];
	}
	
	@Override
	public String get(String key) {
		
		for(int i=0 ; i<length() ; i++) {
			if(key.equals(keyArray[i]))
			{
				returnValue = valueArray[i];
				return returnValue;
			}
		}
		return null;
	}

	@Override
	public void put(String key, String value) {
		for(int i =0 ; i < length() ; i++)
		{
			if(keyArray[i].equals(key))
			{
				valueArray[i] = value;
				return;
			}
		}
		keyArray[index] = key;
		valueArray[index] = value;
		index++;		
	}

	@Override
	public String delete(String key) {

		for(int i = 0 ; i<length(); i++)
		{
			if(keyArray[i].equals(key))
			{
				returnValue = valueArray[i];
				valueArray[i] = null;
				keyArray[i] = null;
				return returnValue;
			}
		}
		return null;
	}

	@Override
	int length() {
		return index;
	}
	public void print() {
		for(int i=0 ; i<length() ; i++)
		{
			System.out.printf("%sÀÇ °ªÀº %s",keyArray[i], valueArray[i]);
		}
	}
	
}
