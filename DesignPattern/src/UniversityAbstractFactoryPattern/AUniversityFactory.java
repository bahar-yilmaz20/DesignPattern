package UniversityAbstractFactoryPattern;

public class AUniversityFactory implements UniversityFactory {
	@Override
	public Course createCourse() {
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
