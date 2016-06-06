public class string{
	public static void main (String args[])
	{
		//creating email-address string
		String email = new String("godstime.osarobo@yahoo.co.uk");
		String name = new String() , domain = new String(), nameCap1 = new String(), nameCap2 =  new String();

		//looping to find name and domain locations
		for ( int i = 0; i<email.length(); i++){
			if(email.charAt(i) == '@')
			{
				//getting name
				name = email.substring(0 , i);
				name = name.replace('.' , ' ');
				//getting domain
				domain = email.substring( i+1);
				//getting capitals of first and last name
				nameCap1 = name.substring(0,1);
				nameCap1 = nameCap1.toUpperCase();
				nameCap2 = name.substring(name.indexOf(' ') + 1,name.indexOf(' ') + 2);
				nameCap2 = nameCap2.toUpperCase();
				//stopping the loop
				i = email.length();
			}

		}
		//correcting the layout of the name
		name = nameCap1 + name.substring(1, name.indexOf(' ') + 1) + nameCap2 + name.substring(name.indexOf(' ') + 2);
		//printing out the Name and Doma
		System.out.println("Name: " + name);
		System.out.println("Domain: " + domain);
	}
}