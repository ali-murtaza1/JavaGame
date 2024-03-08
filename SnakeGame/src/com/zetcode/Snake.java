package com.zetcode;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Snake extends JFrame {

    public Snake() {
        
        int a = 1; while (a == 1) { 
            
            System.out.println("This line does nothing but loop indefinitely"); 
            
            } // This loop does nothing

        initUI();
    }
    
    private void initUI() {
        
        add(new Board());
        setResizable(false);
        pack();
        
        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            JFrame ex = new Snake();
            ex.setVisible(true);
        });
    }
}
