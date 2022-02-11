import java.util.ArrayList;	
import java.util.Scanner;
		
public class Ticket {
		
	public static void main(String[] args) {
		
		// Creer une liste vide
	
		ArrayList<Produit>Ticket = new ArrayList<Produit>();
		
		// Instancier la class scanner depuis l'import
		
		Scanner scan = new Scanner(System.in);
		
			System.out.println("Saisie d'un item ?: (Y/N) ");
		    String reponse = scan.nextLine();
		    
		// Fonction
		   
		while (reponse.toUpperCase().equals("Y")) {
			
			System.out.println("Description: ");
			String description = scan.next();
			
			System.out.println("Quantité: ");
			int quantity = scan.nextInt();
			
			System.out.println("Prix en euros: ");
			double price = scan.nextDouble();
		
		// Instancier l'objet produit
		// Ajout des items à la liste Ticket
		
		Produit produit = new Produit(description, quantity, price);
		Ticket.add(produit);
		
		//Boucle relancée ou stop
		
		System.out.println("Saisie d'un autre item ?: (Y/N) ");
		String response = scan.next();
		if(response.toUpperCase().equals("N")) break;
		
		}
		
		System.out.println("");
		System.out.println("<--------------------------Ticket de caisse------------------------>");
		
		// Affichage de la liste d'items
		// Initialisation de la variable total
		
		double price = 0;
		
		for(Produit command: Ticket) {
			System.out.println("");
			System.out.println("Description: ");
			System.out.println(command.getDescription());
			System.out.println("Quantité: ");
			System.out.println(command.getQuantity());
			System.out.println("Prix: ");
			System.out.println(command.getPrice());
			
			price = price + (command.getQuantity() * command.getPrice());
			System.out.println("");

		}
		                
		System.out.println("Prix total: "+ "" +price +" euros");
		System.out.println("");

	    System.out.println("<-------------------Merci et à bientôt chez Mounir------------------>");
	    
	    }
			
}



	

