package fr.iutvalence.info.dut.m3105.pattern.structural;

public class StackOfStringTester
{
	private Stack mastack;
	
	public StackOfStringTester(Stack stack)
	{
		this.mastack = stack;
	}
	public void testStack()
	{
		System.out.println("la taille est de: " + this.mastack.getSize());
		this.mastack.push("a");
		System.out.println("j'ai push 'a'");
		System.out.println("la taille est de: " + this.mastack.getSize());
		this.mastack.push("b");
		System.out.println("j'ai push 'b'");
		System.out.println("la taille est de: " + this.mastack.getSize());
		System.out.println("j'ai peek " + mastack.peek());
		System.out.println("la taille est de: " + this.mastack.getSize());
		System.out.println("j'ai pop " + mastack.pop());
		System.out.println("la taille est de: " + this.mastack.getSize());
		System.out.println("j'ai pop " + mastack.pop());
		System.out.println("la taille est de: " + this.mastack.getSize());
		
	}
}
