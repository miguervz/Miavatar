package com.example.miavatar;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import android.widget.Spinner;
import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

public class DialogClase extends AppCompatDialogFragment {
    interfaz dialogInterface;
    interfaz2 dialogInterface2;
    interfaz3 dialogInterface3;

    Spinner clase;
    String claseSeleccionada;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());


        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_clase, null);

        clase =view.findViewById(R.id.spinner2);

        claseSeleccionada=(String)clase.getSelectedItem();

        builder.setView(view);
        builder.setTitle("Eliga su clase:")
                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {


                        switch (clase.getSelectedItemPosition()) {

                            case 0:
                                dialogInterface.textoClase("Arquero");
                                break;

                            case 1:

                                dialogInterface.textoClase("Guerrero");
                                break;
                            case 2:

                                dialogInterface.textoClase("Mago");
                                break;
                            case 3:

                                dialogInterface.textoClase("Herrero");
                                break;
                            case 4:

                                dialogInterface.textoClase("Minero");
                                break;

                            default:
                                break;


                        }

                        dialogInterface2.checkeadoClase(true);
                        dialog.dismiss();


                    }
                })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialogInterface3.checkeadoClase2(true);
                        dialog.dismiss();

                    }
                });


        return builder.create();
    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        dialogInterface=(DialogClase.interfaz) context;
        dialogInterface2 = (interfaz2) context;
        dialogInterface3 = (interfaz3) context;

    }

    public interface interfaz{
        void textoClase (String text4);

    }
    public interface interfaz2{
        void checkeadoClase (Boolean checkeado);

    }
    public interface interfaz3{
        void checkeadoClase2 (Boolean checkeado3);

    }

}