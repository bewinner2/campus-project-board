package gaesipan_service.gaesipan_service.repository;

import gaesipan_service.gaesipan_service.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentRepository extends  JpaRepository<ArticleComment, Long>{
}
