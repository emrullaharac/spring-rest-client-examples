package de.neuefische.java_240625.restclient.github.dto;

public record GithubUserDto(
        String login,
        String name,
        String html_url,
        String avatar_url,
        int public_repos
) {}
