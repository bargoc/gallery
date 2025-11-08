package pl.gocbar.gallery.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import pl.gocbar.gallery.dto.PostDto;
import pl.gocbar.gallery.entity.Post;
import pl.gocbar.gallery.mapper.PostMapper;
import pl.gocbar.gallery.repository.PostRepository;
import pl.gocbar.gallery.service.PostService;

@Service
public class PostServiceImpl implements PostService {

private PostRepository postRepository;


    public PostServiceImpl(PostRepository postRepository) {
    this.postRepository = postRepository;
}

    @Override
   public List<PostDto> findAllPost() {
       List<Post> posts = postRepository.findAll();
       return posts.stream().map(PostMapper :: mapToPostDto).collect(Collectors.toList());
    } 
    
    @Override
    public void createPost(PostDto postDto) {
        Post post = PostMapper.mapToPost(postDto);
        postRepository.save(post);
    }

    /* public List<Post> findAllPost() {
        List<Post> posts = postRepository.findAll();
        return posts;
        //posts.stream().map(PostMapper :: mapToPostDto).collect(Collectors.toList());
     } */
}
