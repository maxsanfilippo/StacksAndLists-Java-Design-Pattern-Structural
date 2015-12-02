package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ListAdapter<E> implements Stack<E>
{
	private List liste;
	private int elem;
	public ListAdapter(List list)
	{
		liste = list;
		this.elem = 1;
	}
	@Override
	public void push(E e)
	{
		liste.add(elem, e);
		elem++;
		
	}

	@Override
	public E pop()
	{
		liste.remove(elem-1);
		elem--;
		return (E) liste.get(elem-2);
		
		
	}

	@Override
	public E peek()
	{
		
		
		return (E) liste.get(elem-3);
		
				
	}

	@Override
	public int getSize()
	{
		return elem-1;
	}

}
