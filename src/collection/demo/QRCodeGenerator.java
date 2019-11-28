package collection.demo;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;



public class QRCodeGenerator {

	
	public static void main(String[] args) throws IOException {
		
		String details = "Aditi Singh : Mrigank Sonik : Java";
		
		ByteArrayOutputStream out = QRCode.from(details).to(ImageType.JPG).stream();
		
		File file = new File("C:\\softwares\\Test.jpg");
		FileOutputStream fos = new FileOutputStream(file);
		
		fos.write(out.toByteArray());
		fos.flush();
	}
}
