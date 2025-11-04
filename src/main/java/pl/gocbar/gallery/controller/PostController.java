package pl.gocbar.gallery.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import pl.gocbar.gallery.dto.PostDto;
import pl.gocbar.gallery.service.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PostController {
    
    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/admin/posts")
    public String posts(Model model) {
        List<PostDto> posts = postService.findAllPost();
        model.addAttribute("posts", posts);
        return "/admin/posts";
    }
}
