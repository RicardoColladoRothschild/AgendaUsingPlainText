import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;

import java.awt.event.*;


public class ShowData extends JFrame{
	
	private JTable table;
	private JScrollPane scrollPane;
	private JButton close;
	 
	private String[][] data;
	public String[] columnNames = {"ID","Name","Age", "Phone"};

		public ShowData(String[][] data){

			setUndecorated(true);
			
			setLayout(null);
			setBounds(0,0,200,200);
			setResizable(false);
			setLocationRelativeTo(null);


			

				table = new JTable(data,columnNames);				
				scrollPane = new JScrollPane(table);
				scrollPane.setBounds(10,10,100,100);
				add(scrollPane);

				close = new JButton("Close");
				close.setBounds(10,125,100,25);
				close.addActionListener(e->{
					this.dispose();
				});
				add(close);



		}

}