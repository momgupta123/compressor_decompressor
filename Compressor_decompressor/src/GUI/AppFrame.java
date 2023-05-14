/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import com_decom.compreser;
import com_decom.decompre;
import java.awt.Color;
import static java.awt.SystemColor.text;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Roshan
 */
public class AppFrame extends JFrame implements ActionListener {
    JButton compressButton;
    JButton decompressButton;    

AppFrame(){
   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
compressButton=new JButton("Selection File To Compresseor");
compressButton.setBounds(25,100,200,30);
compressButton.addActionListener(this);
decompressButton=new JButton("Selection File To Decompresseor")
decompressButton.setBounds(250,100,200,30);   
decompressButton.addActionListener(this);
this.add(compressButton);
this.add(decompressButton);
this.setSize(1000,500);
this.getContentPane().setBackground(Color.green);
this.setVisible(true);
}
@Override 
public void actionPerformed(ActionEvent e){
if(e.getSource()==compressButton){
    JFileChooser filechooser=new JFileChooser();
    int response=filechooser.showSaveDialog(null);
    if(response==JFileChooser.APPROVE_OPTION){
        File file=new File(filechooser.getSelectedFile().getAbsolutePath());
   System.out.print(file);
   try{
      compreser.method(file); 
   }
   catch(IOException ee){
       JOptionPane.showMessageDialog(null,ee.toString());
   }
    
    }
}
if(e.getSource()==decompressButton){
      JFileChooser filechooser=new JFileChooser();
    int response=filechooser.showSaveDialog(null);
    if(response==JFileChooser.APPROVE_OPTION){
        File file=new File(filechooser.getSelectedFile().getAbsolutePath());
   System.out.print(file);
   try{
      decompre.method(file); 
   }
   catch(Exception ee){
       JOptionPane.showMessageDialog(null,ee.toString());
   }
    
    }
    
}
}

    private JButton newJButton(String selection_File_To_Decompresseor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}