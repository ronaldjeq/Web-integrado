package pe.edu.utp.dataaccess.Models;

import java.sql.Time;
import java.util.Date;

/**
 * Creado por Gustavo Espinoza on 17/06/2017.
 */
public class ResultSimulacrumHeader {
    private String id_resultSimulacrum;
    private User user;
    private double porcent;
    private Date date;
    private Time time;

    public ResultSimulacrumHeader(String id_resultSimulacrum, User user, double porcent, Date date, Time time) {
        this.id_resultSimulacrum = id_resultSimulacrum;
        this.user = user;
        this.porcent = porcent;
        this.date = date;
        this.time = time;
    }

    public ResultSimulacrumHeader() {
    }


    public String getId_resultSimulacrum() {
        return id_resultSimulacrum;
    }

    public ResultSimulacrumHeader setId_resultSimulacrum(String id_resultSimulacrum) {
        this.id_resultSimulacrum = id_resultSimulacrum;
        return this;
    }

    public User getUser() {
        return user;
    }

    public ResultSimulacrumHeader setUser(User user) {
        this.user = user;
        return this;
    }

    public double getPorcent() {
        return porcent;
    }

    public ResultSimulacrumHeader setPorcent(double porcent) {
        this.porcent = porcent;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public ResultSimulacrumHeader setDate(Date date) {
        this.date = date;
        return this;
    }

    public Time getTime() {
        return time;
    }

    public ResultSimulacrumHeader setTime(Time time) {
        this.time = time;
        return this;
    }
}
