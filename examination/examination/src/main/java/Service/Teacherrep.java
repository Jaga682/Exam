package Service;

import org.springframework.data.jpa.repository.JpaRepository;

import online.examination.Teacherbean;

public interface Teacherrep extends JpaRepository<Teacherbean, Long> {

}
