/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.motorph.payroll.util;

/**
 *
 * @author Charles
 */
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.List;

public class CSVReaderTest {

    @Test
    public void testReadCSV() {
        CSVReader csvReader = new CSVReader();
        List<String[]> data = csvReader.readCSV("src/main/resources/data/employee_data.csv");

        // Verify the number of rows (including header)
        assertEquals(35, data.size());  // Adjust if you have more or fewer rows

        // Verify the first row (header)
        assertEquals("Employee #", data.get(0)[0]);
        assertEquals("Last Name", data.get(0)[1]);
        assertEquals("First Name", data.get(0)[2]);
        assertEquals("Birthday", data.get(0)[3]);
        assertEquals("Address", data.get(0)[4]);
        assertEquals("Phone Number", data.get(0)[5]);
        assertEquals("SSS #", data.get(0)[6]);
        assertEquals("Philhealth #", data.get(0)[7]);
        assertEquals("TIN #", data.get(0)[8]);
        assertEquals("Pag-ibig #", data.get(0)[9]);
        assertEquals("Status", data.get(0)[10]);
        assertEquals("Position", data.get(0)[11]);
        assertEquals("Immediate Supervisor", data.get(0)[12]);
        assertEquals("Basic Salary", data.get(0)[13]);
        assertEquals("Rice Subsidy", data.get(0)[14]);
        assertEquals("Phone Allowance", data.get(0)[15]);
        assertEquals("Clothing Allowance", data.get(0)[16]);
        assertEquals("Gross Semi-monthly Rate", data.get(0)[17]);
        assertEquals("Hourly Rate", data.get(0)[18]);

        // Verify the second row (first employee)
        assertEquals("10001", data.get(1)[0]);
        assertEquals("Garcia", data.get(1)[1]);
        assertEquals("Manuel III", data.get(1)[2]);
        assertEquals("10/11/1983", data.get(1)[3]);

        // Stripping the quotes from the address field
        assertEquals("Valero Carpark Building Valero Street 1227, Makati City", data.get(1)[4].replace("\"", ""));

        assertEquals("966-860-270", data.get(1)[5]);
        assertEquals("44-4506057-3", data.get(1)[6]);
        assertEquals("820126853951", data.get(1)[7]);
        assertEquals("442-605-657-000", data.get(1)[8]);
        assertEquals("691295330870", data.get(1)[9]);
        assertEquals("Regular", data.get(1)[10]);
        assertEquals("Chief Executive Officer", data.get(1)[11]);
        assertEquals("N/A", data.get(1)[12]);
        assertEquals("90,000", data.get(1)[13]);
        assertEquals("1,500", data.get(1)[14]);
        assertEquals("2,000", data.get(1)[15]);
        assertEquals("1,000", data.get(1)[16]);
        assertEquals("45,000", data.get(1)[17]);
        assertEquals("535.71", data.get(1)[18]);
    }
}

