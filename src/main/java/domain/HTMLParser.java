package domain;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface HTMLParser {
   List<String> getDependentLinks(final String url) throws IOException;

    List<String> getStaticDependencies(String url) throws IOException;
}
