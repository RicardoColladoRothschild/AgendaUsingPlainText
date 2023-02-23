import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import java.io.IOException;
/*
*This SaveInformationProcess class is for saving the information that is send to it from a Persona object.
*@author ricardo vladimir collado rothschild
**/
public class SaveInformationProcess{
	
	private String root = ".//data//";
	private BufferedWriter bw;
	private FileWriter fw;
	private File file;

	private Persona personaObject;

		/*Constructor method for SaveInformationProcess class. 
		*The constructor for this class receive a Persona object, which is then use to save the file as txt. 
		*@param personaObject type of a Persona object
		*/
		public SaveInformationProcess(Persona personaObject){
			this.personaObject = personaObject;
			sendInfo();
		}

	private void sendInfo(){

		try{
			root +=String.valueOf(personaObject.getId()+".txt");
			File file = new File(root);

			if(!file.exists()){
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(personaObject.toString());
			bw.close();

			JOptionPane.showMessageDialog(null, "Contact was successfully saved");

		}catch(IOException io){
			JOptionPane.showMessageDialog(null, "There has been a problem, please contact your system administrator: " + io.toString());
		}
	}	
}