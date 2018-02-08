import java.util.*;


public class TestArrayList {

	
	public static void main(String[] args) {
		
		ArrayList<Object> list = new ArrayList();
		list.add(new Loan());
		list.add(new Date());
		list.add("ABC");
		list.add(new Circle());
		
		for(int count = 0; count < list.size; count++) {
			System.out.println(list.get(count));
		}
		
	}

}
