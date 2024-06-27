import javax.swing.SwingUtilities;

public class SwingUtilitiesExample {
    public static void main(String[] args) {
    	SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("hello`");
			}
    		
    	});
    }}
       