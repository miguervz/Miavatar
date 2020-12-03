package com.example.miavatar;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.DialogFragment;

public class DialogSexo extends AppCompatDialogFragment {
    interfaz dialogInterface;
    RadioButton femaleButton;
    RadioButton maleButton;
    interfaz2 dialogInterface2;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState){
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());


        LayoutInflater inflater =getActivity().getLayoutInflater();


        View view = inflater.inflate(R.layout.dialog_sexo,null);
        femaleButton = view.findViewById(R.id.rbHembra);
        maleButton = view.findViewById(R.id.rbMacho);
        builder.setView(view);
        builder.setTitle("Seleccione el sexo de su avatar:")
                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {



                        if(maleButton.isChecked()){

                            String textTwo="Varón";
                            dialogInterface.textoSexo(textTwo);

                        }
                        else{

                            String textTwo="Hembra";
                            dialogInterface.textoSexo(textTwo);

                        }

                        DialogRaza dialogoRaza = new DialogRaza();
                        dialogoRaza.show(getFragmentManager(), "RazaAvatar");
                        dialog.dismiss();

                    }
                })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                       dialogInterface2.checkeadoSexo2(true);
                        dialog.dismiss();
                    }
                });
        return builder.create();

    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        dialogInterface=(DialogSexo.interfaz) context;
        dialogInterface2=(DialogSexo.interfaz2) context;

    }

    public interface interfaz{
        void textoSexo(String textTwo);

    }
    public interface interfaz2{
        void checkeadoSexo2 (Boolean checkeado2);

    }
}

