import javax.swing.*;

public class gui {
    private JPanel panel;
    private JTextArea textArea1;
    private JScrollPane scroll;
    private JButton file;

    public static void main(String[] args) {
        JFrame frame = new JFrame("gui");
        frame.setContentPane(new gui().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
