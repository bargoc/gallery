package pl.gocbar.gallery.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import pl.gocbar.gallery.dto.PostDto;
import pl.gocbar.gallery.service.PostService;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BlogController {

    private PostService postService;

    public BlogController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public String viewBlogPosts(Model model) {
        List<PostDto> postsResponse = postService.findAllPost();
        model.addAttribute("postsResponse", postsResponse);
        return "blog/view_posts";
    }

}
