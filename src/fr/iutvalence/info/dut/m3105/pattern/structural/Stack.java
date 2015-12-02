package fr.iutvalence.info.dut.m3105.pattern.structural;

public interface Stack<E>
{
	public void push(E e);
	public E pop();
	public E peek();
	public int getSize();
}
