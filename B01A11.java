package bolum01.alistirma;

public class B01A11 {
	public static void main(String[] args) {
		System.out.println("One birth day 7 seconds");
		System.out.println("One death every 13 seconds");
		System.out.println("One new immigrant 45 seconds");
		System.out.println("current population =  312,032,486 ");
		System.out.println("1 years later= " + 
		(312032486 + (365 * 60 *60* 24 /7  ) - (365 * 60* 60 *24 /13) - (365 * 60 *60 * 24 /45)));
		System.out.println("2 year later =" +
				(312032486 + 2 *(365 * 60 *60* 24 /7 ) - (365 * 60* 60 *24 /13) - (365 * 60 *60 * 24 /45)));
		System.out.println("3 years later=" +
				(312032486 + 3 *(365 * 60 *60* 24 /7 ) - (365 * 60* 60 *24 /13) - (365 * 60 *60 * 24 /45)));
		System.out.println("4 years later=" +
				(312032486 + 4 *(365 * 60 *60* 24 /7 ) - (365 * 60* 60 *24 /13) - (365 * 60 *60 * 24 /45)));
		System.out.println("5 years later=" +
				(312032486 + 5 *(365 * 60 *60* 24 /7 ) - (365 * 60* 60 *24 /13) - (365 * 60 *60 * 24 /45)));
		
	}	

}
