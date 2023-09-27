import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class PoliticalQuestions {

    public static void main(String[] args) {
        
        // Define file names for each party
        String republicanFileName = "republican_responses.txt";
        String democratFileName = "democrat_responses.txt";
        String greenPartyFileName = "green_party_responses.txt";
        String libertarianFileName = "libertarian_responses.txt";
        
        // Create FileWriter objects for each party
        FileWriter republicanFileWriter = null;
        FileWriter democratFileWriter = null;
        FileWriter greenPartyFileWriter = null;
        FileWriter libertarianFileWriter = null;
        
        try {
            republicanFileWriter = new FileWriter(republicanFileName);
            democratFileWriter = new FileWriter(democratFileName);
            greenPartyFileWriter = new FileWriter(greenPartyFileName);
            libertarianFileWriter = new FileWriter(libertarianFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Define the questions and answers in a 2D array
        String[][] questionsAndAnswers = {
            // Question 1
            {
                "What is your stance on economic policy?",
                "Lower taxes and less government intervention in the economy",
                "Higher taxes on the wealthy to fund social programs",
                "Wealth redistribution and economic equality",
                "Minimal government involvement in economic affairs"
            },
            // Question 2
            {
                "What is your position on healthcare?",
                "Primarily privatized healthcare with minimal government involvement",
                "Government-run healthcare system for all citizens",
                "Focus on holistic and preventative healthcare",
                "Free-market solutions for healthcare access"
            },
            // Question 3
            {
                "Where do you stand on environmental policy?",
                "Prioritize deregulation to support business interests",
                "Strong environmental regulations and climate action",
                "Aggressive environmental conservation and sustainability",
                "Non-interventionist approach with minimal government involvement"
            },
            // Question 4
            {
                "What are your views on social issues?",
                "Oppose abortion rights and advocate for traditional family values",
                "Support reproductive rights and LGBTQ+ rights",
                "Focus on social justice, inclusivity, and diversity",
                "Personal freedom and minimal government interference in personal lives"
            },
            // Question 5
            {
                "Where do you stand on gun control?",
                "Support Second Amendment rights and minimal gun control",
                "Favor stricter gun control measures and background checks",
                "Advocate for stronger gun control and reduced access to firearms",
                "Believe in unrestricted gun ownership with minimal regulations"
            },
            // Question 6
            {
                "What is your approach to foreign policy?",
                "Prioritize military strength and intervention abroad",
                "Support diplomacy and international cooperation over military action",
                "Advocate for non-interventionist foreign policy and reducing military involvement overseas",
                "Prioritize global cooperation on issues like climate change and human rights"
            },
            // Question 7
            {
                "How do you view immigration?",
                "Advocate for strict immigration controls and border security",
                "Support a pathway to citizenship for undocumented immigrants",
                "Favor open borders and unrestricted immigration",
                "Believe in minimal restrictions on immigration and open labor markets"
            },
            // Question 8
            {
                "What is your stance on education?",
                "Primarily locally controlled education with limited federal involvement",
                "Support increased federal funding and standards for education",
                "Advocate for alternative education methods and less standardized testing",
                "Believe in school choice and minimal government involvement in education"
            },
            // Question 9
            {
                "Where do you stand on healthcare?",
                "Primarily privatized healthcare with minimal government involvement",
                "Government-run healthcare system for all citizens",
                "Focus on holistic and preventative healthcare",
                "Free-market solutions for healthcare access"
            },
            // Question 10
            {
                "What are your views on criminal justice?",
                "Favor tough-on-crime policies and mandatory minimum sentences",
                "Support criminal justice reform and reducing mass incarceration",
                "Advocate for restorative justice and rehabilitation",
                "Believe in reducing government involvement in criminal justice"
            },
            // Question 11
            {
                "What is your stance on taxes?",
                "Support tax cuts for corporations and the wealthy",
                "Favor progressive taxation and wealth redistribution",
                "Advocate for a wealth tax to address income inequality",
                "Believe in reducing or eliminating income taxes"
            },
            // Question 12
            {
                "How do you view climate change?",
                "Question the extent of human impact on climate change",
                "Favor aggressive climate action, such as the Green New Deal",
                "Prioritize ecological sustainability and renewable energy",
                "Believe market forces will drive environmental innovation"
            },
            // Question 13
            {
                "What is your stance on social safety nets?",
                "Believe in limited government assistance and personal responsibility",
                "Support expanding social safety nets and welfare programs",
                "Advocate for a Universal Basic Income (UBI) or similar programs",
                "Believe in reducing government involvement in welfare"
            },
            // Question 14
            {
                "How do you view trade policy?",
                "Support protectionist trade policies and tariffs",
                "Favor free trade agreements and globalization",
                "Prioritize fair trade and labor rights in international agreements",
                "Believe in unrestricted international trade"
            },
            // Question 15
            {
                "What is your stance on civil liberties?",
                "Support surveillance and security measures for national security",
                "Favor protecting civil liberties and privacy rights",
                "Advocate for personal freedom and individual rights",
                "Prioritize government transparency and accountability"
            }
        };

        int republican = 0;
        int democrat = 0;
        int greenParty = 0;
        int libertarian = 0;

        Scanner scanner = new Scanner(System.in);

        String[] userChoices = new String[questionsAndAnswers.length];
        
        // Iterate through each question
        for (int i = 0; i < questionsAndAnswers.length; i++) {
            String question = questionsAndAnswers[i][0];
            String answerA = questionsAndAnswers[i][1];
            String answerB = questionsAndAnswers[i][2];
            String answerC = questionsAndAnswers[i][3];
            String answerD = questionsAndAnswers[i][4];

            // Display the question and options
            System.out.println("[Question " + (i + 1) + "/" + questionsAndAnswers.length + "] " + question);
            System.out.println("a. " + answerA);
            System.out.println("b. " + answerB);
            System.out.println("c. " + answerC);
            System.out.println("d. " + answerD);

            String userChoice = "";
            boolean validInput = false;

            // Keep prompting the user until valid input is provided
            while (!validInput) {
                // Get user input
                System.out.print("Your choice (a/b/c/d): ");
                userChoice = scanner.nextLine().toLowerCase();

                // Check if the input is valid
                if (userChoice.equals("a") || userChoice.equals("b") || userChoice.equals("c") || userChoice.equals("d")) {
                    validInput = true; // Exit the loop if input is valid
                } else {
                    System.out.println("Invalid choice. Please enter 'a', 'b', 'c', or 'd'.");
                }
            }
            
            // store the choice in the userChoices array
            userChoices[i] = userChoice;
            
            // Process the user's choice
            if (userChoice.equals("a")) {
                republican++;
            } else if (userChoice.equals("b")) {
                democrat++;
            } else if (userChoice.equals("c")) {
                greenParty++;
            } else if (userChoice.equals("d")) {
                libertarian++;
            } else {
                System.out.print("Response Invalid");
            }
            
            // Test userChoice
            // System.out.println("You chose: " + userChoice);
            // Test Score
            // System.out.println("Scores: republican-" + republican + " | democrat-" + democrat + " | greenParty-" + greenParty + " | libertarian-" + libertarian);
        }
        
        // Define an array of political parties
        String[] politicalParties = {"Republican", "Democrat", "Green Party", "Libertarian"};

        // Ask the user to choose a political party
        System.out.println("\nPlease choose a political party based on your answers:");
        for (int i = 0; i < politicalParties.length; i++) {
            System.out.println((i + 1) + ". " + politicalParties[i]);
        }
        
        int partyChoice = 0;
        boolean validPartyChoice = false;
        
        while (!validPartyChoice) {
            System.out.print("Enter the number of your chosen political party: ");
            if (scanner.hasNextInt()) {
                partyChoice = scanner.nextInt();
                if (partyChoice >= 1 && partyChoice <= politicalParties.length) {
                    validPartyChoice = true;
                } else {
                    System.out.println("Invalid choice. Please enter a number between 1 and " + politicalParties.length);
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Consume invalid input
            }
        }
        
        // Store the user's chosen political party in a String variable
        String usersParty = politicalParties[partyChoice - 1];
        
        System.out.println("You have chosen the " + usersParty + " party.");
        
        // Calculate the scores for each party
        int[] partyScores = {republican, democrat, greenParty, libertarian};
        
        // Determine the party with the highest score
        int maxScore = -1; // Initialize with a value lower than possible scores
        String alignment = "";
        
        for (int i = 0; i < partyScores.length; i++) {
            if (partyScores[i] > maxScore) {
                maxScore = partyScores[i];
                alignment = politicalParties[i];
            }
        }
        
        // Print the result
        System.out.println("\nBased on your answers, you align most with the " + alignment + " party.");
        
        // Write the user's responses to the appropriate file
        try {
            FileWriter selectedPartyFileWriter = null;
            switch (usersParty) {
                case "Republican":
                    selectedPartyFileWriter = republicanFileWriter;
                    break;
                case "Democrat":
                    selectedPartyFileWriter = democratFileWriter;
                    break;
                case "Green Party":
                    selectedPartyFileWriter = greenPartyFileWriter;
                    break;
                case "Libertarian":
                    selectedPartyFileWriter = libertarianFileWriter;
                    break;
                default:
                    break;
            }
        
            if (selectedPartyFileWriter != null) {
                for (int i = 0; i < questionsAndAnswers.length; i++) {
                    selectedPartyFileWriter.write("Question " + (i + 1) + ": " + questionsAndAnswers[i][0] + "\n");
                    selectedPartyFileWriter.write("Your choice: " + userChoices[i] + "\n\n"); // Modify this line
                }
        
                selectedPartyFileWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
