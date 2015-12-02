package fr.iutvalence.info.dut.m3105.pattern.structural;

public class Main
{

	public static void main(String[] args)
	{
		List<String> stack = new ArrayList<String>();
		ListAdapter adapter = new ListAdapter(stack);
		new StackOfStringTester(adapter).testStack();
	}

}
