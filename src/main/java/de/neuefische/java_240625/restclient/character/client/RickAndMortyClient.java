package de.neuefische.java_240625.restclient.character.client;

import de.neuefische.java_240625.restclient.character.dto.MultiCharacterDto;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class RickAndMortyClient {

    private final RestClient restClient;

    public RickAndMortyClient(RestClient.Builder restClientBuilder) {
        this.restClient = restClientBuilder
                .baseUrl("https://rickandmortyapi.com/api")
                .build();
    }

    public MultiCharacterDto getAllCharacters() {
        MultiCharacterDto result = restClient.get()
                .uri("/character")
                .retrieve()
                .body(MultiCharacterDto.class);
        return result;
    }
}
