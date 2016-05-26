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

    //constructeur vide
    public User()
    {
    }
    //construteure pour créé un nouvelle utilisateure
    public User(String log, String pass, String nom, String pren, String mail)
    {
        //on fait appelle au diferent setteur pour créé le nouvelle utilisateure
        this.setLogin(log);
        this.setPassword(pass);
        this.setNom(nom);
        this.setPrenom(pren);
        this.setMail(mail);
        //on ajoute l'utilisateur en base
        User.save(this);
    }
// ---------------------------------acesseure----------------------------------------------------------------------
    //permet de recuperer le login du user
    public String getLogin()
    {
        return login;
    }

    // instatiation ou mise a jour du login de l'utilisateur
    public void setLogin(String login)
    {
        this.login = login;
    }

    //permet de recuperer le mot de passe du user
    public String getPassword()
    {
        return password;
    }

    // instatiation ou mise a jour du mot de passe de l'utilisateur
    public void setPassword(String password)
    {
        this.password = password;
    }

    //permet de recuperer le nom du user
    public String getNom()
    {
        return nom;
    }

    // instatiation ou mise a jour du nom de l'utilisateur
    public void setNom(String nom)
    {
        this.nom = nom;
    }

    //permet de recuperer le prenom du user
    public String getPrenom()
    {
        return prenom;
    }

    // instatiation ou mise a jour du prenom de l'utilisateur
    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }

    //permet de recuperer le mail du user
    public String getMail()
    {
        return mail;
    }

    // instatiation ou mise a jour du mail de l'utilisateur
    public void setMail(String mail)
    {
        this.mail = mail;
    }

//------------------------------------------------------------methode de recherche en base----------------------------------------------------------
    //methode permetant de recuperer tout les utilisateure qui on le login que lui a passer en parametre
    public List<User> getAll(String log)
    {
        //on cherche l'utilisateure qui se login et on le renvoie
        return User.find(User.class, "login = ? ", log) ;
    }
//-----------------------------------------------------------methode d'update des information de l'utilisateure---------------------------------------

    //methode permetant a d'enregistrer les information qui on changer  d'un utilisateure
    public User majInfo(User use, String pass, String nom, String pren, String mail)
    {
        //on regarde si le mot de passe de l'utilisateure et le maime que celui recuperer
        if(use.getPassword() != pass)
        {
            use.setPassword(pass);
        }
        //on regarde si le nom de l'utilisateure et le maime que celui recuperer
        else if(use.getNom() != nom)
        {
            use.setNom(nom);
        }
        //on regarde si le prenom de l'utilisateure et le maime que celui recuperer
        else if(use.getPrenom() != pren)
        {
            use.setPrenom(pren);
        }
        //on regarde si le mail de l'utilisateure et le maime que celui recuperer
        else if (use.getMail()!= mail)
        {
            use.setMail(mail);
        }
        //on enregistre le information de l'utilisateur qui on changer en base
        User.save(use);

        //on retourne l'utilisateure avec les nouvelle information
        return use;
    }
}
