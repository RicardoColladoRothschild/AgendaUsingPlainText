import javax.swing.*;



/*This class create a Table object, so that contact information can use it and show it.
*@author ricardo vladimir collado Rothschild*/
public class TableViewer{

	private Persona objectPersona;

	
	public String[] columnNames = {"ID","Name","Age", "Phone"};
	/*
	*This is TableViewer constructor, it will return the table to be located at the main screen of class main.
	*@param person this is an object of type Persona, which should be receive to provide information for the person that
	* has been the record requested.
	*
	*@author ricardo vladimir collado rothschild
	*/
	public TableViewer(Persona person){

		this.objectPersona = person;
	
	}

	/*
	**/
	public String[][] tableObjectWithInformation(){

		String[][] dataRetrieved = {{String.valueOf(objectPersona.getId()), objectPersona.getName(), 
			String.valueOf(objectPersona.getAge()), objectPersona.getPhone()}};

		//JTable table = new JTable(dataRetrieved, columnNames);
		//JOptionPane.showMessageDialog(null, "name: " + objectPersona.getName() + " ptn: " + objectPersona.getPhone());
		return dataRetrieved;

	}

}