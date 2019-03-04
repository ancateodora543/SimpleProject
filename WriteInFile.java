import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;





public class WriteInFile extends TestProblema{
	public void writeFile() throws IOException {
		Writer bw = null;
		try {
				File file = new File(super.getLine());
				FileOutputStream fos = new FileOutputStream(file);
				bw = new BufferedWriter(new OutputStreamWriter(fos));
		        bw.write(super.getInput());
		} catch (IOException e) {
			System.out.println("Eroare in timpul scrierii in fisier");
			return;
		}
		finally {
			bw.close();
		}
		
		

	}
	
}

