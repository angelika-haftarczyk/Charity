package pl.coderslab.model;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Institution extends BaseEntity{

    private String name;
    private String description;
}
