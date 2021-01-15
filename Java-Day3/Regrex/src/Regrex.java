import java.util.regex.*; 

public class Regrex {
	public static boolean isValidFirstName(String finame) 
    { 
        String fname = "^[A-Z][A-Za-z]{2,}"; 
        Pattern fnme = Pattern.compile(fname);
        if (finame == null) { 
            return false; 
        } 
        Matcher m1 = fnme.matcher(finame);
        return m1.matches();
    } 
	public static boolean isValidLastName(String laname ) 
    { 
        String lname = "^[A-Z][A-Za-z]{2,}"; 
        Pattern lnme = Pattern.compile(lname); 
        if (laname == null) { 
            return false; 
        } 
        Matcher m2 = lnme.matcher(laname);
        return m2.matches(); 
    } 
	public static boolean isValidMail(String mail) 
    { 
        String email = "^(?=.*[A-Z])(?=.*[0-9])[-_.#@/]{2}([a-z]?).{8,}$"; 
        Pattern emil = Pattern.compile(email); 
        if (mail == null) { 
            return false; 
        } 
        Matcher m3 = emil.matcher(mail);
        return m3.matches();
    } 
	
	public static boolean isValidNo(String no) 
    { 
        String mobile = "^(\\d{0,9}[\\s]?)?\\d{10}$"; 
        Pattern mob = Pattern.compile(mobile); 
        if (no == null) { 
            return false; 
        } 
  
        Matcher m4 = mob.matcher(no);
        return m4.matches(); 
    } 
	
	public static boolean isValidPwd(String pass ) 
    { 
        String password = "(?=.*[@#$%^&+=])"; 
        Pattern pwd = Pattern.compile(password); 
        if (pass ==null) { 
            return false; 
        } 
        Matcher m5 = pwd.matcher(pass);
        return m5.matches();
    } 
	
	
	
	
	public static void main(String[] args) {
		
		 	String finame = "Nirmal"; 
	        System.out.println(isValidFirstName(finame)); 
	  
	        String liname = "Ram"; 
	        System.out.println(isValidLastName(liname)); 

	        String mail = "abc.xyz@bl.co.in"; 
	        System.out.println(isValidMail(mail)); 
	        
	        String no = "91 9349654218"; 
	        System.out.println(isValidNo(no)); 
	        
	        String pass = "Admin@1234"; 
	        System.out.println(isValidPwd(pass)); 
	}

}
