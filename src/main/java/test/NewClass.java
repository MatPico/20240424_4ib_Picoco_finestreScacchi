
package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Definizione della classe principale
public class NewClass extends JFrame 
{
    
    // Costruttore della classe
    public NewClass() 
    {
        // Impostazione del titolo della finestra
        setTitle("Scacchi");
        // Chiusura dell'applicazione quando la finestra viene chiusa
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Impostazione delle dimensioni della finestra
        setSize(400, 300);
        
        // Creazione dei pulsanti
        JButton tutorialButton = new JButton("Tutorial");
        JButton reButton = new JButton("Re");
        JButton pedoneButton = new JButton("Pedone");
        JButton giocaButton = new JButton("Gioca");
        JButton closeButton = new JButton("Chiudi");
        
        // Creazione di un font per i pulsanti
        Font buttonFont = new Font("Arial", Font.PLAIN, 10);
        // Impostazione del font per tutti i pulsanti
        tutorialButton.setFont(buttonFont);
        reButton.setFont(buttonFont);
        pedoneButton.setFont(buttonFont);
        giocaButton.setFont(buttonFont);
        closeButton.setFont(buttonFont);
        
        // Impostazione delle dimensioni per tutti i pulsanti
        Dimension buttonSize = new Dimension(100, 30);
        tutorialButton.setPreferredSize(buttonSize);
        reButton.setPreferredSize(buttonSize);
        pedoneButton.setPreferredSize(buttonSize);
        giocaButton.setPreferredSize(buttonSize);
        closeButton.setPreferredSize(buttonSize);
        
        // Aggiunta degli action listener per i pulsanti
        tutorialButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                openTutorialWindow();
            }
        });
        
        reButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                openReWindow();
            }
        });
        
        pedoneButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                openPedoneWindow();
            }
        });
        
        giocaButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                openGiocaWindow();
            }
        });
        
        closeButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                closeProgram();
            }
        });
        
        // Creazione di un pannello per contenere i pulsanti
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1, 10, 10)); // Impostazione del layout a griglia
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Aggiunta di spaziatura
        // Aggiunta dei pulsanti al pannello
        panel.add(tutorialButton);
        panel.add(reButton);
        panel.add(pedoneButton);
        panel.add(giocaButton);
        panel.add(closeButton);
        
        // Aggiunta del pannello alla finestra
        getContentPane().add(panel);
        // Rende la finestra visibile
        setVisible(true);
    }
    
    // Metodo per aprire la finestra di tutorial
    private void openTutorialWindow() 
    {
        JOptionPane.showMessageDialog(this, "Finestra tutorial");
    }
    
    // Metodo per aprire la finestra del re
    private void openReWindow() 
    {
        JOptionPane.showMessageDialog(this, "Finestra re");
    }
    
    // Metodo per aprire la finestra del pedone
    private void openPedoneWindow() 
    {
        JOptionPane.showMessageDialog(this, "Finestra pedone");
    }
    
    // Metodo per aprire la finestra di gioco
    private void openGiocaWindow() 
    {
        // Creazione di una casella di testo e un pulsante nella finestra di gioco
        JTextField inputField = new JTextField();
        JButton confirmButton = new JButton("Invio");
        
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(2, 1));
        inputPanel.add(inputField);
        inputPanel.add(confirmButton);
        
        confirmButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                // Ottieni il testo inserito dall'utente e mostra un messaggio di dialogo con esso
                String userInput = inputField.getText();
                if (userInput != null && !userInput.isEmpty()) 
                {
                    JOptionPane.showMessageDialog(NewClass.this, "Hai inserito: " + userInput);
                } 
                else 
                {
                    JOptionPane.showMessageDialog(NewClass.this, "Nessun dato inserito.");
                }
            }
        });
        
        inputField.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                // Non fare nulla quando viene premuto Invio sulla casella di testo
            }
        });
        
        // Mostra la finestra di gioco con la casella di testo e il pulsante
        JOptionPane.showMessageDialog(this, inputPanel, "Inserisci Dato", JOptionPane.PLAIN_MESSAGE);
    }
    
    // Metodo per chiudere il programma
    private void closeProgram() 
    {
        dispose();
    }
    
    // Metodo principale per avviare il programma
    public static void main(String[] args) 
    {
        // Avvia l'applicazione Swing all'interno di un thread
        SwingUtilities.invokeLater(new Runnable() 
        {
            public void run() {
                new NewClass();
            }
        });
    }
}


