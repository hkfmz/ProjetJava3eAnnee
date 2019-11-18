
package inventorysoftware.LogIn;

/**
 *
 * @author 
 */
public class MinFrame {
 
    public static void main(String[] args) {
        SpalshScreen screen = new SpalshScreen();
        NewSignin sign = new NewSignin();
        screen.setVisible(true);
        try {
            for (int row = 0; row <=100; row++) {
                Thread.sleep(100);
                screen.loadingnumber.setText(Integer.toString(row)+"%");
                screen.loadingprogress.setValue(row);
                if (row == 100) {
                    
                    screen.setVisible(false);
                    sign.setVisible(true);
                }
            }
        } catch (Exception e) {
        }
        
        /*df*/
        
    }
}
