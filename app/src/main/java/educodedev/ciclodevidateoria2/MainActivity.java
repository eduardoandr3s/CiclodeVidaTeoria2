package educodedev.ciclodevidateoria2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button btnAbrir;

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("ESTADOS", "6 - Estoy en onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ESTADOS", "5 - Estoy en onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ESTADOS", "4 - Estoy en onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ESTADOS", "3 - Estoy en onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("ESTADOS", "2 - Estoy en onStart");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Log.e("ESTADOS", "1 - Estoy en onCreate");

        btnAbrir = findViewById(R.id.btnAbrirMain); //Se inicializa el botón y después se crea una funcionalidad
        btnAbrir.setOnClickListener(new View.OnClickListener() {      // Aquí se crea la funcionalidad
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class); //Esto permite que vayamos de una activity a otra
                startActivity(intent); // Para iniciar la ejecución
            }
        });


    }
}