
package SevenSegmentComponent;
import java.awt.*; 

/**
 *
 * @author Ernest
 */
public class SevenSegment extends Component{
    
    
    public synchronized void paint(Graphics g) { 
        g.setColor(Color.WHITE);
        g.fillRect(20, 0, 80, 20); //0
        g.fillRect(100, 20, 20, 80); //1
        g.fillRect(100, 120, 20, 80); //2
        g.fillRect(20, 200, 80, 20); //3
        g.fillRect(0, 120, 20, 80); //4
        g.fillRect(0, 20, 20, 80); //5
        g.fillRect(20, 100, 80, 20); //6
        g.fillRect(120, 200, 20, 20); //7
        
    } 
    public synchronized void paint1(Graphics g){

        
    }
}
