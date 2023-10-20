package com.wgu.travelapp.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="divisions")
@Getter
@Setter
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "division_id")
    private long id;
    @Column(name = "division")
    private String division_name;
    @CreationTimestamp
    @Column(name = "create_date")
    private Date create_date;
    @UpdateTimestamp
    @Column(name = "last_update")
    @JsonProperty("last_update")
    private Date last_Update;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id", nullable = false, insertable = false,updatable = false)
    private Country country;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "division")
    private Set<Customer> customers = new HashSet<>();

   @Column(name = "Country_ID")
    private Long country_id;
   public void setCountry(Country country) {
       setCountry_id(country.getId());
       this.country =country;
   }
}
