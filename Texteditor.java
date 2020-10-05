// Java Program to create a text editor using java 
import java.awt.*; 
import javax.swing.*; 
import java.io.*; 
import java.awt.event.*; 
import javax.swing.plaf.metal.*; 
import javax.swing.text.*; 
import java.awt.BorderLayout;
import  javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JButton;


class Texteditor extends JFrame implements ActionListener { 
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

		// Create a menubar 
		JMenuBar mb = new JMenuBar(); 
                                           mb.setMargin(new Insets(0,5,0,0));
                                           mb.setBackground(Color.BLACK);
                                            mb.setForeground(Color.WHITE);
                                            f.getContentPane().add(mb,BorderLayout.NORTH);

		// Create amenu for menu 
		JMenu m1 = new JMenu("File"); 

		// Create menu items 
		JMenuItem mi1 = new JMenuItem("New"); 
		JMenuItem mi2 = new JMenuItem("Open"); 
		JMenuItem mi3 = new JMenuItem("Save"); 
		JMenuItem mi9 = new JMenuItem("Print"); 

		// Add action listener 
		mi1.addActionListener(this); 
		mi2.addActionListener(this); 
		mi3.addActionListener(this); 
		mi9.addActionListener(this); 

		m1.add(mi1); 
		m1.add(mi2); 
		m1.add(mi3); 
		m1.add(mi9); 

		// Create amenu for menu 
		JMenu m2 = new JMenu("Edit"); 

		// Create menu items 
		JMenuItem mi4 = new JMenuItem("cut"); 
		JMenuItem mi5 = new JMenuItem("copy"); 
		JMenuItem mi6 = new JMenuItem("paste"); 

		// Add action listener 
		mi4.addActionListener(this); 
		mi5.addActionListener(this); 
		mi6.addActionListener(this); 

		m2.add(mi4); 
		m2.add(mi5); 
		m2.add(mi6); 

		JMenuItem mc = new JMenuItem("close"); 

		mc.addActionListener(this); 

		mb.add(m1); 
		mb.add(m2); 
		mb.add(mc); 
                                         f.setJMenuBar(mb);
                                        JMenu file = new JMenu("File");
                                        mb.add(file);
                                       // mb.add(new JMenu("|")).setEnabled(flase);
                                         JMenuItem newFile =new JMenuItem("New");
                                          file.add(newFile);
                                          file.addSeparator();
                                        JPanel panel =new JPanel();
                                       // panel.setBackground(Color.BLACK);
                                        panel.setSize(100,100);
                                        f.getContentPane().add(panel,BorderLayout.SOUTH);



        Container contentPane = f.getContentPane();

        contentPane.setLayout(new BorderLayout());
        contentPane.add(t, BorderLayout.CENTER);

        JButton bold= new JButton("Bold"); //TODO Create action
 
        JPanel buttons = new JPanel();
        buttons.setLayout(new GridLayout(1,1));
        buttons.add(bold);
      

        contentPane.add(buttons, BorderLayout.NORTH);


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
