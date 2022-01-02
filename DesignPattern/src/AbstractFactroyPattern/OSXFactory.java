package AbstractFactroyPattern;

public class OSXFactory implements GUIFactory {

	public Component createButton() {
		return new OSXButton();
	}

	@Override
	public Component createList() {
		return new OSXList();
	}

	public Component createTable() {
		return new OSXTable();
	}

}
