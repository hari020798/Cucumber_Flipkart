package org.Properties;

import java.io.IOException;

public class FileReadManager {
	
	private FileReadManager() {
	}
	
	public static FileReadManager getInstance() {
FileReadManager helper = new FileReadManager();
return helper;
	}
	
	public ConfigrationReader getInstanceCR() throws IOException {
ConfigrationReader reader = new ConfigrationReader();
return reader;
	}
	
	}


