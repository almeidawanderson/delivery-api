package br.com.springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "foods" )
@Table(name = "foods")  
public class Food {

  @Id @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String title;

  private String image;

  private Integer price;


  
}
