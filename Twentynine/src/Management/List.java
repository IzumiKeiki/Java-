package Management;

public class List {

	private Prefecture[] list;

	public List(int number) {
		this.list = new Prefecture[number];
	}
	
	public Prefecture getPrefecture(int index) {
		return this.list[index];
	}

	public void setPrefecture(int index, Prefecture prefecture) {
		this.list[index] = new Prefecture(prefecture);
	}

	public void printList() {
		for ( Prefecture item : list ) {
			if ( item != null) {
				item.printPrefecture();
			} 
		}
	}
	
	public void printItem(int index) {
		if (this.list[index] != null) {
			this.list[index].printPrefecture();
		} else {
			System.out.println("No Information");		
		}
	}

}
