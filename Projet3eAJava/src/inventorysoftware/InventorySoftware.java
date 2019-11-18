

package inventorysoftware;

import inventorysoftware.LogIn.NewSignin;
import inventorysoftware.LogIn.SpalshScreen;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.UIManager;
import javax.swing.Timer;


public class InventorySoftware{
    
    public void playSound(String soundName) {
        try {
            
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
            SpalshScreen screen = new SpalshScreen();
        NewSignin sign = new NewSignin();
        screen.setVisible(true);
        
        
        try 
        {
            
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
        
        }
    }
    

