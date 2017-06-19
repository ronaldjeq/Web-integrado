package pe.edu.utp.dataaccess.Models;

import java.sql.Time;
import java.util.Date;

/**
 * Creado por Gustavo Espinoza on 17/06/2017.
 */
public class ResultMatterHeader {
    private String id_resultMatter;
    private Matter matter;
    private User user;
    private double porcent;
    private Date date;
    private Time time;

    public ResultMatterHeader(String id_resultMatter, Matter matter, User user, double porcent, Date date, Time time) {
        this.id_resultMatter = id_resultMatter;
        this.matter = matter;
        this.user = user;
        this.porcent = porcent;
        this.date = date;
        this.time = time;
    }

    public ResultMatterHeader() {
    }

    public String getId_resultMatter() {
        return id_resultMatter;
    }

    public ResultMatterHeader setId_resultMatter(String id_resultMatter) {
        this.id_resultMatter = id_resultMatter;
        return this;
    }

    public Matter getMatter() {
        return matter;
    }

    public ResultMatterHeader setMatter(Matter matter) {
        this.matter = matter;
        return this;
    }

    public User getUser() {
        return user;
    }

    public ResultMatterHeader setUser(User user) {
        this.user = user;
        return this;
    }

    public double getPorcent() {
        return porcent;
    }

    public ResultMatterHeader setPorcent(double porcent) {
        this.porcent = porcent;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public ResultMatterHeader setDate(Date date) {
        this.date = date;
        return this;
    }

    public Time getTime() {
        return time;
    }

    public ResultMatterHeader setTime(Time time) {
        this.time = time;
        return this;
    }
}

