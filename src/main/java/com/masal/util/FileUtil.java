package com.masal.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Yeganeh on 5/15/16.
 */
public class FileUtil {

    public static ArrayList readFromFile(String fileName) {
        ArrayList l1 = new ArrayList();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\Saleh\\Project\\Tract\\target\\Tract\\WEB-INF\\classes\\com\\masal\\util\\user-pass"));
            String str = bufferedReader.readLine();
            while (str != null) {
                l1.add(str);
                str = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("There is a probleam in reading file.");
        }

        return l1;
    }
}
