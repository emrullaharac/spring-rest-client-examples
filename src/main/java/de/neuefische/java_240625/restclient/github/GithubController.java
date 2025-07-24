package de.neuefische.java_240625.restclient.github;

import de.neuefische.java_240625.restclient.github.dto.GithubUserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/github")
public class GithubController {
    private final GithubService githubService;

    public GithubController(GithubService githubService) {
        this.githubService = githubService;
    }

    @GetMapping("/{username}")
    public GithubUserDto getUserByUsername(@PathVariable String username) {
        return githubService.getUserByUsername(username);
    }
}
