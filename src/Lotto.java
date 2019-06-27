import java.util.Random;

import javax.swing.JOptionPane;

public class Lotto {
	public static void main(String[] args) {
		
		int num0 = 0;
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		
		Random s = new Random ();
		num0 = s.nextInt(10);
		num1 = s.nextInt(10);
		num2 = s.nextInt(10);
		num3 = s.nextInt(10);
		num4 = s.nextInt(10);
		
		JOptionPane.showMessageDialog(null, " "+num0+" "+num1+" "+num2+" "+num3+" "+num4+" ");
		
		
		
	}

}
