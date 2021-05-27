import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven {

//Identify Testcases coloum by scanning the entire 1st row
//once coloumn is identified then scan entire testcase coloum to identify purcjhase testcase row
//after you grab purchase testcase row = pull all the data of that row and feed into test

public ArrayList<String> getData(String testcaseName) throws IOException
{
//fileInputStream argument
ArrayList<String> a=new ArrayList<String>();

//XSSFWorkbook will accept only FileInputStream argument so you need to wrap you file as fileinputstream and then pass it
FileInputStream fis = new FileInputStream("C:\\Users\\shmounik\\Documents\\demodata.xlsx");

XSSFWorkbook workbook = new XSSFWorkbook(fis);		// first getting hold of work book so creating obj of class of XSSFWrokbok class and we need to send the location of excel file 
int sheets=workbook.getNumberOfSheets();
for(int i=0;i<sheets;i++)
{
if(workbook.getSheetName(i).equalsIgnoreCase("testdata"))
{
XSSFSheet sheet=workbook.getSheetAt(i);
//Identify Testcases coloum by scanning the entire 1st row

Iterator<Row>  rows= sheet.iterator();// sheet is collection of rows
Row firstrow= rows.next();
Iterator<Cell> ce=firstrow.cellIterator();//row is collection of cells
int k=0;
int coloumn = 0;
while(ce.hasNext())
{
Cell value=ce.next();

if(value.getStringCellValue().equalsIgnoreCase("TestCases"))
{
coloumn=k;

}

k++;
}
System.out.println(coloumn);

////once coloumn is identified then scan entire testcase coloum to identify purcjhase testcase row
while(rows.hasNext())
{

Row r=rows.next();

if(r.getCell(coloumn).getStringCellValue().equalsIgnoreCase(testcaseName))
{

////after you grab purchase testcase row = pull all the data of that row and feed into test

Iterator<Cell>  cv=r.cellIterator();
while(cv.hasNext())
{
Cell c= cv.next();
if(c.getCellTypeEnum()==CellType.STRING)
{

a.add(c.getStringCellValue());
}
else{

a.add(NumberToTextConverter.toText(c.getNumericCellValue()));

}
}
}


}









}
}
return a;

}

public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub

}

}