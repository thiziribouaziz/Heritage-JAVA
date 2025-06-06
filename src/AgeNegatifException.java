
public class AgeNegatifException extends Exception
{

	public AgeNegatifException()
	{
		super("l'age ne peut pas etre negatif !");
	}
	
	public AgeNegatifException(int age)

	{
		super(String.format("l'age %s ne peut pas etre négatif !", age )); 
	}
	
	
	
	
	
	
}
