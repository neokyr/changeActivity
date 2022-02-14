package cloud.desanti.changeactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private EditText etMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etMessage = findViewById(R.id.etMessage);
        //Intent act2 = new Intent(getApplicationContext(), SecondActivity.class);
        Intent act2 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.qwant.fr"));


        getBaseContext();
        btn = findViewById(R.id.btnAct2);

        btn.setOnClickListener(view -> {

            act2.putExtra("message", etMessage.getText().toString());
            startActivity(act2);

        });

    }
}