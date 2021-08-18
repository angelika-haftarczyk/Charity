package pl.coderslab.model.dto;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class DonationFormDto {

    String[] categories;
    Integer quantity;
    String institution;
    String address;
    String city;
    String postcode;
    String phone;
    LocalDate date;
    LocalTime time;
    String moreInfo;

}
