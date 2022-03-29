package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.examination.Studentlogin;
import online.examination.Teacherbean;

@Service
public class StudService {
@Autowired
Studentlogrepo rep;

public List<Studentlogin>ListAll()
{
	return rep.findAll();
}
public void save(Studentlogin login)
{
	rep.save(login);
}
public Studentlogin get(long id)
{
	return rep.findById((long) id).get();
}
public void delete(long id)
{
	rep.deleteById(id);
}

}
