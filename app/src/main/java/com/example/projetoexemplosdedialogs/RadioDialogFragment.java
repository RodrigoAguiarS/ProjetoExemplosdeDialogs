package com.example.projetoexemplosdedialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class RadioDialogFragment extends DialogFragment implements DialogInterface.OnClickListener {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        return new AlertDialog.Builder(getContext())
                .setTitle("Escolha Linguagem")
                .setSingleChoiceItems(R.array.Linguagens, 2, this).create();
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
        String[] linguagens = getContext().getResources().getStringArray(R.array.Linguagens);
        String linguagem = linguagens[i];

        Toast.makeText(getContext(), linguagem, Toast.LENGTH_SHORT).show();


    }
}
