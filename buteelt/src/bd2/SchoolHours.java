package bd2;
public class SchoolHours {
	    // Function to calculate maximum hours per day for primary school
	    public static int primarySchoolMaxHours() {
	        int primarySchoolDailyHours = 0;
	        for (int i = 1; i <= 10; i++) {
	            if (i <= 3) {
	                primarySchoolDailyHours += 4; // 1-3 дугаар ангид 4 цагийн хичээл
	            } else if (i <= 8) {
	                primarySchoolDailyHours += 7; // 4-8 дугаар ангид 7 цагийн хичээл
	            } else {
	                primarySchoolDailyHours += 6; // 9-10 дугаар ангид 6 цагийн хичээл
	            }
	        }
	        return primarySchoolDailyHours;
	    }

	    // Function to calculate maximum hours per day for secondary school
	    public static int secondarySchoolMaxHours() {
	        int secondarySchoolDailyHours = 0;
	        for (int i = 1; i <= 5; i++) {
	            secondarySchoolDailyHours += 4; // 1-5 дугаар ангид 4 цагийн хичээл
	        }
	        for (int i = 6; i <= 12; i++) {
	            secondarySchoolDailyHours += 6; // 6-12 дугаар ангид 6 цагийн хичээл
	        }
	        return secondarySchoolDailyHours;
	    }

	    public static void main(String[] args) {
	        // Calculate maximum hours per day for primary and secondary schools
	        int primaryMaxHours = primarySchoolMaxHours() / 3; // Convert minutes to hours
	        int secondaryMaxHours = secondarySchoolMaxHours() / 3; // Convert minutes to hours

	        // Print the results
	        System.out.println("Primary School Maximum Hours per Day: " + primaryMaxHours);
	        System.out.println("Secondary School Maximum Hours per Day: " + secondaryMaxHours);
	    }
	}

