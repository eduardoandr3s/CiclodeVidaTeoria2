package educodedev.ciclodevidateoria2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);
        Log.e("ESTADOS", "1 - Estoy en onCreate de la segunda");


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("ESTADOS", "6 - Estoy en onDestroy de la segunda");
        startActivity(new Intent(SecondActivity.this, SecondActivity.class));
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ESTADOS", "5 - Estoy en onStop de la segunda");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ESTADOS", "4 - Estoy en onPause de la segunda");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ESTADOS", "3 - Estoy en onResume de la segunda");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("ESTADOS", "2 - Estoy en onStart de la segunda");
    }
}