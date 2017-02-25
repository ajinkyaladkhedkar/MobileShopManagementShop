import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

import java.io.*;
import java.net.*;
 /*
<applet code=part2 height=500 width=500></applet>
*/

public class part2 extends Applet implements ActionListener {

        String imei[]= new String[20];
 	String brand[]= new String[20];
 	String mn[]= new String[20];
 	String cam[]= new String[20];
 	String touch[]= new String[20];
 	
 	int c=0;
 	private boolean isStandalone = false;
 	  
 	  JPanel ap1 = new JPanel();
 	  JTabbedPane atp1 = new JTabbedPane();
 	  JPanel ap2 = new JPanel();
 	  JLabel al1 = new JLabel();
 	   
 	   JTextField at1 = new JTextField();
 	   JTextField at2 = new JTextField();
 	   JTextField at3 = new JTextField();
 	   JTextField at4 = new JTextField();
 	   JTextField at5 = new JTextField();
 	  //JTextField at6 = new JTextField();
 	 JLabel al2 = new JLabel(); 
 	 JLabel al3 = new JLabel();
 	 JLabel al4 = new JLabel();
 	 JLabel al5 = new JLabel();
 	 //JLabel al6 = new JLabel();
 	 JLabel al7 = new JLabel();
 	 JButton ab1 = new JButton();
 	 JButton ab2=new JButton();
 	 JButton ab3=new JButton();
 	 
 	 
 	 public void init() {
 	    try {
 	      jbInit();
 	    }
 	    catch(Exception e) {
 	      e.printStackTrace();
 	    }
 	  }
 	 
