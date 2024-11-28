import java.util.*;

public class NewsSubscriptionApp {
 
    public static void main(String[] args) {

        while(true){

            NewsAgency newsAgency = new NewsAgency();
            Scanner userInput = new Scanner(System.in);
         
            List<String> newsCategoriesList = Arrays.asList("Natural Disasters", "Technology", "Politics");

            System.out.println("===== News Category: =====");

            for (String s : newsCategoriesList) {
                System.out.println(s);
            }

            System.out.println();

            System.out.println("User Preferences:");
            List<Subscriber> subscribersList = new ArrayList<>();

            for (int i = 1; i <= 3; i++) {
                String userName = "User" + i;
                    Subscriber subscriber = new SubscriberNews(userName);
                    subscribersList.add(subscriber);
            }

            System.out.println("===== Randomize Category =====");

            for(int i = 0; i < subscribersList.size(); i++){

                // Setting first user as Natural Disasters for example
                if(i == 0)
                    subscribersList.get(i).modifyPreferences(new ArrayList<>(List.of(newsCategoriesList.getFirst())));

                else
                    subscribersList.get(i).modifyPreferences(new ArrayList<>(List.of(newsCategoriesList.get(new Random().nextInt(newsCategoriesList.size())))));

            }


		
            System.out.println();
            for (Subscriber subscriber : subscribersList) {
                subscriber.subscribeToNewsAgency(newsAgency);
            }
		            		
            
            newsAgency.publishNews("(Natural Disasters)  7.5 quake devastates region");
            System.out.println();
            
            System.out.println("===== Modify User Preferences: =====\n");
            for (Subscriber subscriber : subscribersList) {
                while (true) {
                    System.out.print(subscriber.getName() + ": Modify "+subscriber.getName()+"'s preferences? [YES/NO]: ");
                    String modifyPreferencesInput = userInput.nextLine().toLowerCase();

                    switch (modifyPreferencesInput) {
                        case "yes":
                            System.out.print("Enter new preferences for " + subscriber.getName() + " (comma-separated): ");
                            subscriber.modifyPreferences(Arrays.asList(userInput.nextLine().split(",")));
                            break;

                        case "no":
                            System.out.println(subscriber.getName() + "'s preferences remain unchanged.");  
                            break;

                        default:
                            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                    }

                    System.out.println();
                    if (modifyPreferencesInput.equals("yes") || modifyPreferencesInput.equals("no")) {
                        break; 
                    }
                }
            }

            System.out.println("===== Unsubcribe User: =====");
            
	            for (Subscriber subscriber : subscribersList) {
	                System.out.print("Unsubscribe " + subscriber.getName() + "? [YES/NO]: ");
	                String unsubscribeInput = userInput.nextLine().toLowerCase();
	                if (unsubscribeInput.equals("yes")) {
	                    subscriber.unsubscribeFromNewsAgency();
	                }
	            }
            System.out.println();

            
            newsAgency.publishNews("(Technology) Cyber breach exposes millions!");
            System.out.println();

            
            String subscribeInput;


            while (true) {
                System.out.print("Do you want to subscribe User4? [YES/NO]: ");
                subscribeInput = userInput.nextLine().toLowerCase();

                if (subscribeInput.equals("yes")) {

                    System.out.print("Enter preferences for User4 (comma-separated): ");

                    Subscriber subscriber4 = new SubscriberNews("User4");

                    subscriber4.modifyPreferences(Arrays.asList(userInput.nextLine().split(",")));
                    subscriber4.subscribeToNewsAgency(newsAgency);
                    subscribersList.add(subscriber4);
                    break;
                } else if (subscribeInput.equals("no")) {
                    System.out.println("User4 is not subscribed.");

                    break;
                } else {
                    System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                }
            }
            System.out.println();
          
            newsAgency.publishNews("(Politics) Rising tensions spark global concern.");
            System.out.println();

            
            String exitChoice = "";
            boolean validExitChoice = false;

            while (!validExitChoice) {
                System.out.print("\nExit program? [YES/NO]: ");
                exitChoice = userInput.nextLine().toLowerCase();

                if (exitChoice.equals("yes") || exitChoice.equals("no")) {
                    validExitChoice = true;
                    System.out.println();
                } else {
                    System.out.println("Invalid input choice. Please enter \"yes\" or \"no\".");
                }
            }

            if (exitChoice.equals("yes")) {
                userInput.close();
                System.exit(0);
            }
        }
    }
}