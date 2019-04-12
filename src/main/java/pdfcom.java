import de.redsix.pdfcompare.CompareResult;
import de.redsix.pdfcompare.PdfComparator;

import java.io.IOException;

public class pdfcom
{

    public static void main(String[] args) throws IOException {

        // WebDriver driver = new SafariDriver();

        // note : Add pdf file compare maven dependency
        // link : https://mvnrepository.com/artifact/de.redsix/pdfcompare/1.1.26
        // git Link : https://github.com/red6/pdfcompare

        String file1 = "/Users/mehul/Documents/PDFfileCompare/doc1.pdf";
        String file2 = "/Users/mehul/Documents/PDFfileCompare/doc2.pdf";
        String resultFile = "/Users/mehul/Downloads/PDFfileCompare/src/Result/result";



        final CompareResult result = new PdfComparator(file1, file2).compare();
        if (result.isNotEqual()) {
            System.out.println("Differences found!");
        }
        if (result.isEqual()) {
            System.out.println("No Differences found!");
        }
        if (result.hasDifferenceInExclusion()) {
            System.out.println("Only Differences in excluded areas found!");
        }


    }
}
