package com.example.miavatar;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity implements DialogNombre.interfaz,DialogSexo.interfaz,DialogRaza.interfaz,DialogClase.interfaz,DialogClase.interfaz2 {
    DialogNombre dialogNombre;
    Button b;
    EditText nombre2;
    EditText sexo;
    EditText raza;
    EditText clase;
    EditText vida;
    EditText fuerza;
    EditText Magia;
    EditText velocidad;
 Boolean isChecked=false;
    Toast toast1;
int rndm1;
int rndm2;
    int rndm3;
int rndm4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre2 = findViewById(R.id.nombreTexto);
        sexo= findViewById(R.id.sexoTexto);
        raza= findViewById(R.id.razaTexto);
        clase= findViewById(R.id.claseTexto);
        vida= findViewById(R.id.editVida);
        fuerza= findViewById(R.id.editFuerza);
        Magia= findViewById(R.id.editMagia);
        velocidad= findViewById(R.id.editVelocidad);
        nombre2.setText("");
        sexo.setText("");
        clase.setText("");
        raza.setText("");
        fuerza.setText("");
        Magia.setText("");
        velocidad.setText("");
        vida.setText("");
        isChecked=false;


        b = findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                if (View.getId() == R.id.button2) {
                    dialogNombre = new DialogNombre();
                    dialogNombre.show(getSupportFragmentManager(), "Introduzca el nombre de su avatar:");
                }

            }
        });

  }



    @Override
    public void textoNombre(String textOne) {
        nombre2.setText(textOne);
    }



    @Override
    public void textoSexo(String textTwo) {
        sexo.setText(textTwo);

    }

    @Override
    public void textoRaza(String textThree) {
        raza.setText(textThree);
    }

    @Override
    public void textoClase(String text4) {
        clase.setText(text4);
    }


    @Override
    public void checkeadoClase(Boolean checkeado) {
         isChecked = checkeado;

        String nomb=nombre2.getText().toString();
        String sex=sexo.getText().toString();
        String raz=raza.getText().toString();
        String clas=clase.getText().toString();
        Random r = new Random();
        int i1 = r.nextInt(10 - 0)+1;
        int i2 = r.nextInt(20 - 0)+1;
        int i3 = r.nextInt(5 - 0)+1;
        int i4 = r.nextInt(100 - 0)+1;


      if (isChecked=true) {

          if (nomb.equals("")||sex.equals("")||raz.equals("")||clas.equals("")) {

              Toast.makeText(getApplicationContext(),"Faltan campos por rellenar.",Toast.LENGTH_SHORT).show();
          }
          else  {

              Magia.setText(Integer.toString(i1));
              fuerza.setText(Integer.toString(i2));
              velocidad.setText(Integer.toString(i3));
              vida.setText(Integer.toString(i4));
          }


      }








}}







