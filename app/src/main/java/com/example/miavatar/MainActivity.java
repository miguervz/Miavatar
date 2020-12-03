package com.example.miavatar;

import android.media.Image;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity implements DialogNombre.interfaz,DialogSexo.interfaz,DialogRaza.interfaz,DialogClase.interfaz,DialogClase.interfaz2,DialogClase.interfaz3,DialogRaza.interfaz2,DialogSexo.interfaz2 {
    DialogNombre dialogNombre;
    Button b;
    EditText nombre2;
    EditText sexo;
    EditText raza;
    EditText clase;
    TextView text;
    EditText vida;
    EditText fuerza;
    EditText Magia;
    EditText velocidad;
    ImageView imageview;
    ImageView imageview2;
 Boolean isChecked=false;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre2 = findViewById(R.id.nombreTexto);
        sexo= findViewById(R.id.sexoTexto);
        raza= findViewById(R.id.razaTexto);
        imageview = findViewById(R.id.imageView);
        imageview2 =findViewById(R.id.imageView2);
        clase= findViewById(R.id.claseTexto);
        vida= findViewById(R.id.editVida);
        fuerza= findViewById(R.id.editFuerza);
        Magia= findViewById(R.id.editMagia);
        velocidad= findViewById(R.id.editVelocidad);
        imageview2.setImageResource(R.drawable.incognita);
text=findViewById(R.id.textView);
text.setText("");

        imageview.setImageResource(R.drawable.desconocidopj);
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

          else{
text.setText(nombre2.getText());
                  if(sex.equals("Hembra")&&raz.equals("Elfo")) {
                     imageview.setImageResource(R.drawable.elfa);
                      if(clas.equals("Arquero")){
                          imageview2.setImageResource(R.drawable.arquero);
                      }
                      else if(clas.equals("Guerrero")){
                          imageview2.setImageResource(R.drawable.guerrrero);

                      }
                      else  if(clas.equals("Mago")){
                          imageview2.setImageResource(R.drawable.mago);

                      }
                      else if(clas.equals("Herrero")){
                          imageview2.setImageResource(R.drawable.herrero);

                      }
                      else if(clas.equals("Minero")){
                          imageview2.setImageResource(R.drawable.minero);

                      }
                 }

                  else if(sex.equals("Hembra")&&raz.equals("Hobbit")) {
                     imageview.setImageResource(R.drawable.hobbitf);
                     if(clas.equals("Arquero")){
                         imageview2.setImageResource(R.drawable.arquero);
                     }
                      else if(clas.equals("Guerrero")){
                         imageview2.setImageResource(R.drawable.guerrrero);

                      }
                    else  if(clas.equals("Mago")){
                         imageview2.setImageResource(R.drawable.mago);

                      }
                     else if(clas.equals("Herrero")){
                         imageview2.setImageResource(R.drawable.herrero);

                      }
                     else if(clas.equals("Minero")){
                         imageview2.setImageResource(R.drawable.minero);

                      }

                  }
                  else if(sex.equals("Hembra")&&raz.equals("Humano")) {
                     imageview.setImageResource(R.drawable.humana);
                      if(clas.equals("Arquero")){
                          imageview2.setImageResource(R.drawable.arquero);
                      }
                      else if(clas.equals("Guerrero")){
                          imageview2.setImageResource(R.drawable.guerrrero);

                      }
                      else  if(clas.equals("Mago")){
                          imageview2.setImageResource(R.drawable.mago);

                      }
                      else if(clas.equals("Herrero")){
                          imageview2.setImageResource(R.drawable.herrero);

                      }
                      else if(clas.equals("Minero")){
                          imageview2.setImageResource(R.drawable.minero);

                      }

                  }
                  else if(sex.equals("Hembra")&&raz.equals("Enano")) {
                     imageview.setImageResource(R.drawable.enana);
                      if(clas.equals("Arquero")){
                          imageview2.setImageResource(R.drawable.arquero);
                      }
                      else if(clas.equals("Guerrero")){
                          imageview2.setImageResource(R.drawable.guerrrero);

                      }
                      else  if(clas.equals("Mago")){
                          imageview2.setImageResource(R.drawable.mago);

                      }
                      else if(clas.equals("Herrero")){
                          imageview2.setImageResource(R.drawable.herrero);

                      }
                      else if(clas.equals("Minero")){
                          imageview2.setImageResource(R.drawable.minero);

                      }

                  }
                  else if(sex.equals("Varón")&&raz.equals("Elfo")) {

                     imageview.setImageResource(R.drawable.elfo);
                      if(clas.equals("Arquero")){
                          imageview2.setImageResource(R.drawable.arquero);
                      }
                      else if(clas.equals("Guerrero")){
                          imageview2.setImageResource(R.drawable.guerrrero);

                      }
                      else  if(clas.equals("Mago")){
                          imageview2.setImageResource(R.drawable.mago);

                      }
                      else if(clas.equals("Herrero")){
                          imageview2.setImageResource(R.drawable.herrero);

                      }
                      else if(clas.equals("Minero")){
                          imageview2.setImageResource(R.drawable.minero);

                      }
                  }
                  else if(sex.equals("Varón")&&raz.equals("Humano")) {

                      imageview.setImageResource(R.drawable.humano);
                      if(clas.equals("Arquero")){
                          imageview2.setImageResource(R.drawable.arquero);
                      }
                      else if(clas.equals("Guerrero")){
                          imageview2.setImageResource(R.drawable.guerrrero);

                      }
                      else  if(clas.equals("Mago")){
                          imageview2.setImageResource(R.drawable.mago);

                      }
                      else if(clas.equals("Herrero")){
                          imageview2.setImageResource(R.drawable.herrero);

                      }
                      else if(clas.equals("Minero")){
                          imageview2.setImageResource(R.drawable.minero);

                      }
                  }
                  else if(sex.equals("Varón")&&raz.equals("Enano")) {

                      imageview.setImageResource(R.drawable.enano);
                      if(clas.equals("Arquero")){
                          imageview2.setImageResource(R.drawable.arquero);
                      }
                      else if(clas.equals("Guerrero")){
                          imageview2.setImageResource(R.drawable.guerrrero);

                      }
                      else  if(clas.equals("Mago")){
                          imageview2.setImageResource(R.drawable.mago);

                      }
                      else if(clas.equals("Herrero")){
                          imageview2.setImageResource(R.drawable.herrero);

                      }
                      else if(clas.equals("Minero")){
                          imageview2.setImageResource(R.drawable.minero);

                      }
                  }
                  else if(sex.equals("Varón")&&raz.equals("Hobbit")) {

                      imageview.setImageResource(R.drawable.hobbitm);
                      if(clas.equals("Arquero")){
                          imageview2.setImageResource(R.drawable.arquero);
                      }
                      else if(clas.equals("Guerrero")){
                          imageview2.setImageResource(R.drawable.guerrrero);

                      }
                      else  if(clas.equals("Mago")){
                          imageview2.setImageResource(R.drawable.mago);

                      }
                      else if(clas.equals("Herrero")){
                          imageview2.setImageResource(R.drawable.herrero);

                      }
                      else if(clas.equals("Minero")){
                          imageview2.setImageResource(R.drawable.minero);

                      }
                  }
              Magia.setText(Integer.toString(i1));
              fuerza.setText(Integer.toString(i2));
              velocidad.setText(Integer.toString(i3));
              vida.setText(Integer.toString(i4));


          }}











}

    @Override
    public void checkeadoClase2(Boolean checkeado3) {
        isChecked =checkeado3;
        if (isChecked=true)
        {
            nombre2.setText("");
            clase.setText("");
            raza.setText("");
            sexo.setText("");
            imageview.setImageResource(R.drawable.desconocidopj);
            imageview2.setImageResource(R.drawable.incognita);
            Magia.setText("");
            fuerza.setText("");
            velocidad.setText("");
            vida.setText("");
        }
    }

    @Override
    public void checkeadoClase3(Boolean checkeado2) {
        isChecked =checkeado2;
        if (isChecked=true)
        {
            nombre2.setText("");
            clase.setText("");
            raza.setText("");
            sexo.setText("");
            imageview.setImageResource(R.drawable.desconocidopj);
            imageview2.setImageResource(R.drawable.incognita);
            Magia.setText("");
            fuerza.setText("");
            velocidad.setText("");
            vida.setText("");
        }
    }

    @Override
    public void checkeadoSexo2(Boolean checkeado2) {
        isChecked =checkeado2;
        if (isChecked=true)
        {

            nombre2.setText("");
            clase.setText("");
            raza.setText("");
            sexo.setText("");
            imageview.setImageResource(R.drawable.desconocidopj);
            imageview2.setImageResource(R.drawable.incognita);
            Magia.setText("");
            fuerza.setText("");
            velocidad.setText("");
            vida.setText("");
        }
    }
}







