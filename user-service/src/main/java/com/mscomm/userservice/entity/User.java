package com.mscomm.userservice.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
@Entity
@Table(name = "users")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    private String password;
	    @Column(nullable = false, unique = true)
	    private String email;
	    private String seat;
	    private String datetime;
	    private String price;
	    private String theatreId = "1";
	    private String movieId = "107";
	    private String restatus = "false";
	    
}