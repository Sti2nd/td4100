package logger;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class StreamLogger {
	
	StreamLogger(OutputStream stream){
		BufferedOutputStream bufferOut = new BufferedOutputStream(stream);
		try {
			bufferOut.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	setFormatString(String formatString){
		
	}

}
