package com.wgu.travelapp.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

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
    @Column(name = "create_date")
    @CreationTimestamp
    private Date createDate;
    @Column(name = "last_update")
    @UpdateTimestamp
    private Date lastUpdate;

    //TODO check relationship
    @ManyToOne
    @JoinColumn(name ="country", nullable = false)
    private Country country;
}
