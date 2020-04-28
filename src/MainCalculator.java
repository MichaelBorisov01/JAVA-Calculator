import javax.swing.*;

public class MainCalculator {
    public static void main(String[] args) {

        JMenuBar menuBar = new JMenuBar();
        JMenu helpMenu=new JMenu("?");
        JMenuItem aboutItem=new JMenuItem("About");

        Reader r=new Reader("Calculator");
        r.setContentPane(r.windowContent);
        r.pack();
        r.setVisible(true);
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        r.setResizable(false);
        r.setLocationRelativeTo(null);

        r.setJMenuBar(menuBar);
        helpMenu.add(aboutItem);
        menuBar.add(helpMenu);

        aboutItem.addActionListener(arg0 -> JOptionPane.showMessageDialog(r, "Program: calculator\nProgrammer: Borisov Michael\n" +
                "Programming language: JAVA\nVersion: 1.0","Info Message",JOptionPane.INFORMATION_MESSAGE));
    }
}
