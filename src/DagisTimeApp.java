import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author P-O Edqvist
 *
 */
public class DagisTimeApp {

	/*
	 * 2DO
	 * enter a name of period 1
	 * enter numberOfDaysInPeriod
	 * enter a schedule person 1
	 * enter a schedule person 2
	 * 
	 * show the minimum care-time needed
	 */
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String periodName = JOptionPane.showInputDialog("Namn på period 1");
		try {
			int numberOfDaysInPeriod = Integer.parseInt(
					JOptionPane.showInputDialog("Antal dagar i period 1"));
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		
	}
	
	/*
	 * enter nameOfDay
	 */
	public static void enterSchedule(){
		
	}
}
