package UniversityAbstractFactoryPattern;

public class BUniversityFactory implements UniversityFactory{

	@Override
	public Course createCourse() {
		// TODO Auto-generated method stub
		return new Course();
	}

	@Override
	public Proffesor createProffesor() {
		// TODO Auto-generated method stub
		return new Proffesor();
	}

	@Override
	public Schedule createSchedule() {
		// TODO Auto-generated method stub
		return new Schedule();
	}

	@Override
	public Syllabus createSyllabus() {
		// TODO Auto-generated method stub
		return new Syllabus();
	}

}
