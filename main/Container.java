package meuJogo.main;

import meuJogo.fase.Fase;

import javax.swing.*;

public class Container extends JFrame {


    public Container() {
        add ( new Fase () );

        setTitle ( "StarPlay" );
        // ImageIcon icone = new ImageIcon ( "d:\\pubg.png" );
        //this.setIconImage ( icone.getImage () );
        setSize ( 1366 , 768 );
        setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        setLocationRelativeTo ( null );
        this.setResizable ( true );
        setVisible ( true );
    }

    public static void main(String[] args) {
        new Container ();
    }
}
