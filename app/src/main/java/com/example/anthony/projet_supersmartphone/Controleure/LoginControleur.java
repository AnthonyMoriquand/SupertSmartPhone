package com.example.anthony.projet_supersmartphone.Controleure;

import android.widget.Toast;

import com.example.anthony.projet_supersmartphone.Model.User;
import com.example.anthony.projet_supersmartphone.Vue.LoginActivity;

/**
 * Created by Anthony on 08/04/2016.
 */
public class LoginControleur
{
    public void connexion(String log, String pass)
    {
        User user = new User();
        LoginActivity login = new LoginActivity();

        //on verfie avec la base que l'utilisateure et le mot de passe existe
        if (user.getLoginPassword(log,pass).isEmpty())
        {
            login.messageEreure("le login ou le password n'est pas valide");
        }
        else
        {

        }




    }
}
