package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ArrayStack<E> implements Stack<E>
{

	private E array[];
	private int nbelements;
	
	public ArrayStack()
	{
		this.array=(E[]) new Object[10];
		this.nbelements = 0;
	}
	@Override
	public void push(E e)
	{
		this.array[nbelements]=e;
		this.nbelements ++;
		
	}

	@Override
	public E pop()
	{
		
		this.nbelements--;
		return this.array[nbelements];
		
	}

	@Override
	public E peek()
	{
		return this.array[nbelements-1];
	}

	@Override
	public int getSize()
	{
		return nbelements;
	}
	
}
