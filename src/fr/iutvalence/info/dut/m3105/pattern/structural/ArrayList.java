package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ArrayList<E> implements List<E>
{
	private E array[];
	private int nbelements;
	
	public ArrayList()
	{
		this.array=(E[]) new Object[10];
		this.nbelements = 0;
	}
	@Override
	public void add(int i, E e)
	{
		this.array[i-1]=e;
		this.nbelements ++;
	}

	@Override
	public E remove(int i)
	{
		this.nbelements--;
		return this.array[i+1];
		
	}

	@Override
	public E get(int i)
	{
		return this.array[i+1];
		
	}

	@Override
	public int Size(int i)
	{
		return nbelements;
	}

}
