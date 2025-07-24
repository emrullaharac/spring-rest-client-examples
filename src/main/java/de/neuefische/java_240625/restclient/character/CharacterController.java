package de.neuefische.java_240625.restclient.character;

import de.neuefische.java_240625.restclient.character.dto.CharacterDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/characters")
public class CharacterController {

    private final CharacterService service;

    public CharacterController(CharacterService characterService) {
        this.service = characterService;
    }

    @GetMapping
    public List<CharacterDto> getAllCharacters() {
        return service.getAllCharacters();
    }

    @GetMapping("/{id}")
    public CharacterDto getCharacterById(@PathVariable int id) {
        return service.getCharacterById(id);
    }

    @GetMapping(params = "status")
    public List<CharacterDto> getCharactersByStatus(@RequestParam String status) {
        return service.getCharactersByStatus(status);
    }

    @GetMapping("/species-statistic")
    public int getSpeciesStatistic(@RequestParam String species) {
        return service.getAliveCharacterCountBySpecies(species);
    }
}
