package Service;

import org.springframework.data.jpa.repository.JpaRepository;

import online.examination.Studentlogin;

public interface Studentlogrepo  extends JpaRepository<Studentlogin, Long> {

}
