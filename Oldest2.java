import javax.swing.JOptionPane;

public class Oldest2 {
    // Written by Logan Dabney 2/19/18
    // This programs finds the older person out of the names and ages
    // that were enter by the user.
    public static void main(String[] args) {
        int age, oldAge;
        String inputAge, inputName, oldName;
        inputName = "Hi";
        oldAge = 0;
        oldName = "Name";

        while (!inputName.equals("quit")) {
            inputName = JOptionPane.showInputDialog(null,
                    "What is the name?");

            if (!inputName.equals("quit")) {
                inputAge = JOptionPane.showInputDialog(null,
                        "What is their age?");
                age = Integer.parseInt(inputAge);
                if (age > oldAge) {
                    oldAge = age;
                    oldName = inputName;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "The oldest person is " +
                oldName + ".", "Result", JOptionPane.PLAIN_MESSAGE);
    }
}

