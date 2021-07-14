package process;

import domain.CrawlerResult;
import infrastructure.JSoupHTMLParser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class WebCrawlerFlowTest {

    private HTMLParser htmlParser;

    private WebCrawlerFlow out;

    @BeforeEach
    public void setup() {
        this.htmlParser = new JSoupHTMLParser();
        this.out = new WebCrawlerFlow(this.htmlParser);
    }

    @Test
    public void getLinksAndAssets() {
        final List<CrawlerResult> worked =  out.getLinksAndAssets("https://sedna.com");

        worked.forEach(result -> System.out.println(result));
    }

}