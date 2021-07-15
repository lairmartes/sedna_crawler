package process;

import domain.CrawlerResult;
import domain.UnableToAccessRequestedURL;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class WebCrawlerFlow {

    private final HTMLParser htmlParser;
    private final Set<String> visitedURLs;
    private final List<CrawlerResult> crawlerResults;

    private static final String HTTPS = "https://";

    public WebCrawlerFlow(final HTMLParser htmlParser) {
        this.htmlParser = htmlParser;
        this.visitedURLs = new HashSet<>();
        this.crawlerResults = new LinkedList<>();
    }

    public List<CrawlerResult> getLinksAndAssets(final String url) {

        final List<CrawlerResult> result = new LinkedList<>();
        final List<String> urlsAlreadyVisited = new LinkedList<>();

        crawlURLs(url, new HashSet() {{ add(url); }});

        return crawlerResults;
    }

    private void crawlURLs(final String baseURL, final Set<String> URLs) {
        URLs.removeAll(this.visitedURLs);
        if (!URLs.isEmpty()) {
            final Set<String> newURLs = new HashSet<>();
            this.visitedURLs.addAll(URLs);
            URLs.forEach(url -> {
                final CrawlerResult currentCrawlerResult = creteCrawlerResult(baseURL, url);
                this.crawlerResults.add(currentCrawlerResult);
                newURLs.addAll(currentCrawlerResult.links());

            });
            crawlURLs(baseURL, newURLs);
        }
    }

    private CrawlerResult creteCrawlerResult(final String baseUrl, final String url) {

        //:TODO - Use Logger to show this message
        System.out.println("Url being requested: " + url);

        try {
            final Set<String> links = htmlParser.getDependentLinks(url)
                                                .stream()
                                                .map(link -> link.replaceFirst("\\?.*$",""))
                                                .filter(link -> link.contains(baseUrl.replace(HTTPS, "")))
                                                .collect(Collectors.toSet());
            return CrawlerResult.builder().url(url).assets(htmlParser.getStaticDependencies(url)).links(links).build();

        } catch (IOException e) {
            return CrawlerResult.builder().url(url).assets(new HashSet<>()).links(new HashSet<>()).build();
        }
    }
}
