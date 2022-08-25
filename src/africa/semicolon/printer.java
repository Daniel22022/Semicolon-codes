package africa.semicolon;

    import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.PrintServiceAttribute;
import javax.print.attribute.standard.PrinterName;



public class printer {
        public static void main(String[] args) {

            try {

                String s = "Hello";

                // byte[] by = s.getBytes();
                DocFlavor flavor = DocFlavor.STRING.TEXT_PLAIN;
                PrintService pservice = PrintServiceLookup.lookupDefaultPrintService();
                DocPrintJob job = pservice.createPrintJob();
                Doc doc = new SimpleDoc(s, flavor, null);
                job.print(doc, null);

            } catch (PrintException e) {
                e.printStackTrace();
            }
        }
    }


