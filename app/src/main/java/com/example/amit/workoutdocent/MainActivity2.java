
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
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity2 extends AppCompatActivity {

  RelativeLayout r1;
    EditText eml,pswd;
    Button login;
    private FirebaseAuth firebaseAuth;
    private ProgressDialog progressDialog;
    boolean doubleBackToExitPressedOnce = false;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        r1=(RelativeLayout)findViewById(R.id.activity_main_of_login);
        progressDialog= new ProgressDialog(this);
        firebaseAuth= FirebaseAuth.getInstance();
        eml=(EditText)findViewById(R.id.username);
        pswd=(EditText)findViewById(R.id.password);
        login=(Button)findViewById(R.id.loginbtn);

        if(firebaseAuth.getCurrentUser()!=null)
        {
            finish();
            Intent i= new Intent(getApplicationContext(),MainActivity.class);
            i.putExtra("userid",firebaseAuth.getCurrentUser().getEmail().toString());

            startActivity(i);
        }
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userlogin();
            }
        });



    }

    private void userlogin()
    {
        final String email=eml.getText().toString().trim();
        String password=pswd.getText().toString().trim();
        if(TextUtils.isEmpty(email))
        {
            Toast.makeText(this, "fill the email", Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(password))

        {
            Toast.makeText(this, "fill the password", Toast.LENGTH_SHORT).show();
            return;
        }
        progressDialog.setMessage("signing in user...");
        progressDialog.show();
        firebaseAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                progressDialog.dismiss();
                if(task.isSuccessful())
                {

                    finish();
                   // userid.setText(email);
                    Intent i= new Intent(getApplicationContext(),MainActivity.class);
                    i.putExtra("userid",email);
                    startActivity(i);
                }
            }
        });
    }



    /*public void click(View v)
    {
        Intent i= new Intent(MainActivity2.this,Withoutequipment.class);
        startActivity(i);
    }*/


    public void  signup(View v)
    {
       // r1.setVisibility(View.GONE);
       Intent intent= new Intent(MainActivity2.this,Signup.class);
        startActivity(intent);
    }

    public void touchtoskiplogin(View v)
    {

        Intent i= new Intent(MainActivity2.this,MainActivity.class);
        i.putExtra("userid","login here");

        startActivity(i);

    }

    protected void onResume() {
        super.onResume();
        // .... other stuff in my onResume ....
        this.doubleBackToExitPressedOnce = false;
    }

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "press once again to exit", Toast.LENGTH_SHORT).show();
    }
}
