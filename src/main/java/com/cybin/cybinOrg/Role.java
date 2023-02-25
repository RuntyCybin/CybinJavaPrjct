package com.cybin.cybinOrg;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USERROLES")
public class Role {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column(name = "roleid")
    private Long id;

    private String rolename;
}
