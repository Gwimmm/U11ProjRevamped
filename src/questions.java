import java.util.Scanner;
public class questions {

    private String answer;
    private String question;


    public questions (String question, String answer){
        this.question = question;
        this.answer = answer;
    }

    public boolean ask(String given){
        if (given.equals(answer)){
            return true;
        }
        return false;
    }
    public String state(){
        return (question);
    }


}

