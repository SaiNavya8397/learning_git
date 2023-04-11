package githubpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	FileInputStream fi;



    FileOutputStream fo;



    XSSFWorkbook book;



    XSSFSheet sht;



    XSSFRow row;



    XSSFCell cell;



   // String path=".\\TestData\\Multi_Language_Data (1).xlsx";



   



   public void Access_To_Work_Book(String SheetName, String path)



   {



       try

       {

           FileInputStream file=new FileInputStream(path);



           book=new XSSFWorkbook(file);



           sht=book.getSheet(SheetName);

           

       } 

       catch (FileNotFoundException e)

       {

           e.printStackTrace();

       } 

       catch (IOException e)

       {

           e.printStackTrace();

       }



   }



   public int getrowcount()

   {

       return sht.getLastRowNum();

   }



   public String getcelldata(int row, int col)

   {

       return sht.getRow(row).getCell(col).getStringCellValue();

   }

   

   public int Get_Row_Number_Of_Key(String Key_Name) {

       int Key_Row_Number = 0;



       for (int i = 0; i < sht.getLastRowNum(); i++) {



           if (Key_Name.equals(sht.getRow(i).getCell(0).getStringCellValue())) {



               break;



           }



           Key_Row_Number = Key_Row_Number + 1;

       }



       return Key_Row_Number;

   }

   

   public int Get_Column_Number_Of_Key(String Key_Name) {

       int Key_Column_Number = 0;



       for (int i = 0; i < sht.getRow(0).getLastCellNum(); i++) {



           if (Key_Name.equals(sht.getRow(0).getCell(i).getStringCellValue())) {



               break;



           }



           Key_Column_Number = Key_Column_Number + 1;

       }



       return Key_Column_Number;

   }

   

   public String Get_String_Data_From_Sheet(int Get_Row_Number_Of_Key, int Get_Column_Number_Of_Key)

   {

       return sht.getRow(Get_Row_Number_Of_Key).getCell(Get_Column_Number_Of_Key).getStringCellValue();

       

   }

   

   public double Get_Numeric_Data_From_Sheet(int Get_Row_Number_Of_Key, int Get_Column_Number_Of_Key)

   {

       

       return sht.getRow(Get_Row_Number_Of_Key).getCell(Get_Column_Number_Of_Key).getNumericCellValue();

       

   }

}
