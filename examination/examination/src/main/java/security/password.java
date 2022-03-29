package security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class password {
	public static void main(String[] args) {
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		String demoPassword="logpass";
		String encodePassword=encoder.encode(demoPassword);
		System.out.println(encodePassword);

	}

}
