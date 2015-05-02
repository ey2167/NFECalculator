import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class NFEDriver {
	public static void main(String[]args)throws FileNotFoundException{
		
	/**
	 * Calculator is now created 
	 */
NFEGui calculator = new NFEGui();
/**
 * setting title
 */
calculator.setTitle("NewFireEmblemStatCalc");
/**
 * setting calculator to visible
 */
calculator.setVisible(true);
/**
 * setting the size of the Calculator
 */
calculator.setSize(300,300);

}
}