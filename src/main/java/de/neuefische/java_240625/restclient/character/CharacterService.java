package de.neuefische.java_240625.restclient.character;

import de.neuefische.java_240625.restclient.character.client.RickAndMortyClient;
import de.neuefische.java_240625.restclient.character.dto.CharacterDto;
import de.neuefische.java_240625.restclient.character.dto.MultiCharacterDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CharacterService {

    private final RickAndMortyClient client;

    public CharacterService(RickAndMortyClient client) {
        this.client = client;
    }

    public List<CharacterDto> getAllCharacters() {
        MultiCharacterDto characters = client.getAllCharacters();
        return characters.results();
    }

    public CharacterDto getCharacterById(int id) {
        return getAllCharacters().stream()
                .filter(c -> c.id() == id)
                .findFirst()
                .orElse(null);
    }

    public List<CharacterDto> getCharactersByStatus(String status) {
        return getAllCharacters().stream()
                .filter(c -> c.status().equalsIgnoreCase(status))
                .collect(Collectors.toList());
    }

    public int getAliveCharacterCountBySpecies(String species) {
        return getAllCharacters().stream()
                .filter(c -> c.status().equalsIgnoreCase("Alive"))
                .filter (c -> c.species().equalsIgnoreCase(species))
                .toList()
                .size();
    }

}
