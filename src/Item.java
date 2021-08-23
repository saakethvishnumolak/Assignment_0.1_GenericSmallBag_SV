
public class Item<T> 
{
	private T e;
	
	public Item(T t)
	{
		e = t;
	}
	
	public void setItem(T e)
	{
		this.e = e;
	}
	
	public T get()
	{
		return e;
	}
}
