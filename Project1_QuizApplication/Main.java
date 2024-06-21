public class Main
{
    public static void main(String[] args)
    {
        //create Question Service object
        QuestionService service = new QuestionService();
        //display questions
        service.displayQuestion();
        
        //play quiz
        service.playQuiz();
    
    
    }

}