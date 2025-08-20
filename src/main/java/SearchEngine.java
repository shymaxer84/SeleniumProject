import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.swing.text.Document;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class SearchEngine {
    public static void main(String[] args) throws IOException {

        // get the keyword
        Scanner scan = new Scanner(System.in);
        System.out.println("Please provide the keyword");
        String keyword = scan.nextLine();

        //search engine
        String url = "https://www.google.com/search"+"?q="+keyword;

       org.jsoup.nodes.Document doc =  Jsoup.connect(url).get();
       String html = doc.html();
        Files.write(Paths.get("C:\\Users\\yanad\\OneDrive\\Рабочий стол\\getData.txt"),html.getBytes());
       Elements links = doc.select("cite");
       for (Element link : links)
           System.out.println(link.text());
        scan.close();
    }





}
