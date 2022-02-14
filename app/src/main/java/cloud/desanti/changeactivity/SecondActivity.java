package cloud.desanti.changeactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView txt = findViewById(R.id.txtReceiver);
        Bundle extra  = getIntent().getExtras();

        txt.setText((String) extra.getSerializable("message"));
    }
}