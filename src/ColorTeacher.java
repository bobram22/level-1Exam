import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorTeacher implements ActionListener {
	 JFrame f = new JFrame();
	 JPanel p = new JPanel();
	 JButton b = new JButton();
	 JButton B = new JButton();
	 JButton bb = new JButton();
	 JButton BB = new JButton();
public static void main(String[] args) {
ColorTeacher ct = new ColorTeacher();
ct.buttons();
}

void buttons(){
	 f.add(p);
	 p.add(BB);
	 p.add(bb);
	 p.add(B);
	 p.add(b);
	 BB.setBackground(Color.GREEN);
	 bb.setBackground(Color.BLUE);
	 B.setBackground(Color.RED);
	 b.setBackground(Color.yellow);
	 BB.setOpaque(true);
	 bb.setOpaque(true);
	 B.setOpaque(true);
	 b.setOpaque(true);
	 BB.addActionListener(this);
	 bb.addActionListener(this);
	 b.addActionListener(this);
	 B.addActionListener(this);
	 f.pack();
	 f.setVisible(true);
}
void speak (String words) {
	try{
		Runtime.getRuntime().exec("say " + words);
	} catch (IOException e){
		e.printStackTrace();
	}
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	e.getSource();
	
	if(e.getSource().equals(bb)){
		speak("Blue");
	}
	else if(e.getSource().equals(BB)){
		speak("Green");
	}
	else if(e.getSource().equals(B)){
		speak("Red");
	}
	else if (e.getSource().equals(b)){
		speak("yellow");
	}
}
}
