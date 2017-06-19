package pe.edu.utp.dataaccess.Models;

import java.sql.Time;
import java.util.Date;

/**
 * Creado por Ronald Estela  17/06/2017.
 */

public class ResultTopicHeader {
    private int id_resultTopic;
    private Topic topic;
    private User user;
    private double porcent;
    private Date date;
    private Time time;

    public ResultTopicHeader(int id_resultTopic, Topic topic, User user, double porcent, Date date, Time time) {
        this.id_resultTopic = id_resultTopic;
        this.topic = topic;
        this.user = user;
        this.porcent = porcent;
        this.date = date;
        this.time = time;
    }

    public ResultTopicHeader() {
    }


    public int getId_resultTopic() {
        return id_resultTopic;
    }

    public ResultTopicHeader setId_resultTopic(int id_resultTopic) {
        this.id_resultTopic = id_resultTopic;
        return this;
    }

    public Topic getTopic() {
        return topic;
    }

    public ResultTopicHeader setTopic(Topic topic) {
        this.topic = topic;
        return this;
    }

    public User getUser() {
        return user;
    }

    public ResultTopicHeader setUser(User user) {
        this.user = user;
        return this;
    }

    public double getPorcent() {
        return porcent;
    }

    public ResultTopicHeader setPorcent(double porcent) {
        this.porcent = porcent;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public ResultTopicHeader setDate(Date date) {
        this.date = date;
        return this;
    }

    public Time getTime() {
        return time;
    }

    public ResultTopicHeader setTime(Time time) {
        this.time = time;
        return this;
    }
}
