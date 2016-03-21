/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.golfscore.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author GMSDeveloper
 */
@Entity
@Table(name = "comp_all")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompEntity.findAll", query = "SELECT c FROM CompEntity c"),
    @NamedQuery(name = "CompEntity.findByCompId", query = "SELECT c FROM CompEntity c WHERE c.compId = :compId"),
    @NamedQuery(name = "CompEntity.findByCompName", query = "SELECT c FROM CompEntity c WHERE c.compName = :compName"),
    @NamedQuery(name = "CompEntity.findByCompDate", query = "SELECT c FROM CompEntity c WHERE c.compDate = :compDate"),
    @NamedQuery(name = "CompEntity.findByCompPlace", query = "SELECT c FROM CompEntity c WHERE c.compPlace = :compPlace")})
public class CompEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "COMP_ID")
    private Integer compId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "COMP_NAME")
    private String compName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COMP_DATE")
    @Temporal(TemporalType.DATE)
    private Date compDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "COMP_PLACE")
    private String compPlace;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "conpId")
    private Collection<ScoreEntity> scoreEntityCollection;

    public CompEntity() {
    }

    public CompEntity(Integer compId) {
        this.compId = compId;
    }

    public CompEntity(Integer compId, String compName, Date compDate, String compPlace) {
        this.compId = compId;
        this.compName = compName;
        this.compDate = compDate;
        this.compPlace = compPlace;
    }

    public Integer getCompId() {
        return compId;
    }

    public void setCompId(Integer compId) {
        this.compId = compId;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public Date getCompDate() {
        return compDate;
    }

    public void setCompDate(Date compDate) {
        this.compDate = compDate;
    }

    public String getCompPlace() {
        return compPlace;
    }

    public void setCompPlace(String compPlace) {
        this.compPlace = compPlace;
    }

    @XmlTransient
    public Collection<ScoreEntity> getScoreEntityCollection() {
        return scoreEntityCollection;
    }

    public void setScoreEntityCollection(Collection<ScoreEntity> scoreEntityCollection) {
        this.scoreEntityCollection = scoreEntityCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (compId != null ? compId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompEntity)) {
            return false;
        }
        CompEntity other = (CompEntity) object;
        if ((this.compId == null && other.compId != null) || (this.compId != null && !this.compId.equals(other.compId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jp.co.golfscore.entity.CompEntity[ compId=" + compId + " ]";
    }
    
}
