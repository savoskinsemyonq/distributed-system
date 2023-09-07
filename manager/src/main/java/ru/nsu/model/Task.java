package ru.nsu.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Task {
    private String hash;
    private int maxLength;
}
