package hiber.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
public class Car {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String model;
    @Column
    private int series;

    @OneToOne (fetch = FetchType.LAZY)
    private User user;


    public Car () {
    }

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return String.format("%s %d-series",model,series);
    }
}
