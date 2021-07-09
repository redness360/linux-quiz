import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)  {
	ArrayList<Object> userChoices = new ArrayList<>(); // here I store the answers from the user
	System.out.println("Welcome to the Linux Quiz!");
	sleep.sec(2); // a sleep method is setup for easier syntax (sleep.java)
	System.out.println("I will be guiding you through finding a linux distribution for your needs.");
	sleep.sec(3);
	userChoices.add(QA.experience()); // asks how much experience the user has (method defined in QA.java)
		// in the future, answering that you are just switching from windows will divert you to a simpler version of the quiz
/*	if(userChoices.get(0) == 'A') {

	}
	else { */
		userChoices.add(QA.packages()); // asks the user which package system they prefer (stability vs updates)
		System.out.println(userChoices); // just for debug rn
		switch (QA.UI()) { // depending on the user's answer for their UI preferences, it will ask some follow-up questions
			case 'A': {
				p.t("Which DE? KDE, Gnome, Xfce, MATE, Cinnamon, Budgie, LXQt, or Deepin?");
				Scanner scanner = new Scanner(System.in);
				userChoices.add(scanner);
				scanner.close();
			}
			case 'B': {
				p.three("The desktop environment is what defines how your system looks and operates.");
				p.three("A DE would include: the login screen, the task bar, and the bar above windows.");
				p.three("Most DEs also ship with a default set of apps like settings, calender, mail, word processor, etc.");
				p.three("I have included a short list of distros and the desktop environments they use.");
				p.three("If your distro isn't on the list (I can only list so many), look it up online:");
				p.three("Search 'what desktop environment does ____ use'");
				p.one("Ubuntu: Modified version of the Gnome Desktop Environment");
				p.one("Ubuntu MATE: MATE Desktop Environment");
				p.one("Kubuntu: KDE Desktop Environment");
				p.one("Xubuntu: XFCE Desktop Environment");
				p.one("Linux Mint: This one depends, the main version is Cinnamon, but they also offer MATE and XFCE editions.");
				p.one("If in doubt, check the version information in your linux mint settings.");
				p.one("Ubuntu Budgie: Budgie Desktop Environment.");
				p.one("Lubuntu: LXQt Desktop Environment.");
				p.one("UbuntuDDE: Deepin Desktop Environment.");
				p.one("Pop OS: Modified version of the Gnome Desktop Environment");
				p.one("Fedora: The main version uses Gnome, although they do offer alternative versions.");
				p.one("Manjaro: Manjaro offers loads of different Desktop Environments, mainly XFCE, Gnome, and KDE.");
				p.one("KDE Neon: KDE Desktop Environment");
				p.t("Ok, so if you now know which desktop environment you want, type yes.");
				p.t("If you are still confused and just want something that looks good / similar to windows/Mac, I can recommend you one.");
				p.t("Just type no if that's the case");
				Scanner scanner = new Scanner(System.in);
				String choice = scanner.nextLine();
				boolean loop = true;
				while (loop)
				if (choice.equals("Yes") | choice.equals("yes")) {
					loop = false;
					p.t("Which DE? KDE, Gnome, Xfce, MATE, Cinnamon, Budgie, LXQt, or Deepin?");
					Scanner scannerDE = new Scanner(System.in);
					userChoices.add(scannerDE);
					scannerDE.close();
				}
				else if (choice.equals("No") | choice.equals("no")) {
					loop = false;
					p.t("Would you like a Windows-like, or Mac-Like experience?");
					p.t("Answer with 'Windows' or 'Mac'");
					Scanner scannerExperience = new Scanner(System.in);
					String experience = scannerExperience.nextLine();
					scannerExperience.close();
					if (experience.equals("Windows")) {
						p.t("Ok, now we need to see what your priorities are.");
						p.t("Is your number 1 priority: performance, looks, or customization?");
						Scanner scannerPriority1 = new Scanner(System.in);
						String priority1 = scannerPriority1.nextLine();
						scannerPriority1.close();

						switch (priority1.toUpperCase()) {
							case "PERFORMANCE": {
								p.t("Is your number 2 priority: looks, or customization?");
								Scanner scannerPriority2 = new Scanner(System.in);
								String priority2 = scannerPriority2.nextLine();
								scannerPriority2.close();
								switch (priority2.toUpperCase()) {
									case "LOOKS": {

									}
									case "CUSTOMIZATION": {

									}
								}
							}
							case "LOOKS": {
								p.t("Is your number 2 priority: performance, or customization?");
								Scanner scannerPriority2 = new Scanner(System.in);
								String priority2 = scannerPriority2.nextLine();
								scannerPriority2.close();
								switch (priority2.toUpperCase()) {
									case "PERFORMANCE": {

									}
									case "CUSTOMIZATION": {

									}
								}
							}
							case "CUSTOMIZATION": {
								p.t("Is your number 2 priority: performance, or looks?");
								Scanner scannerPriority2 = new Scanner(System.in);
								String priority2 = scannerPriority2.nextLine();
								scannerPriority2.close();
								switch (priority2.toUpperCase()) {
									case "PERFORMANCE": {

									}
									case "LOOKS": {

									}
								}
							}

						}

					}

				}
				else {p.t("Invalid answer... Use yes or no.");}
			}
			case 'C': {
				// Will look very similar to C
			}
			case 'D': {
				// Will be very similar to B and C
			}
		}






    }
}
