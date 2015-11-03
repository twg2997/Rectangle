import javax.swing.JOptionPane;
public class SwitchCaseWelcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userRole = "";
		userRole = JOptionPane.showInputDialog("Please select your role.");
			switch(userRole) {
				case "Administrator":
					JOptionPane.showMessageDialog(null, "Welcome " + userRole + ".");
					break;
				
				case "Faculty":
					JOptionPane.showMessageDialog(null, "Welcome " + userRole + ".");
					break;
				
				case "Staff":
					JOptionPane.showMessageDialog(null, "Welcome " + userRole + ".");
					break;
				
				case "Student":
					JOptionPane.showMessageDialog(null, "Welcome " + userRole + ".");
					break;
				
				case "Guest":
					JOptionPane.showMessageDialog(null, "Welcome " + userRole + ".");
					break;
					
				default:
					JOptionPane.showMessageDialog(null, "Invalid selection.");
					
			
		}
		
		
		
		
		
		}
		

	}

