/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jétna
 */
@Entity
@Table(name = "preco")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Preco.findAll", query = "SELECT p FROM Preco p"),
    @NamedQuery(name = "Preco.findById", query = "SELECT p FROM Preco p WHERE p.id = :id"),
    @NamedQuery(name = "Preco.findByValora", query = "SELECT p FROM Preco p WHERE p.valora = :valora"),
    @NamedQuery(name = "Preco.findByValorr", query = "SELECT p FROM Preco p WHERE p.valorr = :valorr")})
public class Preco implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valora")
    private Float valora;
    @Column(name = "valorr")
    private Float valorr;
    @JoinColumn(name = "modeloId", referencedColumnName = "id")
    @ManyToOne
    private Modelo modeloId;

    public Preco() {
    }

    public Preco(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getValora() {
        return valora;
    }

    public void setValora(Float valora) {
        this.valora = valora;
    }

    public Float getValorr() {
        return valorr;
    }

    public void setValorr(Float valorr) {
        this.valorr = valorr;
    }

    public Modelo getModeloId() {
        return modeloId;
    }

    public void setModeloId(Modelo modeloId) {
        this.modeloId = modeloId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Preco)) {
            return false;
        }
        Preco other = (Preco) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Preco[ id=" + id + " ]";
    }
    
}
