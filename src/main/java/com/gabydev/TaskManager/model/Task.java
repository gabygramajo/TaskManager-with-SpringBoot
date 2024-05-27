package com.gabydev.TaskManager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// lombok
@Data // ->  @Getter, @Setter, @ToString, @EqualsAndHashCode y @RequiredArgsConstructor (constructor con argumentos requeridos).
@AllArgsConstructor // -> constructor con todos los argumento
@NoArgsConstructor // -> constructor sin argumentos
// hibernate
@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String status;
}
