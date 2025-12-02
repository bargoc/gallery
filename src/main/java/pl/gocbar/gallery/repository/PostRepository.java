package pl.gocbar.gallery.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pl.gocbar.gallery.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
    
Optional<Post> findByUrl(String url);

@Query("select p from Post p where p.title like concat('%', :query, '%') or p.shortDescription like concat('%', :query, '%')")
List<Post> searchPosts(String query);
}
