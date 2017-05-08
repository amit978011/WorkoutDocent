
package com.example.amit.workoutdocent;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by bikram on 2/24/2017.
 */

public class Signup extends AppCompatActivity
{
    EditText  eml,pswd,cnfrmpswd;
    Button signup;
    private ProgressDialog progressDialog;
    private FirebaseAuth firebaseAuth;
    TextView t1;
    ImageView im;
    public void onCreate(Bundle bn)
    {
        super.onCreate(bn);
        setContentView(R.layout.signup);
        eml=(EditText)findViewById(R.id.email);
        signup=(Button)findViewById(R.id.signup);
        pswd=(EditText)findViewById(R.id.password);
        cnfrmpswd=(EditText)findViewById(R.id.confirmpassword);
        firebaseAuth=FirebaseAuth.getInstance();
        progressDialog = new ProgressDialog(this);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registeruser();
            }
        });
        t1=(TextView)findViewById(R.id.text1);
        t1.setText("Sign up");
        im=(ImageView)findViewById(R.id.back);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }

    private void registeruser() {
        String email = eml.getText().toString().trim();
        String password = pswd.getText().toString().trim();
        String confirmpassword = cnfrmpswd.getText().toString().trim();

        if (TextUtils.isEmpty(email)) {
            Toast.makeText(this, "fill the email", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(password)) {
            Toast.makeText(this, "fill the password", Toast.LENGTH_SHORT).show();
            return;
        }

        if (!isValidEmail(email)) {// not expression (!) in if..shows creates a boolean method..//
            eml.setError("Enter Email in proper format");
        }
        else if (!isPasswordValid(password)) {
            pswd.setError("password length should be greater than 6 character");
        }
        else {
            if (confirmpassword.equals(password)) {
                progressDialog.setMessage("registering user...");
                progressDialog.show();
                firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            progressDialog.dismiss();
                            Intent i = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(i);
                            Toast.makeText(Signup.this, "sucess", Toast.LENGTH_SHORT).show();
                            finish();

                        } else {
                            progressDialog.dismiss();
                            Toast.makeText(Signup.this, "fails", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            } else {
                Toast.makeText(this, "your pasword is not same", Toast.LENGTH_LONG).show();
            }
        }
    }
    private boolean isPasswordValid(String psswd) {

        if(psswd != null && psswd.length() > 6) {
            return true;
        }
        return false;

    }

    private boolean isValidEmail(String emailAdd) {
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(emailAdd);
        return matcher.matches();  // matches is a boolean method returning boolean value // returning this value make the condition true
        // so it will not show error
    }

}

