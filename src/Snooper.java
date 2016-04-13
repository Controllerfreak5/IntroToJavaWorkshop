import javax.swing.JOptionPane;

public class Snooper {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Hello! I'm Snoopy. What's your name? :D");
		JOptionPane.showMessageDialog(null, "Hey, " + name + ", you seem like a cool person!");
		String address = JOptionPane.showInputDialog("What's your address, so we can meet up sometime?");
	    String age = JOptionPane.showInputDialog("Cool. So, " + name + " , we could start talking now to get familiar with each other! What's your age?");
		String bank = JOptionPane.showInputDialog("Cool! So you're old enough to use your bank account? Could I borrow some money? Or could you give me your bank account number?");
	    JOptionPane.showMessageDialog(null, "Haha! Thanks!");
		JOptionPane.showMessageDialog(null, "You have successfully downloaded 'Trojan.exe'. With the provided information, you will soon lose access to everything you ever loved or knew.\n You live at " + address + ", you are " + age + " years old, and we now know your bank information. You are no longer " + name + ", WE ARE NOW " + name + ". HAHAHAHAH. Thanks for the info. :D");
	}
}
