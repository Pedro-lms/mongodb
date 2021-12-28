package com.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collation = "user")
public class User implements Serializable {
    static final long serialVersionUID =1L;

    @Id
    Long id;
    String name;
    String email;
}
