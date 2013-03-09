import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 
 */

/**
 * @author Badwolf
 *
 */
public class MODEplayer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("Frame Demo") ;
		
		JLabel emptyLabel = new JLabel("") ;
		frame.getContentPane().add( emptyLabel, BorderLayout.CENTER ) ;
		frame.pack();
		
		frame.setVisible( true ) ;
		

	}

}
