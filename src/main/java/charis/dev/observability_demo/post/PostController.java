package charis.dev.observability_demo.post;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
@RequiredArgsConstructor
public class PostController {
    private final JsonPlaceholderService jsonPlaceholderService;

    @GetMapping("")
    List<Post> fingAll() {
        return jsonPlaceholderService.findAll();
    }

    @GetMapping("/{id}")
    Post fingById(@PathVariable("id") Long id) {
        return jsonPlaceholderService.fingById(id);
    }
}
