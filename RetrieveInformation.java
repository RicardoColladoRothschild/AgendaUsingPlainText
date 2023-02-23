import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.io.BufferedReader;

public class RetrieveInformation{
	
	private int id;
	private Persona persona;
	private String info = "";
	private	String data = "";
		public RetrieveInformation(int id){
			this.id = id;
		}


	public Persona retrieveData(){

		try{
			String root = ".//data/"+(String.valueOf(id)+".txt");
			File file = new File(root);

			if(file.exists()){
				FileReader fw  = new FileReader(file);
			BufferedReader br = new BufferedReader(fw);

			
			
				while(info!=null){
					if(info==null)
						break;
					data+=info;
					info=br.readLine();
				}

			String[] collected = data.split("/");
			//(  int id, String phone)
			// this.getId() + "/" + this.getPhone();
			persona = new Persona(Integer.valueOf(collected[1]), collected[0],(Integer.valueOf(collected[2])), collected[3]);
		}else{
			JOptionPane.showMessageDialog(null, "Record has not been found");
		}
			

		}catch(FileNotFoundException fnf){
			JOptionPane.showMessageDialog(null, "Please, contact your system administrator: " + fnf.toString());
	}
		catch(IOException e){
			JOptionPane.showMessageDialog(null, "Please, contact your system administrator: " + e.toString());
	}

		return persona;
	}	
}