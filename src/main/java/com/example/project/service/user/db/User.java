package com.example.project.service.user.db;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@SequenceGenerator(name = "users_id_seq", sequenceName = "users_id_seq", allocationSize = 1)
@Data
@NoArgsConstructor
public class User {
    /**
     * Unique user ID.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_id_seq")
    @SequenceGenerator(name = "users_gen", sequenceName = "users_id_seq")
    private long id;

    /**
     * Username.
     */
    @Column(name = "first_name")
    private String firstName;

    /**
     * User last name.
     */
    @Column(name = "last_name")
    private String lastName;

    /**
     * User's middle name.
     */
    @Column(name = "middle_name")
    private String middleName;

}