 	private void jbInit() throws Exception {
 	    this.setLayout(null);
 	    this.setFont(new java.awt.Font("MS Sans Serif", 0, 11));
 	    atp1.setBounds(new Rectangle(-3, 0, 493, 420));
 	    
 	    al7.setFont(new java.awt.Font("Dialog", 0, 18));
 	    al7.setForeground(Color.black);
 	    
 	   al7.setText("Add mobile details");
 	    al7.setBounds(new Rectangle(140,28, 253, 44));
 	   ap2.setLayout(null);
 	   at1.setText("");
 	    at1.setBounds(new Rectangle(218, 115, 153, 24));

 	    at2.setText("");
 	    at2.setBounds(new Rectangle(219, 155, 151, 24));

 	    at3.setText("");
 	    at3.setBounds(new Rectangle(219, 189, 151, 24));

 	    at4.setText("");
 	    at4.setBounds(new Rectangle(218, 225, 150, 23));

 	    at5.setText("");
 	    at5.setBounds(new Rectangle(218, 260, 150, 24));
 	 
 	    //at6.setText("");
	    //at6.setBounds(new Rectangle(218, 260, 150, 24));
	    
	    al1.setText("IMEI");
	    al1.setBounds(new Rectangle(77, 115, 123, 24));

	    al2.setText("Brand");
	    al2.setBounds(new Rectangle(77, 155, 98, 21));

	    al3.setText("Model no");
	    al3.setBounds(new Rectangle(79, 190, 82, 23));

	    al4.setText("Camera");
	    al4.setBounds(new Rectangle(81, 225, 69, 15));

	    al5.setText("Touchscreen");
	    al5.setBounds(new Rectangle(81, 260, 76, 21));

	 //   al6.setText("cast");
	   // al6.setBounds(new Rectangle(81, 260, 76, 21));

	    ab1.setBounds(new Rectangle(44, 300, 118, 28));
	    ab1.setText("Add");
	    ab2.setBounds(new Rectangle(184, 300, 100, 28));
	    ab2.setText("Update");
	    ab3.setBounds(new Rectangle(300, 300, 117, 28));
	    ab3.setText("Delete");
	    

	    
	    this.add(ap1);
	    this.add(atp1);
	    atp1.add(ap2,   "mobile");
	    ap2.add(al7);
	    ap2.add(at1);
	    ap2.add(at5);
	    ap2.add(al5);
	    ap2.add(al4);
	    ap2.add(at4);
	    ap2.add(al3);
	    ap2.add(at3);
	    ap2.add(at2);
	    ap2.add(al2);
	    ap2.add(al1);
	    ap2.add(ab1);
	    ap2.add(ab2);
	    ap2.add(ab3);
	    
	    ab1.addActionListener(this);
	    ab2.addActionListener(this);
	    ab3.addActionListener(this);
	    
	    ap1.setVisible(true);
	    ap2.setVisible(true);
	    atp1.setVisible(true);
 	}
 	
 	
 	public void actionPerformed(ActionEvent ae)
 	{
 	    String str = ae.getActionCommand()	;
 	   int f2=0;
 	    		
 	    		
 		if(str.equals("Add"))	
 		{
 			c++;	
 			imei[c]=at1.getText();
 			brand[c]=at2.getText();
 			mn[c]= at3.getText();
 			cam[c]=at4.getText();
 			touch[c]=at5.getText();
 			JOptionPane.showMessageDialog(null,"Mobile added succesfully");
 			 ab1.setVisible(true);
 		    ab2.setVisible(true);
 		    clear();
 		   
 			
 		}
 		if(str.equals("Update"))	
 		{
 			String str1=JOptionPane.showInputDialog("ENTER IMEI NO.");
 			for(int i=1;i<=c;i++)
 			{
 			   if(imei[i].equals(str1))
 			   {
 			   	at1.setText(imei[i]);		   		
 			   	at2.setText(brand[i]);		   		
 			   	at3.setText(mn[i]);		   		
 			   	at4.setText(cam[i]);		   		
 			   	at5.setText(touch[i]);		   			
 			   	ab2.setText("OK");		   		
 			   	ab1.setVisible(false);
 			   	ab3.setVisible(false);
 			   }
 			}
 		}
 			
 			if(str.equals("OK"))
 			{	
 				int flag=0;
 				String str2=at2.getText();
 				for(int i=1;i<=c;i++)
 				{
 					if(imei[i].equals(str2))
 					{
 				
 				imei[c]=at1.getText();
 			    brand[c]=at2.getText();
 				mn[c]= at3.getText();
 				cam[c]=at4.getText();
 				touch[c]=at5.getText();
 				
 				flag++;
 				
 			       clear();
 				ab2.setText("Update");	
 				ab1.setVisible(true);
 				ab3.setVisible(true);
 			      }
 			  }
 				 if(flag==0)
  			    	JOptionPane.showMessageDialog(null,"Mobile not present");
  			    else
  			    	 JOptionPane.showMessageDialog(null,"Mobile Updated");

 			}
 			
 			if(str.equals("Delete"))	
 	 		{
 	 			int flag=0;
 				String str3=JOptionPane.showInputDialog("Enter imei no");
 	 			int k=c;
 	 			for(int i=1;i<=c;i++)
 	 			{
 	 			   if(imei[i].equals(str3))
 	 			   {
 	 				   if(i==c)
 	 				   {
 	 					   c--;
 	 					   flag++;
 	 		           }
 	 				   else
 	 				   {
 	 				  for(int j=i;j<=c;j++)
 	 				  {
 	 					 imei[j]=imei[j+1];
 	 					 brand[j]=brand[j+1];
 	 					 mn[j]=mn[j+1];
 	 					 cam[j]=cam[j+1];
 	 					 touch[j]=touch[j+1];
 	 				  }
 	 				flag++;
 	 				   }
 	 			   }
 	 			   
 	 				   
 	 			} 
 	 			
 			    if(flag==0)
 			    	JOptionPane.showMessageDialog(null,"Mobile not present");
 			    else
 			    	 JOptionPane.showMessageDialog(null,"Mobile Deleted");

 			    	
 	 		}
 			}
 		
 	public void clear()
 	{
 		
 			at1.setText("");
 			at2.setText("");
 			at3.setText("");
 			at4.setText("");
 			at5.setText("");
 			
 	}

 	
 	public static void main(String[] args) {
 	    part2 applet = new part2();
 	    applet.isStandalone = true;
 	    JFrame frame;
 	    frame = new JFrame();
 	    frame.setTitle("Mobile");
 	 	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	    frame.add(applet, BorderLayout.CENTER);
 	    applet.init();
 	    applet.start();
 	    frame.setSize(510,460);
 	    frame.setVisible(true);
 	  }
 	 
}

	    
	    
	   