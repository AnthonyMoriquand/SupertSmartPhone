package com.example.anthony.projet_supersmartphone.Vue;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View.OnClickListener;

import com.example.anthony.projet_supersmartphone.Controleure.LoginControleur;
import com.example.anthony.projet_supersmartphone.R;

public class LoginActivity extends AppCompatActivity
{
    private Button btn_valider;
    private Button btn_quit;
    private EditText log;
    private EditText pass;
    private AppCompatActivity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        activity = this;
        // on recupere l'instance du bouton valider
        btn_valider = (Button)findViewById(R.id.btn_valider);

        // on recupere l'instance du bouton quit
        btn_quit = (Button)findViewById(R.id.btn_quit);

        //on recupere l'instance du login
        log = (EditText) findViewById (R.id.txt_login);

        //on recupere l'instance du password
        pass = (EditText) findViewById (R.id.txt_password);

        //on créé le listener du bouton valider
         btn_valider.setOnClickListener(new OnClickListener()
         {
             @Override
             public void onClick(View v)
             {

                 LoginControleur logincont = new LoginControleur();

                 //on recupere le login
                 String login = log.getText().toString();
                 //on recupere le login
                 String password = pass.getText().toString();
                 //on envoit le login et le password au controleure pour se connecter
                 logincont.connexion(login,password);



             }
         });
        //on créé le listener du bouton quiter
        btn_quit.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //on fini l'application
                finish();
                //on quite l'application
                System.exit(0);
            }
        });

    }

    public void messageEreure(String texte)
    {
        Toast.makeText(activity, texte, Toast.LENGTH_SHORT).show();
    }

}
