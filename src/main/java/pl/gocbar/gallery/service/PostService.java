package pl.gocbar.gallery.service;

import java.util.List;

import pl.gocbar.gallery.dto.PostDto;

public interface PostService {

    List<PostDto> findAllPost();

    void createPost(PostDto postDto);

    PostDto findPostById(Long postId);

    void updatePost(PostDto postDto);

    void deletePost(Long postIdo);

    PostDto findPostByUrl(String postUrl);
}
