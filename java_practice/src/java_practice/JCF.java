package java_practice;

import java.io.*; 
import java.awt.event.*; 
import java.util.Random;
import javax.swing.*;
import java.util.*;

public class JCF  {
    static JTextField textfield;
    static JTextField typeList;
    static String choice= "none";
    public static LinkedList <Integer> list=new LinkedList<>();
    
    public static void main(String args[]) throws IOException {
        JFrame frame = new JFrame("JCF implementation with Stack and Queue");
        textfield=new JTextField();
        typeList=new JTextField();
        Random random = new Random();

        JLabel l1 = new JLabel("Dharmendra Gangwar");
    JLabel l2 = new JLabel("1000015012");

        for(int i=0;i<10;i++)list.add(random.nextInt()%100);
        textfield.setText("LinkedList -> "+list.toString());
        typeList.setText("Linked List");
        frame.add(textfield);
        textfield.setBounds(30,100, 370,30);
        typeList.setBounds(50,140,330,30);
        JButton stack =new JButton("Stack");
        stack.setBounds(60, 180, 130, 50);
        JButton queue=new JButton("Queue");
        queue.setBounds(250, 180,120,50);
        JButton push=new JButton("Push");
        push.setBounds(35,250,80,50);
        JButton pop =new JButton("Pop");
        pop.setBounds(125,250,80,50);
        JButton add =new JButton("Add");
        add.setBounds(230,250,80,50);
        JButton delete =new JButton("Delete");
        delete.setBounds(320,250,80,50);
        l1.setBounds(60,300,150,50);
        l2.setBounds(250,300,150,50);

        frame.setSize(550, 500) ;
        frame.setLayout(null);
    
        stack.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                    choice="stack";
                    typeList.setText("Stack Implementation");  
            }  
            });
        queue.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                choice ="queue";
                typeList.setText("Queue Implementation");  
            }  
            }); 
        push.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(choice!="stack") {
                    typeList.setText("Firstly choose Stack option !");
                }
                else {
                    int x=random.nextInt()%100;
                    typeList.setText("Stack Implementation :- Pushed element -> "+x);
                    push(x);
                    textfield.setText("LinkedList -> "+list.toString());
                }
            }
        });
        pop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(choice!="stack") {
                    typeList.setText("Firstly choose Stack option !");
                }
                else {
                    int x=pop();
                    if(x==-101)typeList.setText("Stack Implementation :- Stack Underflow !");
                    else typeList.setText("Stack Implementation :- Poped element -> "+x);
                    textfield.setText("LinkedList -> "+list.toString());
                }
            }
        });
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(choice!="queue") {
                    typeList.setText("Firstly choose Queue option !");
                }
                else {
                    int x=random.nextInt()%100;
                    typeList.setText("Queue Implementation :- Added element -> "+x);
                    add(x);
                    textfield.setText("LinkedList -> "+list.toString());
                }
            }
        });
        delete.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if(choice!="queue") {
                        typeList.setText("Firstly choose Queue option !");
                    }
                    else {
                        int x=delete();
                        if(x==-101)typeList.setText("Queue Implementation :- Empty Queue !");
                        else typeList.setText("Queue Implementation :- Deleted element -> "+x);
                        textfield.setText("LinkedList -> "+list.toString());
                    }
        }});
        frame.add(stack);
        frame.add(queue);
        frame.add(push);
        frame.add(pop);
        frame.add(add);
        frame.add(delete);
        frame.add(textfield);
        frame.add(typeList);
        frame.add(l1);
    frame.add(l2);

        
        frame.setVisible(true);
    }
    public static void push(int x) {
        list.add(x);
    }
    public static int pop() {
        if(list.size()==0)return -101;
        else return list.removeLast();
    }
    public static void add(int x) {
        list.add(x);
    }
    public static int delete() {
        if(list.size()==0)return -101;
        else return list.removeFirst();
    }
}

