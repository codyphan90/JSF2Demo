/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.sql.SQLException;
import javax.faces.component.UICommand;
import javax.faces.component.UIForm;
import javax.faces.event.ActionEvent;

/**
 *
 * @author Administrator
 */
public class RegSessionBean {
    //bien login
    private String lusername;
    private String lpassword;
    
    //bien search
    private RegDTO[] regSearch;
    private String searchValue;
    //bien update
    private boolean editable = false;
    //private ActionEvent e;
    //bien instert form
    private UICommand addCommand;
    private UICommand insertCommand;
    private UIForm insertForm;
    private String sUsername;
    private String sPassword;
    private String sLastname;
    private boolean bRoles;
    //bien delete
    private String dusername;

    public String getDusername() {
        return dusername;
    }

    public void setDusername(String dusername) {
        this.dusername = dusername;
    }
    
    
    

    public String getUsername() {
        return lusername;
    }

    public void setUsername(String username) {
        this.lusername = username;
    }

    public String getPassword() {
        return lpassword;
    }

    public void setPassword(String password) {
        this.lpassword = password;
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

//    public ActionEvent getE() {
//        return e;
//    }
//
//    public void setE(ActionEvent e) {
//        this.e = e;
//    }

    public UICommand getAddCommand() {
        return addCommand;
    }

    public void setAddCommand(UICommand addCommand) {
        this.addCommand = addCommand;
    }

    public UICommand getInsertCommand() {
        return insertCommand;
    }

    public void setInsertCommand(UICommand insertCommand) {
        this.insertCommand = insertCommand;
    }

    public UIForm getInsertForm() {
        return insertForm;
    }

    public void setInsertForm(UIForm insertForm) {
        this.insertForm = insertForm;
    }

    public String getsUsername() {
        return sUsername;
    }

    public void setsUsername(String sUsername) {
        this.sUsername = sUsername;
    }

    public String getsPassword() {
        return sPassword;
    }

    public void setsPassword(String sPassword) {
        this.sPassword = sPassword;
    }

    public String getsLastname() {
        return sLastname;
    }

    public void setsLastname(String sLastname) {
        this.sLastname = sLastname;
    }

    public boolean isbRoles() {
        return bRoles;
    }

    public void setbRoles(boolean bRoles) {
        this.bRoles = bRoles;
    }
    
    
    public RegSessionBean() {
    }
    // check login
    public String checkLogin() throws SQLException, ClassNotFoundException{
        RegDTO dao = new RegDTO(lusername, lpassword);
        System.out.println("login with account: "+lusername);
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
    //Still error
    private RegDTO accountEdit;

    public RegDTO getAccountEdit() {
        return accountEdit;
    }

    public void setAccountEdit(RegDTO accountEdit) {
        this.accountEdit = accountEdit;
    }
    
    public void updateAccount(ActionEvent e) throws ClassNotFoundException, SQLException{
        try {
            RegDTO dao = new RegDTO();
        System.out.println("Starting update account:");
        //accountEdit = (RegDTO) e.getComponent().getAttributes().get("reg");
        String test = (String) e.getComponent().getAttributes().get("username");
        if (test == null){
            System.out.println("accountEdit is null");
        }
        else{
        System.out.println(test);
        dao.setUsername(test);
            System.out.println("lastname:"+dao.getLastname());
            System.out.println("isadmin: "+dao.isRoles());
        boolean result = dao.updateAccount();
        System.out.println("Update account: "+result);
            
        if (result){
            editable = false;
            searchLikeLastName();
        }
        System.out.println("Update done!");
        }
        } catch(NullPointerException ex){
            ex.printStackTrace();
        }
    }
    //Insert methods
    public void addNew(){
        addCommand.setRendered(false);
        insertForm.setRendered(true);
        insertCommand.setValue("Insert");
    }
    public void insertAccount() throws ClassNotFoundException, SQLException {
        RegDTO tmp = new RegDTO(sUsername, sPassword, sLastname, bRoles);
        boolean result = tmp.insertAccount();
        if (result){
            insertForm.setRendered(false);
            addCommand.setRendered(true);
            searchLikeLastName();
        }
    }
    //delete method
    public void deleteAccount(ActionEvent e) throws ClassNotFoundException, SQLException {
        RegDTO dao = new RegDTO();
        String sName =(String) e.getComponent().getAttributes().get("username");
        System.out.println("sName = "+sName);
        dao.setUsername(sName);
        boolean result = dao.deleteAccount();
        if (result){
            searchLikeLastName();
        }
    }
    
}
