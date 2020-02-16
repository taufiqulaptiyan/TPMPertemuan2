package daisy.tpm2intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

public class Activitykedua extends AppCompatActivity {
private Button btn_perkalian;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitykedua);

        TextView tv_kata=findViewById(R.id.tv_kata);
        btn_perkalian=findViewById(R.id.btn_perkalian);

        Bundle bundle=getIntent().getExtras();
        String nama=bundle.getString("name");
        String kata="Hello "+nama+" ! :)";
        //String kata="Hello";
        tv_kata.setText(kata);

        btn_perkalian.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent2=new Intent(getApplicationContext(),Activityperkalian.class);
                startActivity(intent2);

            }
        });
    }
}
