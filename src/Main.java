public class Main {

	public static void printseparator(){
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		System.out.println("------------------------------------------");
	}

	public static void main(String[] args)
	{
		int[] issuesByMonth = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 7, 1, 8,};
		printseparator();
		for (int i = 0; i < issuesByMonth.length; i++) {
			System.out.println(issuesByMonth [i]);
			if ((i+1)%3 == 0) {
				printseparator();
			}
		}
		printseparator();

	}
}