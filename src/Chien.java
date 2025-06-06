import java.util.Vector;

public class Chien extends Animal {
	public Chien()
	{
		// Appel du constructeur par défaut de la classe mère en premier.
		//super("Test", 100);
	}
	
	public Chien(String nom, int age, Vector<String> surnoms) throws AgeNegatifException
	{
		super(nom, age, surnoms);
	}
	
	@Override
	public void sePresenter()
	{
		String surnoms = "les surnoms {";
		for(int i=0; i<m_surnoms.size(); i++)
		{
			surnoms += m_surnoms.get(i);
			if(i<(m_surnoms.size()-1))
				surnoms += ", ";
		}
		surnoms += "}";
		System.out.println("Chien de nom \"" + m_nom + "\" et d'age " + m_age + ", ayant " + surnoms);	
	}
	public void aboyer()
	{
		System.out.println("Le chien " + m_nom + " aboie.");
	}
}