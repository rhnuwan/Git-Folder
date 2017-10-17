
package support;

import java.io.File;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EXConnection {

    public DB db;
    public XSSFWorkbook workbook;

    
    public XSSFWorkbook EXConnection(){
        char c = File.separatorChar;
    String FILE_NAME = "src/../data/Data_Collection.xlsx";
    FILE_NAME = FILE_NAME.replace("/", "" + c);
    FILE_NAME = FILE_NAME.replace("\\", "" + c);

    workbook = new XSSFWorkbook(); 
    
    return workbook;
    }
    
    
    
}
