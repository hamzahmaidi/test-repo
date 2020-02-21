import java.awt.* ; 
import java.awt.event.* ;
import java.io.* ; 
public class MyActionListenerForOpen implements ActionListener{
	MyFrameAWT f ; 
	public MyActionListenerForOpen(MyFrameAWT f){
		this.f =f ; 
	}
	public void actionPerformed(ActionEvent e){
		FileDialog fd =new FileDialog(f) ; 
		fd.setVisible(true) ; 
		String nomFichier = fd.getFile(); 
		String repFichier = fd.getDirectory() ; 
		String nomComplet =repFichier+ nomFichier ; 
		System.out.println("Nom du fichier : "+ nomFichier) ;
		System.out.println("Repertoire du fichier : " + repFichier) ;
		System.out.println("Nom Complet : "+nomComplet); 
		File file = new File(nomComplet) ; 
		int size = (int) file.length() ; 
		System.out.println("Taille du fichier : "+size) ; 
		try {
			FileInputStream in = new FileInputStream(file) ;
			byte data[] = new byte[size] ; 
			in.read(data) ;
			String s= new String(data) ; 
			f.ta.setText(s) ;  
		}
		catch(FileNotFoundException e2 ){
			System.out.println(e2) ;
		}
		catch(IOException e3){
			System.out.println(e3) ; 
		}
	}
}