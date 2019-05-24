package models;

public class Maps extends Items implements Addable, Removable, Updateable {

	String region;

	public Maps(int idItem, String title, String region) {
		super(idItem, title);
		this.region = region;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

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
	// public void read() {
	// // TODO Auto-generated method stub
	//
	// }
}
