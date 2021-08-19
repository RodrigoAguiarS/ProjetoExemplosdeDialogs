package com.example.projetoexemplosdedialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class MultipleDialogFragment extends DialogFragment implements DialogInterface.OnMultiChoiceClickListener {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable  Bundle savedInstanceState) {
        boolean[] checkeds = {false, true, false, true, false, false};



        return new AlertDialog.Builder(getContext()).setTitle("Escolha uma ou mais linguagens")
                .setMultiChoiceItems(R.array.Linguagens, checkeds, this ).create();
    }

    @Override
    public void onClick(DialogInterface dialog, int i, boolean b) {
        String[] linguagens = getContext().getResources().getStringArray(R.array.Linguagens);
        String linguagem = linguagens[i];

        if (b){
            Toast.makeText(getContext(),"Você marcou a linguagem"+linguagem, Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(getContext(),"Você desmarcou a linguagem"+linguagem, Toast.LENGTH_SHORT).show();
        }

    }
}
