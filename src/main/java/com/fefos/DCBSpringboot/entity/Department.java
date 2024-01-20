package com.fefos.DCBSpringboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long departmentId;
    @NotNull(message =  "Please add department name")
    @Length(max = 5, min = 2)
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
