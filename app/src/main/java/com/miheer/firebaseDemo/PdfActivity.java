package com.miheer.firebaseDemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class PdfActivity extends AppCompatActivity {

    private Button btnPdfSelecter, upload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);

        init();

        btnPdfSelecter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void init() {

        btnPdfSelecter = findViewById(R.id.btnPdfSelecter);
        upload = findViewById(R.id.upload);

        StorageReference storageReference = FirebaseStorage.getInstance().getReference()
    }


}