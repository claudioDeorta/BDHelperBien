package com.example.claudio.bdhelperbien;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // aqui instanciamos el constructor de la clase DataBaseMAnager para crear el helper y db que es el ojeto SQLite en escritura
        DateBaseManager manager = new DateBaseManager(this);

    }
}
