package com.collecton2.Collection2;

import java.io.FileReader;
import java.util.List; 
import java.util.ArrayList;
import com.opencsv.*; 
public class App 
{
    private static final String CSV_FILE_PATH 
        = "C:\\Users\\stepa\\OneDrive\\Рабочий стол\\Учебные материалы\\foreign_names.csv"; 
    public static void readAllDataAtOnce(String file) 
    { 
    	try { 
    		
    		//Чтение таблицы в csvReader
            FileReader filereader = new FileReader(file);
            CSVReader csvReader = new CSVReader(filereader); 
            String[] nextRecord; 
            
            //Запись элементов в список
            List<String[]> allData = new ArrayList<>();
            while ((nextRecord = csvReader.readNext()) != null)
            { 
                allData.add(nextRecord);
            } 
            
            //Вывод элементов списка
            for (String[] row : allData) { 
                for (String cell : row) { 
                    System.out.print(cell + "\t"); 
                } 
                System.out.println(); 
            } 
        } 
        catch (Exception e) { 
            e.printStackTrace(); 
        } 
    } 
    
    public static void main(String[] args) 
    {  
        readAllDataAtOnce(CSV_FILE_PATH); 
    }
    
    
    
}
