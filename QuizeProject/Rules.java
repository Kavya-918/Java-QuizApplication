package QuizeProject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

	    String name;
	    JButton start, back;
	    
	    Rules(String name) {
	        this.name = name;
	        getContentPane().setBackground(Color.WHITE);
	        setLayout(null);
	        
	        JLabel heading = new JLabel("Welcome " + name + " to Simple Minds");
	        heading.setBounds(50, 20, 700, 30);
	        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
	        heading.setForeground(new Color(30, 144, 254));
	        add(heading);
	        
	        JLabel rules = new JLabel();
	        rules.setBounds(20, 90, 700, 350);
	        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
	        rules.setText(
	            "<html>"+ 
	                "1. Participants must refrain from using any external resources such as books,internet,assistance." + "<br><br>" +
	                "2. Each participant is granted one lifeline throughout the quiz." + "<br><br>" +
	                "3. Participants are not allowed to switch devices or tabs once the quiz begins." + "<br><br>" +
	                "4. Participants must maintain fair play throughout the quiz." + "<br><br>" +
	                "5. Participants should demonstrate good sportsmanship at all times, whether they win or lose." + "<br><br>" +
	                "6. Participants must provide their answers within a time limit of 15 seconds for each question." + "<br><br>" +
	                "7. Brace yourself, this paper is not for the faint hearted." + "<br><br>" +
	                "8. Good Luck." + "<br><br>" +
	            "<html>"
	        );
	        add(rules);
	        
	        back = new JButton("Back");
	        back.setBounds(250, 500, 100, 30);
	        back.setBackground(new Color(30, 144, 254));
	        back.setForeground(Color.WHITE);
	        back.addActionListener(this);
	        add(back);
	        
	        start = new JButton("Start");
	        start.setBounds(400, 500, 100, 30);
	        start.setBackground(new Color(30, 144, 254));
	        start.setForeground(Color.WHITE);
	        start.addActionListener(this);
	        add(start);
	        
	        setSize(800, 650);
	        setLocation(350, 100);
	        setVisible(true);
	    }
	    
	    public void actionPerformed(ActionEvent ae) {
	        if (ae.getSource() == start) {
	            setVisible(false);
	            new Quiz(name);
	        } else {
	            setVisible(false);
	            new Login();
	        }
	    }
	    
	    public static void main(String[] args) {
	        new Rules("User");
	    }
	}

