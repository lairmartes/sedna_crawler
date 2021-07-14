package infrastructure;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import process.HTMLParser;

import java.io.IOException;
import java.util.Set;
import java.util.stream.Collectors;


public class JSoupHTMLParser implements HTMLParser {

    @Override
    public Set<String> getDependentLinks(final String url) throws IOException {

        final Document doc = Jsoup.connect(url).get();
        final Elements links = doc.select("a[href]");

        return links.stream().map(link -> link.attr("abs:href")).collect(Collectors.toSet());
    }

    @Override
    public Set<String> getStaticDependencies(final String url) throws IOException {
        final Document doc = Jsoup.connect(url).get();
        final Elements medias = doc.select("[src]");

        return medias.stream().map(media -> media.attr("abs:src")).collect(Collectors.toSet());
    }
}
