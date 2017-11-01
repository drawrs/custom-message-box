package com.khilman.www.custommessagebox;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // deklarasi
    Button btn_toast, btn_alert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // inisialisasi
        btn_toast = (Button) findViewById(R.id.btn_toast);
        btn_alert = (Button) findViewById(R.id.btn__alert);

//        btn_toast.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
    }

    public void tampilAlert(View view){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);

        // buat inflater
        LayoutInflater inflater = getLayoutInflater();
        view = inflater.inflate(R.layout.tampilan_alert, null);

        // inisialisasi widget
        TextView alert_pesan = (TextView) view.findViewById(R.id.alert_pesan);
        // set text widget

        alert_pesan.setText("Android adalah sistem operasi Mobile dari Google");
        // set tampilan alert dialog dengan layout iflater
        alert.setView(view);

        // set judul
        alert.setTitle("Info");
        // set pesanya
        //alert.setMessage("Alert dialog adalah sebuah tampilan dialog yang digunakan untuk informasi");
        // buat 1 button
        alert.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
            }
        });
        // tampilkan alert dialog
        alert.show();
    }

    public void tampilToast(View view) {
        //Toast.makeText(this, "Ini adalah toast", Toast.LENGTH_SHORT).show();
        Toast toast = new Toast(MainActivity.this);

        // buat inflater
        LayoutInflater inflater = getLayoutInflater();
        view = inflater.inflate(R.layout.tampilan_toast, null);

        // dapatkan widgetnya
        TextView pesan_toast = (TextView) view.findViewById(R.id.toast_text);
        // set pesannya
        pesan_toast.setText("Aku custom toast!");
        /// set view ke toast
        toast.setView(view);

        toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.BOTTOM, 0,10);
        // set duari tampil
        toast.setDuration(Toast.LENGTH_SHORT);
        // tampilkan
        toast.show();
    }
}
