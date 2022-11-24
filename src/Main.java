import org.w3c.dom.ls.LSOutput;

public class Main {
	public static void printLeapYear(int i) {
		System.out.println(i + " — високосный год.");
	}

	public static void printNotALeapYear(int i) {
		System.out.println(i + " — не високосный год. ");
	}
	public static void printInfoAboutDevise (int clientOS, int productionYear ){
		if (clientOS == 0) {
			if (productionYear >= 2015) {
				System.out.println(" Установите версию приложения для iOS по ссылке");
			} else {
				System.out.println(" Установите облегченную версию приложения для iOS по ссылке");
			}
		} else if (clientOS == 1) {
			if (productionYear >= 2015) {
				System.out.println("Установите версию приложения для Android по ссылке");
			} else {
				System.out.println("Установите облегченную версию приложения для Android по ссылке");
			}
		}
	}
	public static int calculateDeliveryDays (int deliveryDistance){
		int deliveryDays =1;
		int interval = 40;
		int startInterval = 20;
		if (deliveryDistance > startInterval){
			deliveryDays =  deliveryDays + (int) Math.ceil((deliveryDistance-startInterval)/(double) interval);
		}
		return deliveryDays;
	}
	public static void main(String[] args) {
		// Задача 1.
		System.out.println("Задача 1.");
		int i = 2020;
		if ((i % 4 == 0) || (i % 400 == 0 && i % 100 != 0)) {
			printLeapYear(i);
		} else {
			printNotALeapYear(i);
		}
		// Задача 2.
		System.out.println("Задача 2.");
		int productionYear = 2017;
		int clientIOS = 0;
		int clientAd = 1;
		int clientOS = 1;
		printInfoAboutDevise ( clientOS, productionYear);
		// Задача 3.
		System.out.println("Задача 3.");
		int deliveryDistance = 95;
		int deliveryDays = calculateDeliveryDays (deliveryDistance);
		System.out.println(" Потребуется дней " + deliveryDays);
	}
}