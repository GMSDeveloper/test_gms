/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.golfscore.faces;

import javax.annotation.ManagedBean;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author GMSDeveloper
 */
@Named(value = "loginFaces")
@ManagedBean
@Dependent
public class LoginFaces {

    /**
     * Creates a new instance of LoginMB
     */
    public LoginFaces() {
    }
    
}
