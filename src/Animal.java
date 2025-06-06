import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

public abstract class Animal {
	protected String m_nom;
	protected int m_age;
	protected Vector<String> m_surnoms;
	
	// Les accesseurs pour le nom:
	public String getNom()
	{
		return m_nom;
	}
	public void setNom(String nom)
	{
		m_nom = nom;
	}
	
	// Les accessseurs pour l'age:
	public int getAge()
	{
		return m_age;
	}
	public void setAge(int age) throws AgeNegatifException
	{
		if (age < 0)
			throw new AgeNegatifException(age);
		m_age = age;
	}
	
	// Les accessseurs pour les surnoms:
	public Vector<String> getSurnoms()
	{
		return m_surnoms;
	}
	public void setSurnoms(Vector<String> surnoms)
	{
		m_surnoms = surnoms;
	}
	
	public Animal()
	{
		m_nom = "Animal par defaut";
		m_surnoms = new Vector<String>();
	}
	
	public Animal(String nom, int age) throws AgeNegatifException
	{
		if  ( age < 0)
			throw new AgeNegatifException(age);
		m_nom = nom;
		m_age = age;
		m_surnoms = new Vector<String>();
	}
	
		
		
	
	public Animal(String nom, int age, Vector<String> surnoms) throws AgeNegatifException
	{
		
		if (age < 0)
			throw new AgeNegatifException(age);
		m_nom = nom;
		m_age = age;
		m_surnoms = new Vector<String>(surnoms);
	}
	
	
	
	/*public void sePresenter()
	{
		String surnoms = "les surnoms {";
		for(int i=0; i<m_surnoms.size(); i++)
		{
			surnoms += m_surnoms.get(i);
			if(i<(m_surnoms.size()-1))
				surnoms += ", ";
		}
		surnoms += "}";
		System.out.println("Animal de nom \"" + m_nom + "\" et d'age " + m_age + ", ayant " + surnoms);
	}*/
	
	public abstract void sePresenter();
}