package pl.coderslab.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@Entity
public class Donation extends BaseEntity{

    private Integer quantity;
    // @ ?
    @OneToMany
    private List<Category> categories;
    //@ ?
    @ManyToOne
    private Institution institution;
    private String street;
    private String city;
    private String zipCode;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate pickUpDate;
    private LocalTime pickUpTime;
    private String pickUpComment;

}
