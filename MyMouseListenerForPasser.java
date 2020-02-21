import java.awt.* ; 
import java.awt.event.* ;

public class MyMouseListenerForPasser implements MouseMotionListener  {
	MyFrameAWT f ; 
	public MyMouseListenerForPasser(MyFrameAWT f){
		this.f = f ; 
	}
	/*public void mouseExited(MouseEvent e){
		System.out.println("BIEN") ; 
	} 
	public void mouseEntered(MouseEvent e ){
				System.out.println("BIEN2") ; 

	}
	public void mouseReleased(MouseEvent e){
		System.out.println("BIEN3") ; 
	}
	public void mousePressed(MouseEvent e){
		System.out.println("BIEN3") ; 
	} 
	public void mouseClicked(MouseEvent e){
		System.out.println("BIEN3") ; 
	}*/
	public void mouseDragged(MouseEvent e){
		System.out.println("BIEN3") ; 
		f.ta.setText("Drag réussi "); 

	}
	public void mouseMoved(MouseEvent e){
		//System.out.println("BIEN2") ; 
	}
}