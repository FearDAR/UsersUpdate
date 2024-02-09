package com.example.service.user.db;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@SequenceGenerator(name = "user_id_seq", sequenceName = "user_id_seq", allocationSize = 1)
@Data
@NoArgsConstructor
public class User {
    /**
     * Unique user ID.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_sequence")
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
