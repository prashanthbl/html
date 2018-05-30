package com.ph;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;

public class SwipeOut2 {
	private JLabel srclbl;
	private JTextField srcfld;
	private JButton srcbtn;
	
	private JLabel empNoslbl;
	private JTextField empNosfld;
	
	private JLabel frmlbl;
	private JTextField frmfld;
	
	private JLabel tolbl;
	private JTextField tofld;
	
	private JButton submitbtn;
	private JTextArea resultArea;
	
	public SwipeOut2() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame=new JFrame("SwipeData Calc");
		Font font=new Font("temp", Font.BOLD, 14);
		
		srclbl=new JLabel("Select File:");
		srclbl.setFont(font);
		srcfld=new JTextField(20);
		srcfld.setToolTipText("Please select Swipe Data Xls file");
		srcbtn=new JButton("Browse");
		
		empNoslbl=new JLabel("Emp Ids:");
		empNoslbl.setFont(font);
		empNosfld=new JTextField(20);
		empNosfld.setToolTipText("Enter emp numbers , seperated");
		
		frmlbl=new JLabel("From Dt:");
		frmlbl.setFont(font);
		frmfld=new JTextField(20);
		frmfld.setToolTipText("Select from date");
		tolbl=new JLabel("To Dt:");
		tolbl.setFont(font);
		tofld=new JTextField(20);
		tofld.setToolTipText("Select to date");
		
		submitbtn=new JButton("Generate Report");
		resultArea=new JTextArea();
		
		//src layout
		srclbl.setBounds(5, 30, 100, 20);
		srclbl.setLayout(null);
		srcfld.setBounds(100, 30, 300, 20);
		srcfld.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		srcbtn.setBounds(420, 30, 150, 20);
		srcbtn.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		//empnumberslayout
		empNoslbl.setBounds(5, 60, 100, 20);
		empNoslbl.setLayout(null);
		empNosfld.setBounds(100, 60, 300, 20);
		empNosfld.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		//frm and to
		frmlbl.setBounds(5, 90, 100, 20);
		frmlbl.setLayout(null);
		frmfld.setBounds(100, 90, 100, 20);
		frmfld.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		tolbl.setBounds(220, 90, 100, 20);
		tolbl.setLayout(null);
		tofld.setBounds(340, 90, 100, 20);
		tofld.setLayout(null);
		//submit
		submitbtn.setBounds(420, 120, 150, 20);
		submitbtn.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		resultArea.setBounds(100, 150, 320, 100);
		resultArea.setEditable(false);
		resultArea.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		
		srcbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser=new JFileChooser();
				fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
				FileNameExtensionFilter extensionFilter=new FileNameExtensionFilter("Xls", ".xlsx");
				fileChooser.setFileFilter(extensionFilter);
				int i=fileChooser.showOpenDialog(null);
				if(i==JFileChooser.APPROVE_OPTION) {
					File file=fileChooser.getSelectedFile();
					srcfld.setText(file.getPath());
				}
				
			}
		});
		
		
		
		
		
		frame.add(srclbl);
		frame.add(srcfld);
		frame.add(srcbtn);
		frame.add(empNoslbl);
		frame.add(empNosfld);
		frame.add(frmlbl);
		frame.add(frmfld);
		frame.add(tolbl);
		frame.add(tofld);
		frame.add(submitbtn);
		frame.add(resultArea);
		frame.setSize(600, 400);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.pack();
		frame.setResizable(false);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new SwipeOut2();
	}

}
