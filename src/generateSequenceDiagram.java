import net.sourceforge.plantuml.*;
import java.io.*;
public class generateSequenceDiagram {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(OutputStream png = new FileOutputStream("C:\\Users\\chris.kleb\\test.png")){
		 String source = "@startuml\n";
		 source += "Bob -> Alice : hello\n";
		 source += "@enduml\n";

		 SourceStringReader reader = new SourceStringReader(source);
		 // Write the first image to "png"
		 String desc = reader.generateImage(png);
		 // Return a null string if no generation
	
	    }catch (IOException ioException){
	        ioException.printStackTrace();
}
}
}