package com.example.service.user.db;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class User {
    /**
     * Unique user ID.
     */
    @Id
    private int id;

    /**
     * Username.
     */
    @Column(name = "first_name")
    private String firstName;

    /**
     * User last name.
     */
    @Column(name = "second_naeme")
    private String lastName;

    /**
     * User's middle name.
     */
    @Column(name = "middle_name")
    private String middleName;

}
