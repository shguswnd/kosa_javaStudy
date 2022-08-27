
public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		String three = "";
		
		while(i<100)
		{
			if(i/10 != 0) {
				if((i/10 ==3)||(i/10 ==6)||(i/10 ==9))
				{
					three += "¦";
				}
				if((i%10) != 0 && (i%10)%3 == 0)
					three += "¦";
			}
			else if((i%3)==0)
			{
				three += "¦";
			}
			if(three != "")
			System.out.printf("%d �ڼ�  %s \n",i, three);
			i++;
			three = "";
		}
	}

}
