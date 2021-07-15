package cli;

import domain.CrawlerResult;
import infrastructure.JSoupHTMLParser;
import process.WebCrawlerFlow;

import java.util.List;

public class SimpleCrawlerReport {
    public static void main(String[] args) {

        final WebCrawlerFlow process = new WebCrawlerFlow(new JSoupHTMLParser());

        System.out.println("*************************************************");
        System.out.println("***       Starting crawling and report        ***");
        System.out.println("*************************************************");

        final List<CrawlerResult> results = process.getLinksAndAssets("https://sedna.com");

        results.forEach(result -> {
            printDivisor();
            System.out.println("  Web Page: " + result.url());
            printDivisor("Assets");
            result.assets().forEach(SimpleCrawlerReport::printItem);
            printDivisor("Links");
            result.links().forEach(SimpleCrawlerReport::printItem);
        });

    }

    public static void printDivisor(final String title) {
        System.out.println("--------------------------------------------------------------");
        System.out.println(" >> " + title );
        System.out.println("--------------------------------------------------------------");

    }

    public static void printDivisor() {
        System.out.println("********************************************************");
    }

    public static void printItem(final String item) {
        System.out.println(" + " + item);
    }
}
