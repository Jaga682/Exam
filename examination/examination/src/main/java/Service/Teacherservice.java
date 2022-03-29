package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.examination.Teacherbean;


@Service
public class Teacherservice {
	@Autowired
	Teacherrep repo;
	
	public List<Teacherbean>ListAll()
	{
		return repo.findAll();
	}
	public void save(Teacherbean  teacherbean)
	{
		repo.save(teacherbean);
	}
	public Teacherbean get(long id)
	{
		return repo.findById((long) id).get();
	}
	public void delete(long id)
	{
		repo.deleteById(id);
	}


}
