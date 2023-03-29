package app.mobile.asianpay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class login_activity extends AppCompatActivity {

    Button forgetBtn;
    Button Register;
    Button loginBtn;
    TextInputEditText username;
    TextInputEditText password;

    String userName;
    String userPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginBtn =  findViewById(R.id.loginBtn);
        forgetBtn =  findViewById(R.id.forgetBtn);
        Register =  findViewById(R.id.Register);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(login_activity.this, "Login clicked", Toast.LENGTH_SHORT).show();
            }
        });
        forgetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(login_activity.this, "forgrt clicked", Toast.LENGTH_SHORT).show();
            }
        });
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(login_activity.this, "Register clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}