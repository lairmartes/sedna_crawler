package infrastructure;

import domain.HTMLParser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;


public class JSoupHTMLParser implements HTMLParser {

    @Override
    public List<String> getDependentLinks(String url) throws IOException {

        final Document doc = Jsoup.connect(url).get();
        final Elements links = doc.select("a[href]");

        return links.stream().map(link -> link.attr("abs:href")).collect(Collectors.toList());
    }

    @Override
    public List<String> getStaticDependencies(String url) throws IOException {
        final Document doc = Jsoup.connect(url).get();
        final Elements medias = doc.select("[src]");

        return medias.stream().map(media -> media.attr("abs:src")).collect(Collectors.toList());
    }
}
