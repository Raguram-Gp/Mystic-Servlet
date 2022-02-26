

public class Application {
	public String firstName, lastName, email, alternateEmail, phone, dob, gender, address, profile,qualification, specification, resume;
	public int age;
    public float sslc, hsc, cgpa;

	public Application(String firstName, String lastName, String email, String alternateEmail, String phone, String dob, String age, String gender, String address, String profile, String sslc, String hsc, String qualification, String specification, String cgpa, String resume) {

		this.firstName = firstName;
        this.lastName = lastName;
		this.email = email;
        this.alternateEmail = alternateEmail;
        this.phone = phone;
        this.dob = dob;
        this.age = Integer.parseInt(age);
        this.gender = gender;
		this.address = address;
        this.profile = profile;
        this.sslc = Float.parseFloat(sslc);
        this.hsc = Float.parseFloat(hsc);
		this.qualification = qualification;
		this.specification = specification;
        this.cgpa = Float.parseFloat(cgpa);
		this.resume = resume;
	}

	public String getFirstName(){
		return this.firstName;
	}

	public String getLastName(){
		return this.lastName;
	}

	public String getGender(){
		return this.gender;
	}

	public String getEmail(){
		return this.email;
	}

	public Float getCgpa(){
		return this.cgpa;
	}

	@Override
	public String toString() {
		return "Application{" +
				", name='" + firstName + '\'' +
				", email='" + email + '\'' +
				", age=" + age +
				", mobile='" + phone + '\'' +
				", qualification='" + qualification + '\'' +
				", specification='" + specification + '\'' +
				", cgpa='" + cgpa + '\'' +
				", gender='" + gender + '\'' +
				", address='" + address + '\'' +
				'}';
	}
}
