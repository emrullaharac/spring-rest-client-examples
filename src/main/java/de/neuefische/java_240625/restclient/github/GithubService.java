package de.neuefische.java_240625.restclient.github;

import de.neuefische.java_240625.restclient.github.dto.GithubUserDto;
import org.springframework.stereotype.Service;

@Service
public class GithubService {

    private final GithubClient githubClient;

    public GithubService(GithubClient githubClient) {
        this.githubClient = githubClient;
    }

    public GithubUserDto getUserByUsername(String username) {
        return githubClient.getUserByUsername(username);
    }
}
