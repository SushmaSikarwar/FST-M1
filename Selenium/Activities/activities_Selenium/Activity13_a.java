package activities_Selenium;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class Activity13_a {

    public static void main(String[] args) throws IOException, CsvException {

        String s = System.setProperty("webdriver.gecko.driver", "/Users/sushma/Documents/geckodriver");

        //Load CSV file
        CSVReader reader = new CSVReader(new FileReader("/Users/sushma/Documents/Projects Code/FST-M1/sample.csv"));

        //Load content into list
        List<String[]> list = reader.readAll();
        System.out.println("Total number of rows are: " + list.size());

        //Create Iterator reference
        Iterator<String[]> itr = list.iterator();

        //Iterate all values
        while(itr.hasNext()) {
            String[] str = itr.next();

            System.out.print("Values are: ");
            for(int i=0;i<str.length;i++) {
                System.out.print(" " + str[i]);
            }
            System.out.println(" ");
        }
        reader.close();
    }
}
