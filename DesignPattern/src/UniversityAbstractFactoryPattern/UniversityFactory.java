package UniversityAbstractFactoryPattern;

public interface UniversityFactory {
	
	public Course createCourse();
	public Proffesor createProffesor();
	public Schedule createSchedule();
	public Syllabus createSyllabus();
	
}
