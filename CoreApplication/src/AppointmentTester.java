
public class AppointmentTester {
	public static void main(String[] args) {
		Appointment a=new Appointment();
		a.p_id=101;
		a.p_name="raju";
		a.application_id=1222;
		a.appointment_date="12-09-2024";
		a.appointment_time="10:20AM";
		
		System.out.println(a.p_id);
		System.out.println(a.p_name);
		System.out.println(a.application_id);
		System.out.println(a.appointment_date);
		System.out.println(a.appointment_time);
	}

}
