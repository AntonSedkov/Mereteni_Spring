package by.anthony.mereteni.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Student {

    @Id
    private long id;

    @Column
    private String name;
}
