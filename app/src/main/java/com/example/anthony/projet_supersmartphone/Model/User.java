package com.example.anthony.projet_supersmartphone.Model;
import android.provider.ContactsContract;

import com.orm.SugarRecord;

import java.util.List;

/**
 * Created by Anthony on 08/04/2016.
 */
public class User extends SugarRecord
{
    private String login;
    private String password;
    private String nom;
    private String prenom;
    private String mail;

    public User()
    {
    }

    public User(String log, String pass, String nom, String pren, String mail)
    {
        this.login=log;
        this.password=pass;
        this.nom=nom;
        this.prenom=pren;
        this.mail=mail;
        User.save(this);
    }
// ---------------------------------acesseure----------------------------------------------------------------------
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public List<User> getLoginPassword(String log, String pass)
    {
       return User.find(User.class, "login = ? and password = ?", log, pass) ;
    }

}
