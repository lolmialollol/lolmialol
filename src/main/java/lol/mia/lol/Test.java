package lol.mia.lol;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Test {

	
	public static void main(String[] args) throws IOException {
		
		String url ="http://www.nipa.kr/board/boardList.it";
		
		Document doc = Jsoup.connect(url).get();
		System.out.println(doc.toString());
	/*	System.out.println(doc);*/
		
		Elements elements = doc.select("li");
		
	
		for (Element element : elements) {
			String title = element.attr("title");
			String href = element.absUrl("href");
			System.out.println(element.text());
		}
/*		
		System.out.println(elements);*/
	}
}
