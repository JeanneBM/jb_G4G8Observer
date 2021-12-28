import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class View extends JFrame implements ActionListener {

    private Model model;
    private JButton deutschButton;
    private JButton polishButton;
    private JButton spanishButton;
    private JButton goodbyeButton;

    public View(Model model) {
        super("Welcomes");

        this.model = model;

        deutschButton = new JButton("Deutsch");
        polishButton = new JButton("Polish");
        spanishButton = new JButton("Spanish");
        goodbyeButton = new JButton("Goodbye!");

        setLayout(new GridBagLayout());

        GridBagConstraints gcd = new GridBagConstraints();
        gcd.anchor = GridBagConstraints.CENTER;
        gcd.gridx=1;
        gcd.gridy=1;
        gcd.weightx=1;
        gcd.weighty=1;
        gcd.fill=GridBagConstraints.NONE;

        add(deutschButton, gcd);

        GridBagConstraints gcp = new GridBagConstraints();
        gcp.anchor = GridBagConstraints.CENTER;
        gcp.gridx=1;
        gcp.gridy=2;
        gcp.weightx=1;
        gcp.weighty=1;
        gcp.fill=GridBagConstraints.NONE;

        add(polishButton, gcp);

        GridBagConstraints gc = new GridBagConstraints();
        gc.anchor = GridBagConstraints.CENTER;
        gc.gridx=1;
        gc.gridy=3;
        gc.weightx=1;
        gc.weighty=1;
        gc.fill=GridBagConstraints.NONE;

        add(spanishButton, gc);

        gc.anchor = GridBagConstraints.CENTER;
        gc.gridx=1;
        gc.gridy=4;
        gc.weightx=1;
        gc.weighty=1;
        gc.fill=GridBagConstraints.NONE;

        add(goodbyeButton, gc);

        deutschButton.addActionListener(this);
        polishButton.addActionListener(this);
        spanishButton.addActionListener(this);
        goodbyeButton.addActionListener(this);

        goodbyeButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Sorry to see you go.");
            }

        });

        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton source = (JButton)e.getSource();

        if(source == deutschButton) {
            System.out.println(" ");
            System.out.println("Guten Tag! Ich heiße Asia. Auf Wiedersehen!");
        }
        if(source == polishButton) {
            System.out.println(" ");
            System.out.println("Czesc!Czesc! Mam na imie Asia. Do zobaczenia!");
        }
        if(source == spanishButton) {
            System.out.println(" ");
            System.out.println("Hola! Mi nombre es Asia. Hasta La Vista!");
        }
        else {
            System.out.println("Some other button.");
        }

    }

}