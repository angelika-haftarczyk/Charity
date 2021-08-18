package pl.coderslab.model;


import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Category extends BaseEntity {

    private String name;
}
