package models;

import java.util.ArrayList;

public class Library {
	ArrayList<Items> itemList = new ArrayList<Items>();

	public ArrayList<Items> getItemList() {
		return itemList;
	}

	public void setItemList(ArrayList<Items> itemList) {
		this.itemList = itemList;
	}

	public void printList() {
		for (Items i : itemList) {
			System.out.println("" + i.getIdItem() + "," + i.getTitle());
		}
	}

	public void updateList() {
		for (Items i : itemList) {

		}
	}

}
