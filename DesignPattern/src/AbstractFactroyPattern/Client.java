package AbstractFactroyPattern;

public class Client {
	public Client(GUIFactory guiFactory){
		Component button=guiFactory.createButton();
		button.paint();
		
		Component list=guiFactory.createList();
		list.paint();
		
		Component table=guiFactory.createTable();
		table.paint();
	}
}
