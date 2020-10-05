 
import java.awt.*; 
import javax.swing.*; 
import java.io.*; 
import java.awt.event.*; 
import javax.swing.plaf.metal.*; 
import javax.swing.text.*; 
import java.awt.BorderLayout;
class Texteditor extends JFrame { 
	// Text component 
	JTextArea t; 

	// Frame 
	JFrame f; 

	// Constructor 
	Texteditor() 
	{ 
		// Create a frame 
		f = new JFrame("Texteditor"); 
      
	           try {           
			// Set metl look and feel 
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel"); 

			// Set theme to ocean 
			MetalLookAndFeel.setCurrentTheme(new OceanTheme()); 
		} 
		catch (Exception e) { 
		} 
                                            // Text component  
		t = new JTextArea(); 
		f.add(t);     
		f.setSize(500, 500); 
                                           f.setLocationRelativeTo(null);
                                           f.setVisible(true);
                                           f.setBounds(100,100,616,444);
                                           //t.setBackground(color.WHITE);
                                           //t.setForeground(color.BLACK);
                                           f.getContentPane().add(t,BorderLayout.NORTH);
		f.show();        
	} 

  	// If a button is pressed 
	public void actionPerformed(ActionEvent e) 
	{ 
		String s = e.getActionCommand(); 
      
	}

	// Main class 
	public static void main(String args[]) 
	{ 
		Texteditor e = new Texteditor(); 
	} 
} 
