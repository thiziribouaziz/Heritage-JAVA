
import java.util.Arrays;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		Vector<String> surnoms = new Vector<String>(Arrays.asList("A", "B", "C"));
		surnoms.add("D");
		
		//Animal a1 = new Animal();
		//Animal a2 = new Animal("Milou", 10, surnoms);
		//a1.sePresenter();
		//a2.sePresenter();
		System.out.println();
		try 
		{
		Chat chat1 = new Chat();
		Chat chat2 = new Chat("Felix", -5, surnoms);
		//chat1.sePresenter();
		//chat2.sePresenter();
		
		
		
		Chien chien1 = new Chien();
		Chien chien2 = new Chien("Bob", 15, surnoms);
		//chien1.sePresenter();
		//chien2.sePresenter();
		
		Vector<Animal> zoo = new Vector<Animal>();
		//zoo.add(a1);
		//zoo.add(a2);
		zoo.add(chat1);
		zoo.add(chat2);
		zoo.add(chien1);
		zoo.add(chien2);
		
		for(Animal a : zoo)
		{
			a.sePresenter();
			if(a instanceof Chien )
				((Chien)a).aboyer();
			else if (a instanceof Chat )
				((Chat)a).miauler();
		}
		}
		catch(AgeNegatifException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
		System.out.println("/n------------------/n");
		System.out.println("new update");
		
			
		
	}

}