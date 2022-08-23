
package devbridgetask;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DevBridgeTask {

    public static void main(String[] args) {
        String file = "Input.txt";
        checker c = new checker(file);
        try {
            c.startProcessing();
        } catch (FileNotFoundException ex) {
            System.out.println("File was not found");
            Logger.getLogger(DevBridgeTask.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
