package process;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface HTMLParser {
   Set<String> getDependentLinks(final String url) throws IOException;

    Set<String> getStaticDependencies(final String url) throws IOException;
}
