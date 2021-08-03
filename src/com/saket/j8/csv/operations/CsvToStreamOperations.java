package com.saket.j8.csv.operations;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;

public class CsvToStreamOperations {
 
	public static void main(String[] args) {
		try {
			List<String[]> csvFile = readAll();
			String[] first = csvFile.get(0);
			for(String e : first) {
				System.out.println(e);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static List<String[]> readAll() throws Exception {
		List<String[]> csvFile = new ArrayList<>();
		try(CSVReader csvReader  = new CSVReader(new FileReader("Diabetes.csv"));){
			csvFile = csvReader.readAll();
			csvReader.close();
		}
	    return csvFile;
	}
}
