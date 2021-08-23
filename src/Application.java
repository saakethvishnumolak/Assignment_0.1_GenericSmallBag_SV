
public class Application {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) 
	{
		Item<String> sb1 = new Item<String>("Saaki Vishnumolakala");
		
		Item<Integer> sb2 = new Item<Integer>(17);
		
		
		SmallBag<Item> sb3 = new SmallBag<Item>();
		
		sb3.set(sb1);
		System.out.println(sb3.get());
		
		sb3.set(sb2);
		System.out.println(sb3.get());
	}

}
