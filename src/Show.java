import javax.swing.*;
import java.awt.event.*;

public class Show {
    private JPanel panel1;
    private JLabel label;
    private JButton menuButton;
    private JScrollPane scrollPane;
    private static JFrame frame;
    private static String start="<html><body>";
    private static String text;
    private static String end="</body></html>";
    private static File f;
    private String[][] allBook;




    public Show(String i) {

        this.setAllBook(f.books(i));
        for(int k=0; k<allBook.length; k++) {
            text += "Title: " + allBook[k][0] + "<br>" + "Author: " + allBook[k][1] + "<br>" + "ISBN: " + allBook[k][2] + "<br>" + "Language: " + allBook[k][3] + "<br><br>";
        }
        label.setText(start + text + end);
        text = "";

        allBook = null;
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {

                label.setText("");
                frame.dispose();
            }
        });


    }

    public  void ShowD() {
        frame  = new JFrame("Show");
        frame.setContentPane(this.panel1);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500,500);
    }


    public void setAllBook(String[][] allBook) {
        this.allBook = allBook;
    }
}
