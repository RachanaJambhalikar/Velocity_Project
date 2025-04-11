package com.example.entity;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long userId;

	    private String firstName;
	    private String lastName;
	    private int age;
	    private String city;

	    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	    private List<Claim> claims;

		public Long getUserId() {
			return userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public List<Claim> getClaims() {
			return claims;
		}

		public void setClaims(List<Claim> claims) {
			this.claims = claims;
		}

		@Override
		public String toString() {
			return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
					+ ", city=" + city + ", claims=" + claims + "]";
		}
}
