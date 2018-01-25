import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;

public class HelloSwing extends JFrame {
	public HelloSwing() {
		
		JLabel lblNewLabel = new JLabel("Hello, Swing!!");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 27));
		getContentPane().add(lblNewLabel, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("New button");
		getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("New button");
		getContentPane().add(btnNewButton_1, BorderLayout.EAST);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
