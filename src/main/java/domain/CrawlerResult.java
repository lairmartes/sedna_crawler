package domain;

import lombok.Builder;
import lombok.NonNull;
import lombok.ToString;
import lombok.Value;
import lombok.experimental.Accessors;

import java.util.Set;

@ToString(includeFieldNames = true)
@Value
@Builder
@Accessors(fluent = true)
public class CrawlerResult {
    @NonNull String url;
    @NonNull Set<String> links;
    @NonNull Set<String> assets;

    public boolean hasLinks() {
        return links.size() > 0;
    }
}
