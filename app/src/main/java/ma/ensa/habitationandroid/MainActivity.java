package ma.ensa.habitationandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText surface;
    private EditText nmbr;
    private CheckBox piscine;
    private Button send;
    private TextView result1,result2,result3;
    private float r1;
    private float r2;
    private float r3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        surface = findViewById(R.id.editTextText3);
        nmbr = findViewById(R.id.editTextText4);
        piscine = findViewById(R.id.checkBox);
        send = findViewById(R.id.button);
        result1=findViewById(R.id.textView6);
        result2=findViewById(R.id.textView7);
        result2=findViewById(R.id.textView7);
        result3=findViewById(R.id.textView8);


       send.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               float surfaceValue = Float.parseFloat(surface.getText().toString());
               float nb = Float.parseFloat(nmbr.getText().toString());
               r1 = surfaceValue * 2;
               r2=nb * 50;
               result1.setText("--impôt de base :"+r1);
               if(piscine.isChecked()){
                   r2=r2+100;
               }
               r3=r1+r2;
               result2.setText("--impôt supplrmentaire :"+r2);
               result3.setText("--impôt total :"+r3);
           }
       });
    }
}
