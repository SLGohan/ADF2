package IOExercise;
import java.io.FileInputStream;


public class ChangeText {
		
		public static void main(String[] args) {
		ChangeText ct = new ChangeText();
		ct.getText("Tested.txt");
	}
		
		public void getText(String fileName) {
			try(
				FileInputStream is = new FileInputStream(fileName);
					) {
				int c;				
				while(( c = is.read()) != -1){
				c +=3;
				System.out.println((char)c);
								
				}		
				is.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

}

