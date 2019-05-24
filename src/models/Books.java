package models;

public class Books extends Items implements Addable, Removable, Updateable {
	private String genre;

	public Books(int idItem, String title, String genre) {
		super(idItem, title);
		this.genre = genre;
	}

	@Override
	public void update() {
		System.out.println(genre);
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}

	@Override
	public void add() {
		// TODO Auto-generated method stub

	}

	// @Override
	// public void readAll() {
	// // TODO Auto-generated method stub
	//
	// }
	//
	// @Override
	// public void readFromIndex() {
	// // TODO Auto-generated method stub
	//
	// }
	//
	// @Override
	// public void readSearch() {
	// // TODO Auto-generated method stub
	//
	// }

}
