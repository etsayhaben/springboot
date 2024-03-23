package com.example.second.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Assignment {
      @Id
      @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;                   //the assignment has id
    private String status;   //is submitted, pendending. in review, needs update,completed,
    private String githubUrl;
    private String branch; 
    private String codeReviewVideoUrl;
    @ManyToOne(optional = false)
    private User user;


}
