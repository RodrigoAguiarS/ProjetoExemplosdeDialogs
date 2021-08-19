package com.example.projetoexemplosdedialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class SimpleDialogFragment extends DialogFragment implements DialogInterface.OnClickListener {
    @NonNull

    @Override
    public Dialog onCreateDialog(@Nullable  Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());

        builder.setTitle("Escolha uma linguagem").setItems(R.array.Linguagens, this);
        return builder.create();



    }

    @Override
    public void onClick(DialogInterface dialog, int i) {
        String[] linguagens = getContext().getResources().getStringArray(R.array.Linguagens);

        String linguagem = linguagens[i];
        Toast.makeText(getContext(), linguagem, Toast.LENGTH_SHORT).show();


    }
}
