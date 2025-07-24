package de.neuefische.java_240625.restclient.github;

import de.neuefische.java_240625.restclient.github.dto.GithubUserDto;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class GithubClient {
    private final RestClient restClient;

    public GithubClient(RestClient.Builder restClientBuilder) {
        this.restClient = RestClient.builder()
                .baseUrl("https://api.github.com")
                .build();
    }

    public GithubUserDto getUserByUsername(String username) {
        return restClient.get()
                .uri(String.format("/users/%s",username))
                .retrieve()
                .body(GithubUserDto.class);
    }
}
