public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		String chaine = "kjc";
		int num2 = 8;
		System.out.println(chaine + num2 * 3);
		if(num2 < 7) {
			System.out.println("Guillaume");
		}
		else {
			System.out.println("Briac");
		}
		String[] apprenants = new String[4];
		apprenants[0] = "Ibrahim";
		apprenants[1] = "Kevin";
		apprenants[2] = "Yasmine";
		apprenants[3] = "Soumaya";
		for (int i = 0; i < apprenants.length; i++) {
			System.out.println(apprenants[i]);
		}
		
		for (String UnApprenant:apprenants) {
			System.out.println(UnApprenant);
		}
		
		Personne bobby = new Personne("Bobby", "Kotick", "Homme", 45, 104, 156); 
		System.out.println(bobby.getFirstname());
		bobby.setFirstname("Robert");
		System.out.println(bobby.getFirstname());
		
		
		
		Apprenant[]Apprenants = new Apprenant[3];
		Apprenants[0] = new Apprenant("Marie", "Dupont", 1, "Java");
		Apprenants[1] = new Apprenant("Pierre", "Durand", 2, "Java");
		Apprenants[2] = new Apprenant("Lucie", "Robert", 3, "Java");
		for (int i = 0; i < Apprenants.length; i++) {
			if(Apprenants[i].getLevel() >= 3) {
				System.out.println("blabla");
			}
		}
	}

}


	