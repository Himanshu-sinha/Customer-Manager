package com.manager.customer.customermanager.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SourceType;
import org.hibernate.annotations.UpdateTimestamp;


import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerid;
    @Size(min=2, message="First name should have at least 2 characters")
    private String firstname;
    @Size(min=2, message="Last name should have at least 2 characters")
    private String lastname;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;
    private String streetAddress;
    private String city;
    private String state;
    private String zip;
    @Email(message = "The email address is invalid.", flags = { Pattern.Flag.CASE_INSENSITIVE })
    private String email;
    @Size(min=10, message="PhoneNumber should have at least 10 characters")
    private String phone;
    @UpdateTimestamp(source = SourceType.DB)
    private Instant lastUpdatedOn;
    @CreationTimestamp(source = SourceType.DB)
    private Instant createdOn;

    public Customer(String firstname, String lastname, LocalDate dateOfBirth, String streetAddress, String city, String state, String zip, String email, String phone) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;
        this.phone = phone;
        this.lastUpdatedOn = lastUpdatedOn;
        this.createdOn = createdOn;
    }

    // Getters and setters
}
