package cognizant;

class Cons
{
	public int i;
	public Cons(int i)
	{
		this.i=i;
		
	}
public static void main(String[] args) {
	Cons a1=new Cons(334);
	Cons a2=a1;
	a2.i=998;
	System.out.println(a2.i + "\t" + a1.i);
}
}