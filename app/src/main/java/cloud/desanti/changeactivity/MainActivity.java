package cloud.desanti.changeactivity;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private EditText etMessage;
    private int idActivity2 = 77;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etMessage = findViewById(R.id.etMessage);


        getBaseContext();
        btn = findViewById(R.id.btnAct2);

        btn.setOnClickListener(view -> {
            Intent act2 = new Intent(getApplicationContext(), SecondActivity.class);
            act2.putExtra("message", etMessage.getText().toString());
            startActivityForResult(act2,idActivity2);


        });

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == idActivity2 && resultCode == 6) {
            TextView vv = findViewById(R.id.textView2);

            vv.setText(requestCode + " a répondu " + resultCode + " et message : "+ data.getSerializableExtra("dataRe"));
        }
    }
}