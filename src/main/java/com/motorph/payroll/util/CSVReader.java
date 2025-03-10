/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.motorph.payroll.util;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    public List<String[]> readCSV(String filePath) {
        List<String[]> data = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = parseCSVLine(line);
                data.add(values);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    private String[] parseCSVLine(String line) {
        List<String> values = new ArrayList<>();
        boolean insideQuotes = false;
        StringBuilder currentValue = new StringBuilder();

        for (char c : line.toCharArray()) {
            if (c == '"') {
                // Handle quotes
                insideQuotes = !insideQuotes;
            } else if (c == ',' && !insideQuotes) {
                // If we're not inside quotes, treat comma as separator
                values.add(currentValue.toString().trim());
                currentValue.setLength(0); // Reset currentValue for next field
            } else {
                // Otherwise, append the character to the current value
                currentValue.append(c);
            }
        }
        
        // Add the last value if any
        values.add(currentValue.toString().trim());
        
        return values.toArray(new String[0]);
    }
}


