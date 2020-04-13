package bookstore;

public class Control {
	private final View view = new View();
	private final User user = null;
	private final Owner owner = null;
	
	public void launch() {
		
		while (true) {
			// show main menu
			final int choice = view.mainMenu();
			
			//if user
			if (choice == 1) {
				runUser();
			}
			//if owner
			else if (choice == 2) {
				runOwner();
			}
			// user exits 
			else if (choice == 0) {
				return;
			}
			else {
				continue;
			}
		}
		
	}
	
	private void runUser() {
		while(true) {
			final int choice = view.userMenu();
			
			if (choice == 1) {
				// Searching for books
				//view.getSearchKeyWords() -> get the user search keyword
				
				//PostgresHandler.searchBooks() -> search the books and get result set
				
				//store all in a list by isbn number
				
				//view.displayBooks -> Display books and ask if user wants to add any books to list 
				//if in the list or view more information (loop till user exits)				
			} else if (choice == 2) {
				// View the cart
				// view.viewCart(user) -> display contents of the cart and ask to checkout or go back
				// if checkout see if signed in
				// if go back continue
			} else if (choice == 3) {
				// View orders
				// check if signed in
				// if yes get all orders of user view.showOrders(order result set)
				// if no ask to sign in and continue
			} else if (choice == 4) {
				//Login user
				//view.getUsername()
				//view.getPassword()
				//see if user exists
				//continue
			} else if (choice == 5) {
				//Sign up
				//get all user information (check username)
				//register user if not already in the database
			} else if (choice == 0){
				//user exits
				return;
			} else {
				// do nothing
				continue;
			}
		}
		
		
	}
	
	private void runOwner() {
		
	}

}
