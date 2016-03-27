/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.golfscore.faces;

import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import jp.co.golfscore.control.CompListBusinessLogic;
import jp.co.golfscore.entity.CompEntity;
import jp.co.golfscore.entity.ScoreEntity;

/**
 *
 * @author GMSDeveloper
 */
@ManagedBean
@Named
@SessionScoped
public class HomeFaces {

    private List<CompEntity> _compList;
    
    private List<ScoreEntity> _scoreList;
    
    @EJB
    CompListBusinessLogic _compListBusinessLogic;
    
    /**
     * Creates a new instance of CompetitionHome
     */
    public HomeFaces() {
    }
        
    public List<CompEntity> compListManage() {
         System.out.println( "compListManageが呼ばれました！" );
         _compList = _compListBusinessLogic.getCompList();
         return _compList;
    }
    
    public List<ScoreEntity> scoreListManage() {
         System.out.println( "scoreListManageが呼ばれました！引数は" );
         _scoreList = _compListBusinessLogic.getScoreList();
         return _scoreList;
    }
    
    public List<CompEntity> getCompList() {
        System.out.println( "getCompListが呼ばれました！" );
        return _compList;
    }

    public void setCompList(List<CompEntity> compList) {
        this._compList = compList;
    }
    
}
