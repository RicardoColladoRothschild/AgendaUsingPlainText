import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.JTextField;
import javax.swing.JLabel;
/*
*@author ricardo vladimir collado rothschild
*/
public class Contacto extends JFrame{

private JButton btn_saveInformation;
private JButton btn_retrieveInformation;

private JLabel label_name;
private JLabel label_age;
private JLabel label_Id;
private JLabel label_Phone;

private JTextField field_Name;
private JTextField field_Age;
private JTextField field_Id;
private JTextField field_Phone;


private String name;
private int age;
private int id;
private String phone;

/*
 * Construtor for the Contacto class, this constructor will build the user interface, including buttons, field, and labels.
 * @author ricardo vladimir collado rothschild
 * 
 * 
*/
	public Contacto(){


		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setTitle("Agenda");

			label_name = new JLabel("Name ");
				label_name.setBounds(10,20,100,25);
					add(label_name);

			label_age = new JLabel("Age: ");
				label_age.setBounds(10,55,100,25);
					add(label_age);

			label_Id = new JLabel("Id: ");	
				label_Id.setBounds(10,85,100,25);
					add(label_Id);	

			label_Phone = new JLabel("Phone ");	
					label_Phone.setBounds(10,115,100,25);
						add(label_Phone);

			field_Name = new JTextField();
				field_Name.setBounds(115,20,100,25);
					add(field_Name);	

			field_Age = new JTextField();
				field_Age.setBounds(115,55,100,25);
					add(field_Age);		

			field_Id = new JTextField();
				field_Id.setBounds(115,85,100,25);
					add(field_Id);	

			field_Phone = new JTextField();
				field_Phone.setBounds(115,115,100,25);	
					add(field_Phone);				


			btn_saveInformation = new JButton("Save");
				btn_saveInformation.setBounds(10,145,100,25);		
					btn_saveInformation.addActionListener(e->{

						name=String.valueOf(field_Name.getText());
						id=Integer.valueOf(String.valueOf(field_Id.getText()));
						age=Integer.valueOf(String.valueOf(field_Age.getText()));
						phone=String.valueOf(field_Phone.getText());

						Persona personObject = new Persona(age,name,id,phone);
						SaveInformationProcess sip = new SaveInformationProcess(personObject);

					});
						add(btn_saveInformation);

			btn_retrieveInformation = new JButton("Retrieve");
				btn_retrieveInformation.setBounds(10,180,100,25);		
					btn_retrieveInformation.addActionListener(e->{
						
					});
						add(btn_retrieveInformation);			

	}
}