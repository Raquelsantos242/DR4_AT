package infnet.selenium;

public class App 
{
    public static void main(String[] args) {
        Document pdf = new PdfDocument();
        Document html = new HtmlDocument();
        Document unknown = new UnknownDocument();

        pdf.print();
        html.print();
        unknown.print();
    }
}
