/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author Stephen
 */
class EmployeeLdap {

    private String cn;
    private String surname;
    private String givenName;
    private String mail;

    public EmployeeLdap(String cn, String surname, String givenName, String mail) {
        this.cn = cn;
        this.surname = surname;
        this.givenName = givenName;
        this.mail = mail;
    }

    public String getCn() {
       return cn;
    }

    public String getSurName() {
        return surname;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getMail() {
        return mail;
    }
    
}
