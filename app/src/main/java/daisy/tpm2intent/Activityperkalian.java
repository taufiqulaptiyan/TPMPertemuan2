package daisy.tpm2intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activityperkalian extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityperkalian);

        final EditText et_angka1=findViewById(R.id.et_angka1);
        final EditText et_angka2=findViewById(R.id.et_angka2);
        Button btn_hasil=findViewById(R.id.btn_hasil);
        Button btn_hapus=findViewById(R.id.btn_hapus);
        final TextView tv_hasil=findViewById(R.id.tv_hasil);

        btn_hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1=et_angka1.getText().toString();
                    String s2=et_angka2.getText().toString();
                    double angka1=Double.parseDouble(s1);
                    double angka2=Double.parseDouble(s2);

                    double hasil=angka1*angka2;
                    String hasils=String.valueOf(hasil);
                    tv_hasil.setText(hasils);

                }catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_angka1.setText("");
                et_angka2.setText("");
                tv_hasil.setText("0");
            }
        });
    }
}
