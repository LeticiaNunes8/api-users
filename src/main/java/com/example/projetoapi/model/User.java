package com.example.projetoapi.model;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement
public class User {

    private Long id;
    private String name;
    private String email;

}
