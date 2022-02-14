package cloud.desanti.changeactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView txt = findViewById(R.id.txtReceiver);
        Bundle extra = getIntent().getExtras();

        txt.setText((String) extra.getSerializable("message"));

        Button btn = findViewById(R.id.btnReponse);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ia2 = new Intent();

                EditText et = findViewById(R.id.edReponse);
                ia2.putExtra("dataRe", et.getText().toString() );

                setResult(6, ia2);

                finish();
            }
        });
    }


}