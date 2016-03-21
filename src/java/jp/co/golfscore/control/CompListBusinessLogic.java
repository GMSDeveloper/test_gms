/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.golfscore.control;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import jp.co.golfscore.entity.CompEntity;
import jp.co.golfscore.entity.ScoreEntity;

/**
 *
 * @author GMSDeveloper
 */
@Stateless
public class CompListBusinessLogic {

    @PersistenceContext(unitName="GMSUnit")
    EntityManager em;
    
    public CompListBusinessLogic() {
    }
    
    public List getCompList() {
        TypedQuery<CompEntity> query
                = em.createNamedQuery("CompEntity.findAll", CompEntity.class);
        List<CompEntity> compList = query.getResultList();
        return compList;
    }
    
    public List getScoreList() {
        TypedQuery<ScoreEntity> query
                = em.createNamedQuery("ScoreEntity.findAll", ScoreEntity.class);
        List<ScoreEntity> scoreList = query.getResultList();
        return scoreList;
    }

}
