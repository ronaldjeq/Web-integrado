package pe.edu.utp.dataaccess.Models;

/**
 * Creado por Jherson Aquino on 17/06/2017.
 */
public class Question {
    private String id_question;
    private Topic topic;
    private Matter matter;
    private String question_description;

    public Question() {}
    public Question(String id_question, Topic topic, Matter matter, String question_description) {
        this.id_question = id_question;
        this.topic = topic;
        this.matter = matter;
        this.question_description = question_description;
    }

    public String getId_question() {
        return id_question;
    }

    public Question setId_question(String id_question) {
        this.id_question = id_question;
        return this;
    }

    public Topic getTopic() {
        return topic;
    }

    public Question setTopic(Topic topic) {
        this.topic = topic;
        return    this;
    }

    public Matter getMatter() {
        return matter;
    }

    public Matter setMatter(Matter matter) {
        this.matter = matter;
        return  matter;
    }

    public String getQuestion_description() {
        return question_description;
    }

    public Matter setQuestion_description(String question_description) {
        this.question_description = question_description;
        return  matter;
    }

}
