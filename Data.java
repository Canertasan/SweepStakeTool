/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nike.run.club;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author canertasan
 */
public class Data {
    static public ArrayList<Person> PersonData=new ArrayList<>();
    static public PathInterface pi = new PathInterface();
    
    public static void UpdatePersonList(){
         try {
            
            String fileName=Data.pi.pathText.getText();
            System.out.println(fileName);
            FileReader inFile = new FileReader(fileName);
            BufferedReader inStream = new BufferedReader(inFile);
            String InstaNameText;

            PersonData.clear();
            while ((InstaNameText = inStream.readLine()) != null) {
                 PersonData.add(new Person(InstaNameText));
            }
            inStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
      
    
}
