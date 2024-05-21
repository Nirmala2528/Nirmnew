package com.Api;

import java.io.FileReader;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Execution {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		FileReader fileReader =new FileReader(new File("C:\\Users\\windows\\eclipse-workspace\\Test\\src\\main\\resources\\Smple.json"));
		ObjectMapper objectMapper = new ObjectMapper();
		Root readValue =objectMapper.readValue(fileReader,Root.class);
		System.out.println(readValue.getId());
		System.out.println(readValue.getName());
		System.out.println(readValue.getPpu());
		System.out.println(readValue.getType());
	//	System.out.println(readValue.getBatters());
		
		
		
		
	}

}
