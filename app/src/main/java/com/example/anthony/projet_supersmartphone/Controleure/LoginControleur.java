package com.example.anthony.projet_supersmartphone.Controleure;

import com.example.anthony.projet_supersmartphone.Model.User;
import com.example.anthony.projet_supersmartphone.Vue.LoginActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anthony on 08/04/2016.
 */
public class LoginControleur
{
    public void connexion(String log, String pass)
    {
        // variable
        User user = new User();
        LoginActivity login = new LoginActivity();
        List<User> use = new ArrayList<>();
        boolean ok = false;

        //on recupere la liste des user qui on se login normalement il doit y en avoir un seule
        use = user.getAll(log);

        //on verfie avec la base que l'utilisateure
        if (use.isEmpty())
        {
            login.messageEreure("le login ou le password n'est pas valide");
        }
        else
        {
            //on parcour la liste des utilisateure qui on se login
            for (int i = 0; i<use.size();i++)
            {
                //on verrifie que le mot de passe et le maime que celui en base
                if((use.get(i).getPassword() == pass))
                {
                    ok = true;
                }
            }

            //si le mot de passe et le maime on envoie verre la page si non on afficher un message d'erreure
            if (ok=true)
            {
                //on renvoie verre la page de login
            }
            else
            {
                login.messageEreure("le login ou le password n'est pas valide");
            }
        }




    }
}
