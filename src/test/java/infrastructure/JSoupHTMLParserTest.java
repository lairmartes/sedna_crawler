package infrastructure;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class JSoupHTMLParserTest {

    //TODO: Provide Mock connection to test parser
    @Test
    void getDependentLinks() throws IOException {
        JSoupHTMLParser out = new JSoupHTMLParser();

        out.getDependentLinks("https://sedna.com/company/leadership-team/").stream().filter(link -> link.startsWith("https://sedna.com")).forEach(System.out::println);
    }

    @Test
    void getStaticDependencies() throws IOException {
        JSoupHTMLParser out = new JSoupHTMLParser();

        out.getStaticDependencies("https://www.sedna.com").forEach(System.out::println);
    }
}