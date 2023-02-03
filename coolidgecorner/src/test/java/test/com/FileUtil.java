/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.com;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Sweta
 */
public class FileUtil {

    public static CoolidgecornerVO readForm() throws Exception {

        CoolidgecornerVO coolidgecornervo = null;

        FileInputStream inputStream = new FileInputStream(new File("c:\\data1\\Coolidge.xlsx"));

        Workbook workbook = new XSSFWorkbook(inputStream);

        Sheet firstSheet = workbook.getSheetAt(0);// first tab
        //get first row(with values)
        Row r = firstSheet.getRow(0);
        Cell c = r.getCell(1); //what value
        String email = c.getStringCellValue();
        System.out.println("email=" + email);

        r = firstSheet.getRow(1);
        c = r.getCell(1); //where value
        String password = c.getStringCellValue();
        System.out.println("password=" + password);
//
//        CoolidgecornerVO coolidgelogin1 = new CoolidgecornerVO(email, password);
//        System.out.println(coolidgelogin1);
//        inputStream.close();
//        return coolidgelogin1; 

coolidgecornervo = new CoolidgecornerVO(email, password);
return coolidgecornervo;
    }
}
