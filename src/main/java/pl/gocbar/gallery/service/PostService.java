package pl.gocbar.gallery.service;

import java.util.List;

import pl.gocbar.gallery.dto.PostDto;
import pl.gocbar.gallery.entity.Post;

public interface PostService {
    
    List<PostDto> findAllPost();
   // List<Post> findAllPost(); 

   void createPost(PostDto postDto);
}
