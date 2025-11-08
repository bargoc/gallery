package pl.gocbar.gallery.mapper;

import pl.gocbar.gallery.dto.PostDto;
import pl.gocbar.gallery.entity.Post;

public class PostMapper {

    // Map Post to PostDto
    public static PostDto mapToPostDto(Post post) {
        PostDto postDto = new PostDto(post.getId(), post.getTitle(), post.getUrl(), post.getContent(),
                post.getShortDescription(), post.getCreatedOn(), post.getUpdatedOn()); 
        return postDto;
    }

    // map PostDto to Post
    public static Post mapToPost(PostDto postDto) {
        Post post = new Post(postDto.getId(), postDto.getTitle(), postDto.getUrl(), postDto.getContent(),
                postDto.getShortDescription(), postDto.getCreatedOn(), postDto.getUpdatedOn());
        return post;
    }
}
