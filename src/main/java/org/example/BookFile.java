package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BookFile {
    public void read() {
        try
        {
            File file = new File("./data/example.xlsx"); //creating a new file instance

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
