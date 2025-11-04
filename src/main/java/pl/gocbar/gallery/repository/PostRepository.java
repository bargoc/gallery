package pl.gocbar.gallery.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.gocbar.gallery.entity.Post;




public interface PostRepository extends JpaRepository<Post, Long> {
    
Optional<Post> findByUrl(String url);

}
