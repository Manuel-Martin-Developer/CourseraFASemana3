package manuelmartin.courseraandroid1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton = findViewById(R.id.button);

        boton.setOnClickListener(v -> {
            Toast toast = Toast.makeText(this, R.string.mensaje, Toast.LENGTH_LONG);
            toast.show();
        });
    }


}