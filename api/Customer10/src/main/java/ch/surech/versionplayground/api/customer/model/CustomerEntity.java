package ch.surech.versionplayground.api.customer.model;

import javax.persistence.*;

/**
 * Repräsentiert einen Kunden
 */
@Entity
@Table(name = "customer")
public class CustomerEntity {

    /**
     * Technischer Primärschlüssel. Wird von JPA vergeben
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    protected Long id;

    @Column(name = "name", unique = false, nullable = false)
    private String name;

    @Column(name = "prename", unique = false, nullable = false)
    private String prename;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrename() {
        return prename;
    }

    public void setPrename(String prename) {
        this.prename = prename;
    }
}
