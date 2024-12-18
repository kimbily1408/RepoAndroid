package fisei.uta.edu.app_00;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import fisei.uta.edu.app_00.utils.Mathematics;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText editText1;
    private EditText editText2;
    private TextView textViewResult;
    private Button buttonSumar;
    private Button buttonRestar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.Button_Restar), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //obtener las referencias de memoria donde estan los controles visuales del GUI
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        textViewResult = findViewById(R.id.textViewResult);
        buttonSumar = findViewById(R.id.buttonSumar);
        buttonRestar = findViewById(R.id.Button_Restar);

        //rear el boton restar
        buttonRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText1.getText().toString().isEmpty() || editText2.getText().toString().isEmpty()) {
                    textViewResult.setText("Ingrese los valores en el campo 1 y 2");
                    return;
                }
                String x = editText1.getText().toString();
                String y = editText2.getText().toString();

                int a = Integer.parseInt(x);
                int b = Integer.parseInt(y);

                int c = a - b;
                textViewResult.setText(String.valueOf(c));

            }
        });
    }

    public void Onclic_add(View view) {
        String x = editText1.getText().toString();
        String y = editText2.getText().toString();

        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);

        int c = a + b;
        String result = String.valueOf(c);

        textViewResult.setText(result);
    }

    public void Onclic_multiplicar(View view) {
        String x = editText1.getText().toString();
        String y = editText2.getText().toString();

        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);

        int c = a * b;
        String result = String.valueOf(c);

        textViewResult.setText(result);
    }
    public void Onclic_factorial(View view) {
        String x = editText1.getText().toString();
        int a = Integer.parseInt(x);

        Mathematics math = new Mathematics();
        long c= math.Factorial(a);
        String result = String.valueOf(c);
        textViewResult.setText(result);
    }
}