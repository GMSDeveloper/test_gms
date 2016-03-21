/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.golfscore.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author GMSDeveloper
 */
@Entity
@Table(name = "score_all")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ScoreEntity.findAll", query = "SELECT s FROM ScoreEntity s"),
    @NamedQuery(name = "ScoreEntity.findByScoreNo", query = "SELECT s FROM ScoreEntity s WHERE s.scoreNo = :scoreNo"),
    @NamedQuery(name = "ScoreEntity.findByScoreRank", query = "SELECT s FROM ScoreEntity s WHERE s.scoreRank = :scoreRank"),
    @NamedQuery(name = "ScoreEntity.findByScoreNet", query = "SELECT s FROM ScoreEntity s WHERE s.scoreNet = :scoreNet"),
    @NamedQuery(name = "ScoreEntity.findByScoreName", query = "SELECT s FROM ScoreEntity s WHERE s.scoreName = :scoreName"),
    @NamedQuery(name = "ScoreEntity.findByScoreOut", query = "SELECT s FROM ScoreEntity s WHERE s.scoreOut = :scoreOut"),
    @NamedQuery(name = "ScoreEntity.findByScoreIn", query = "SELECT s FROM ScoreEntity s WHERE s.scoreIn = :scoreIn"),
    @NamedQuery(name = "ScoreEntity.findByScoreHandcap", query = "SELECT s FROM ScoreEntity s WHERE s.scoreHandcap = :scoreHandcap"),
    @NamedQuery(name = "ScoreEntity.findByScoreTotal", query = "SELECT s FROM ScoreEntity s WHERE s.scoreTotal = :scoreTotal")})
public class ScoreEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "SCORE_NO")
    private Integer scoreNo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SCORE_RANK")
    private int scoreRank;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SCORE_NET")
    private int scoreNet;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "SCORE_NAME")
    private String scoreName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SCORE_OUT")
    private int scoreOut;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SCORE_IN")
    private int scoreIn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SCORE_HANDCAP")
    private int scoreHandcap;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SCORE_TOTAL")
    private int scoreTotal;
    @JoinColumn(name = "CONP_ID", referencedColumnName = "COMP_ID")
    @ManyToOne(optional = false)
    private CompEntity conpId;

    public ScoreEntity() {
    }

    public ScoreEntity(Integer scoreNo) {
        this.scoreNo = scoreNo;
    }

    public ScoreEntity(Integer scoreNo, int scoreRank, int scoreNet, String scoreName, int scoreOut, int scoreIn, int scoreHandcap, int scoreTotal) {
        this.scoreNo = scoreNo;
        this.scoreRank = scoreRank;
        this.scoreNet = scoreNet;
        this.scoreName = scoreName;
        this.scoreOut = scoreOut;
        this.scoreIn = scoreIn;
        this.scoreHandcap = scoreHandcap;
        this.scoreTotal = scoreTotal;
    }

    public Integer getScoreNo() {
        return scoreNo;
    }

    public void setScoreNo(Integer scoreNo) {
        this.scoreNo = scoreNo;
    }

    public int getScoreRank() {
        return scoreRank;
    }

    public void setScoreRank(int scoreRank) {
        this.scoreRank = scoreRank;
    }

    public int getScoreNet() {
        return scoreNet;
    }

    public void setScoreNet(int scoreNet) {
        this.scoreNet = scoreNet;
    }

    public String getScoreName() {
        return scoreName;
    }

    public void setScoreName(String scoreName) {
        this.scoreName = scoreName;
    }

    public int getScoreOut() {
        return scoreOut;
    }

    public void setScoreOut(int scoreOut) {
        this.scoreOut = scoreOut;
    }

    public int getScoreIn() {
        return scoreIn;
    }

    public void setScoreIn(int scoreIn) {
        this.scoreIn = scoreIn;
    }

    public int getScoreHandcap() {
        return scoreHandcap;
    }

    public void setScoreHandcap(int scoreHandcap) {
        this.scoreHandcap = scoreHandcap;
    }

    public int getScoreTotal() {
        return scoreTotal;
    }

    public void setScoreTotal(int scoreTotal) {
        this.scoreTotal = scoreTotal;
    }

    public CompEntity getConpId() {
        return conpId;
    }

    public void setConpId(CompEntity conpId) {
        this.conpId = conpId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (scoreNo != null ? scoreNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ScoreEntity)) {
            return false;
        }
        ScoreEntity other = (ScoreEntity) object;
        if ((this.scoreNo == null && other.scoreNo != null) || (this.scoreNo != null && !this.scoreNo.equals(other.scoreNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jp.co.golfscore.entity.ScoreEntity[ scoreNo=" + scoreNo + " ]";
    }
    
}
