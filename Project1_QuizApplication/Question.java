import java.util.Arrays;

public class Question {
    
    //instance variables
    private int id;
    private String question;
    private String [] options = new String [4];
    
    private String answer;
    
    //constructor
    public Question(int id, String question, String opt1, String opt2, String opt3, String opt4, String answer) {
        this.id = id;
        this.question = question;
        this.options[0] = opt1;
        this.options[1] = opt2;
        this.options[2] = opt3;
        this.options[3] = opt4;
        this.answer = answer;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
   
    public String [] getOptions()
    {
        return options;
    }

    public void setOption(int index, String option)
    {
        options[index] = option;
    }

    public String getAnswer() {
        return answer;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question [id=" + id + ", question=" + question + ", options=" + Arrays.toString(options) + ", answer="
                + answer + "]";
    }

    

    
}
