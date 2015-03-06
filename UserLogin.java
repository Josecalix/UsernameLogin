 import javax.swing.JOptionPane;

 public class UserLogin
 {
	public static void main(String[] args) 
	{
		String username,username1, password, password1;
		
		 username = JOptionPane.showInputDialog("Create a user name");
		 password = JOptionPane.showInputDialog("Create a password");		
		 username1 = JOptionPane.showInputDialog("Enter your user name");
		 password1 = JOptionPane.showInputDialog("Enter your password");

		if (username.equals(username1) && password.equals(password1)) 
		{
			JOptionPane.showMessageDialog(null,"Welcome " + username + " !"); 
			}
		else
			JOptionPane.showMessageDialog(null,"Wrong username or password. Try again !");
		
		
		System.exit(0);
	}
 }

