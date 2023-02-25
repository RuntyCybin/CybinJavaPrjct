package com.cybin.cybinOrg;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "usersid")
    @GeneratedValue( strategy= GenerationType.IDENTITY )
    private Long id;

    private String usersname;

    @ManyToOne
    @JoinColumn(name = "roleid")
    private Role roleid;
}
