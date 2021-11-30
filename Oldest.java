import javax.swing.*;

public class Oldest {
    // Written by Logan Dabney
    // This program checks the ages of members a family and tells which is oldest.
    public static void main(String[] args){
        JPanel panel = new JPanel();
        JTextField name = new JTextField(5);
        JTextField age = new JTextField(5);
        int confirm, realage, oldestage;
        String realname, oldestname;

        oldestage = 0;
        oldestname = "Me";

        panel.add(new JLabel("Name: "));
        panel.add(name);
        panel.add(new JLabel("Age: "));
        panel.add(age);

            while (!name.getText().equals("quit")) {
                confirm = JOptionPane.showConfirmDialog(null, panel,
                        "Oldest Calculator", JOptionPane.OK_CANCEL_OPTION);
                if (confirm == JOptionPane.OK_OPTION) {
                    realage = Integer.parseInt(age.getText());
                    realname = name.getText();

                    if (realage > oldestage) {
                        oldestage = realage;
                        oldestname = realname;
                    }

                }
            }
        JOptionPane.showMessageDialog(null,"The oldest person is " +
                oldestname + ".", "Oldest", JOptionPane.PLAIN_MESSAGE);
    }
}
