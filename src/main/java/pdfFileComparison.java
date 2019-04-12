import de.redsix.pdfcompare.CompareResult;
import de.redsix.pdfcompare.PdfComparator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.IOException;

public class pdfFileComparison
{
    public static void main(String[] args) throws IOException {

       // WebDriver driver = new SafariDriver();

         // note : Add pdf file compare maven dependency
        // link : https://mvnrepository.com/artifact/de.redsix/pdfcompare/1.1.26
        // git Link : https://github.com/red6/pdfcompare

        String file1 = "/Users/mehul/Documents/PDFfileCompare/doc1.pdf";
        String file2 = "/Users/mehul/Documents/PDFfileCompare/doc2.pdf";
        String resultFile = "/Users/mehul/Downloads/PDFfileCompare/src/Result/result";


        new PdfComparator(file1, file2).compare().writeTo(resultFile);

        System.out.println("√ File compare successfully");

//        boolean isEquals = new PdfComparator(file1, file2).compare().writeTo(resultFile);
//        if (!isEquals) {
//            System.out.println("Differences found!"+ true);
//        }



    }
}
