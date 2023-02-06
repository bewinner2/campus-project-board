package gaesipan_service.gaesipan_service.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link Article} entity
 */
public record ArticleDto(String title, String content, String hashtag, LocalDateTime createdAt, String createdBy,
                         LocalDateTime modifiedAt, String modifiedBy) implements Serializable {
}