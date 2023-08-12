package java_practice;

	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JTextField;
	import java.io.*;
	import java.net.Socket;
	class A extends JFrame implements ActionListener
	{
	JButton jb1;
	JTextField jt1, jt2;
	JLabel lbl;
	Socket soc;
	//Dr. Bharti Sharma, SOC, Networking
	DataOutputStream toServer;
	DataInputStream fromServer;
	A()
	{
	jt1 = new JTextField();
	jt1.setBounds(90, 50, 150, 30);
	add(jt1);
	jt2 = new JTextField();
	jt2.setBounds(90, 80, 150, 30);
	add(jt2);
	lbl = new JLabel("Result :");
	lbl.setBounds(90, 140, 150, 30);
	add(lbl);
	jb1 = new JButton("+");
	jb1.setBounds(90, 200, 100, 30);
	add(jb1);
	//Dr. Bharti Sharma, SOC, Networking
	jb1.addActionListener(this);
	setLayout(null);
	setSize(600, 400);
	setVisible(true);
	try
	{
	System.out.println("Client is started ");
	soc= new Socket ("localhost",9800) ;
	toServer = new DataOutputStream(soc.getOutputStream());
	fromServer = new DataInputStream(soc.getInputStream());
	}
	catch(Exception e)
	{
	}
	//Dr. Bharti Sharma, SOC, Networking
	}
	public void actionPerformed(ActionEvent e)
	{
	try
	{
	toServer.writeUTF(jt1.getText());
	System.out.println(jt1.getText());
	toServer.writeUTF(jt2.getText());
	System.out.println(jt2.getText());
	int c= fromServer.readInt();
	System.out.println(c);
	if (e.getSource().equals(jb1))
	{
	lbl.setText(Integer.toString(c));
	}
	}
	catch(Exception e1)
	//Dr. Bharti Sharma, SOC, Networking
	{
	}
	}
	}
	class K
	{
	public static void main(String[] args)
	{
	new A();
	}
	}

