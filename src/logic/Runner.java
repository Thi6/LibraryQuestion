package logic;

import models.Books;
import models.Library;
import models.Maps;

public class Runner {
	public static void main(String[] args) {
		Library library1 = new Library();

		Books harryPotterPhilosStone = new Books(1, "Harree Potter and The Philosopher's Stone", "Fantasy");

		library1.getItemList().add(harryPotterPhilosStone);

		Books book2 = new Books(2, "Stolen", "Crime");
		library1.getItemList().add(book2);

		Maps map1 = new Maps(3, "Map of London", "London");
		library1.getItemList().add(map1);

		library1.printList();

		library1.getItemList().remove(map1);

	}
}
