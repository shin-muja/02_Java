package edu.kh.io.pack2.run;

import edu.kh.io.pack2.model.service.ByteService;

public class Run {
	public static void main(String[] args) {
		ByteService service = new ByteService();
		
		// service.fileByteOutput();
		// service.fileByteInput2();
		// service.bufferedFileByteInput();
		service.fileCopy();
	}
}
