package com.luish.ventanaboton;

import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import javax.swing.*;

/**
 * Hola
 *
 * @author Luis
 */
public class VentanaBotonEscuchador extends JFrame implements ActionListener {

    JPanel panelBoton;
    JLabel etiqueta;
    JButton boton;

    public VentanaBotonEscuchador() {
        etiqueta = new JLabel();
        panelBoton = new JPanel();
        boton = new JButton("Pulsa aquí");
        panelBoton.add(boton);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(etiqueta, "North");
        this.getContentPane().add(panelBoton, "South");
        boton.addActionListener(this);
        this.setSize(300, 100);
        this.setTitle("Ejemplo de un botón con Evento 2");
        this.show();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        etiqueta.setText("Botón Pulsado: " + new Date());
    }

    public static void main(String[] args) {
        new VentanaBotonEscuchador();
    }
}
