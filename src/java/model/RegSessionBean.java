/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.sql.SQLException;
import javax.faces.event.ActionEvent;

/**
 *
 * @author Administrator
 */
public class RegSessionBean {
    //bien login
    private String username;
    private String password;
    
    //bien search
    private RegDTO[] regSearch;
    private String searchValue;
    //bien update
    private boolean editable = false;
    private ActionEvent e;
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RegDTO[] getRegSearch() {
        return regSearch;
    }

    public void setRegSearch(RegDTO[] regSearch) {
        this.regSearch = regSearch;
    }

    public String getSearchValue() {
        return searchValue;
    }

    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    public ActionEvent getE() {
        return e;
    }

    public void setE(ActionEvent e) {
        this.e = e;
    }
    
    
    public RegSessionBean() {
    }
    // check login
    public String checkLogin() throws SQLException, ClassNotFoundException{
        RegDTO dao = new RegDTO(username, password);
        System.out.println("login with account: "+username);
        if (dao.checkLogin()) {
            return "success";
        }
        return "fail";
    }
    //back to login
    public String tryLogin(){
        return "try";
    }
    //back to home
    public String goHome(){
        return "goHome";
    }
    //search
    public String searchLikeLastName() throws ClassNotFoundException, SQLException{
        RegDTO dao = new RegDTO();
        this.setRegSearch(dao.seachLikeLastName(searchValue));
        return "search";
    }
    //
    public String editAccount(){
        editable = true;
        return null;
    }
    public void updateAccount(ActionEvent e) throws ClassNotFoundException, SQLException{
        System.out.println("Starting update account...");
        RegDTO tmp = (RegDTO) this.e.getComponent().getAttributes().get("reg");
        
        System.out.println(""+tmp.getUsername());
        boolean result = tmp.updateAccount();
        System.out.println("Update account: "+result);
        if (result){
            editable = false;
            searchLikeLastName();
        }
        System.out.println("Update done!");
    }
    
}
