public class Week_5_1 {
	public static void main (String Args[])
	{
		char Vehicle = 'd';
		//truck = t, van = v, car = c, bus = b, motorbike = m

		switch (Vehicle) {
			case 't':
				System.out.println("You drive a truck... you must pay €6.70.");
				break;
			case 'v':
				System.out.println("You drive a van... you must pay €4.00");
				break;
			case 'c':
				System.out.println("You drive a car... you must pay €2.00");
				break;
			case 'b':
				System.out.println("You drive a bus... you must pay €4.25");
				break;
			case 'm':
				System.out.println("You drive a motorbike... you must pay €1.10");
				break;
			default:
				System.out.println("You are driving an illegal vehicle... please stand by, the police will be with you shortly.");
		}
	}
}