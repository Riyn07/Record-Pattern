package org.example;

import lombok.Builder;

@Builder
public record Library(String nombre, Book bestSeller) {

}
