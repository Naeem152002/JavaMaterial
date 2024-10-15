package com.dto;






import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginDto {
	private int id;

	private String name;
	
	@NotEmpty(message = "Email is required")
	@Email(message = "Invalid email format")
	private String email;
	
	private String mobile;
	
	@NotEmpty(message = "Password is required")
	@Size(min = 8, message = "Password must be at least 8 characters")
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$", message = "Password must contain at least one digit, one lowercase, one uppercase letter, and one special character")
	private String password;
	
	private long otp;
	private String status="inactive";
}
