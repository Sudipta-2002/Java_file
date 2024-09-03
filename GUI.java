import javax.swing.JOptionPane;
public class GUI {
    public static void main(String arg[])
    {
    String name=JOptionPane.showInputDialog("Enter your name: ");
    JOptionPane.showMessageDialog(null,"Hello "+name);
    int age=Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
    JOptionPane.showMessageDialog(null,"your age is "+age);
    double salary=Double.parseDouble(JOptionPane.showInputDialog("Enter your salary: "));
    JOptionPane.showMessageDialog(null,"your salary is "+salary);
    }
}
