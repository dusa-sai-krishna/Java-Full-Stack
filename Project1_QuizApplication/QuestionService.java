import java.util.Scanner;

public class QuestionService {
    
    //initializing 
    private Question [] questions = new Question[5];
    private String [] responses = new String [5];
    java.util.Scanner sc = new Scanner(System.in);


    //constructor
    public QuestionService() {
        questions[0] = new Question(1, "What is the capital of India?", "Delhi", "Mumbai", "Chennai", "Kolkata", "Delhi");
        questions[1] = new Question(2, "What is the capital of France?", "Paris", "London", "Berlin", "Madrid", "Paris");
        questions[2] = new Question(3, "What is the capital of USA?", "New York", "Los Angeles", "Chicago", "Washington DC", "Washington DC");
        questions[3] = new Question(4, "What is the capital of Japan?", "Tokyo", "Osaka", "Kyoto", "Nagoya", "Tokyo");
        questions[4] = new Question(5, "What is the capital of UK?", "London", "Manchester", "Bristol", "Edinburgh", "London");
    }

    //Function to display question
    public void displayQuestion() {
        for (Question question : questions) {
            System.out.println(question.toString());
        }
    }

    public void playQuiz()
    {
        // loop through each question object, display question and options then take user input
        int j =0;
        for (Question question : questions)
        {
            System.out.printf("%d . %s\n",question.getId(),question.getQuestion());
            for (int i=0 ; i<4;i++)
            {
                System.out.printf("option %d : %s\t",i+1,question.getOptions()[i]);
            }
            System.out.println("\nEnter your response:");
            responses[j]=sc.nextLine();
            j++;

        }
        sc.close();
        //print responses
        for (int i=0;i<5;i++)
        {
            System.out.printf("%d. %s\t",i+1,responses[i]);
        }
    }

}
