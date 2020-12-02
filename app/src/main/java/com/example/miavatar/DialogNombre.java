package com.example.miavatar;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

public class DialogNombre extends AppCompatDialogFragment {
    interfaz dialogInterface;
    EditText tNombre;

    EditText edtOne;
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState){
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());


        LayoutInflater inflater =getActivity().getLayoutInflater();


View view = inflater.inflate(R.layout.dialog_nombre,null);

builder.setView(view);
        builder.setTitle("Introduzca el nombre de su avatar:")
                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        try {
                            tNombre=getActivity().findViewById(R.id.editText1);
                            String textOne=edtOne.getText().toString();
                            dialogInterface.textoNombre(textOne);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        DialogSexo dialogoSexo = new DialogSexo();
                        dialogoSexo.show(getFragmentManager(), "SexoAvatar");

                        dialog.dismiss();



                    }
                })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();

                    }
                });

        edtOne=view.findViewById(R.id.editText1);
        return builder.create();


    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        dialogInterface=(interfaz) context;

    }

    public interface interfaz{
        void textoNombre(String textOne);

}
}
