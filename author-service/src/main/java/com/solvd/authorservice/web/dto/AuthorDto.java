package com.solvd.authorservice.web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;

public record AuthorDto(

        @JsonProperty(access = JsonProperty.Access.READ_ONLY)
        Long id,

        @NotBlank(message = "Name can't be blank!")
        String name,

        @NotBlank(message = "Surname can't be blank!")
        String surname

) {
}
