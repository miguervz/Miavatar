package com.example.miavatar;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

public class DialogRaza extends AppCompatDialogFragment {
    DialogRaza.interfaz dialogInterface;
    Spinner raza;
    String razaSeleccionada;
    interfaz2 dialogInterface2;


    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_raza, null);

        raza =(Spinner) view.findViewById(R.id.spinner);
        razaSeleccionada=(String) raza.getSelectedItem();
        raza.setSelection(0);

        builder.setView(view);
        builder.setTitle("Eliga su raza:")
                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch (raza.getSelectedItemPosition()) {

                            case 0:
                                dialogInterface.textoRaza("Elfo");
                                break;

                            case 1:

                                dialogInterface.textoRaza("Enano");
                                break;
                            case 2:

                                dialogInterface.textoRaza("Hobbit");
                                break;
                            case 3:

                                dialogInterface.textoRaza("Humano");
                                break;

                            default:
                                break;


                        }



                        DialogClase dialogoClase = new DialogClase();
                        dialogoClase.show(getFragmentManager(), "claseAvatar");

                        dialog.dismiss();


                    }
                })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                       dialogInterface2.checkeadoClase3(true);
                        dialog.dismiss();

                    }
                });


        return builder.create();
    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        dialogInterface=(DialogRaza.interfaz) context;
        dialogInterface2=(DialogRaza.interfaz2) context;

    }

    public interface interfaz{
        void textoRaza (String text4);

    }
    public interface interfaz2{
        void checkeadoClase3 (Boolean checkeado2);

    }
}